package task1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Stream;

public class TableDisplay extends JPanel
{
    private JTable table;
    private static final String fileName = "file.csv";

    public TableDisplay() {
        super(new BorderLayout(10, 10));
        this.table = new JTable();
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jPanel, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void loadTableData() {
        this.table = readCSVDataAndSetData();
        this.table.setPreferredScrollableViewportSize(new Dimension(700, 70));
        this.table.setFillsViewportHeight(true);
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jPanel, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private JTable readCSVDataAndSetData() {
        return new JTable(createTableModel());
    }

    public static DefaultTableModel createTableModel() {
        DefaultTableModel model = null;
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            Vector<Vector<Object>> rows = new Vector<>();
            stream.forEach(s -> rows.add(new Vector<>(Arrays.asList(s.split("\\s*,\\s*", -1)))));
            Vector<Object> headers = rows.remove(0);
            model = new DefaultTableModel(rows, headers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
}

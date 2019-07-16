package task1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TableDisplay extends JPanel
{
    private JTable table;
    private static final String fileName = "TestSheet.csv";

    public TableDisplay() {
        super(new BorderLayout(3, 3));
        this.table = new JTable();
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jPanel, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void loadTableData()
    {
        this.table = readCSVDataAndSetData();
        this.table.setPreferredScrollableViewportSize(new Dimension(700, 70));
        this.table.setFillsViewportHeight(true);
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jPanel, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private JTable readCSVDataAndSetData()
    {
        CsvReader csvReader = new CsvReader();
        File DataFile = new File(fileName);
        java.util.List<java.util.List<String>> readData = csvReader.readCSVFile(DataFile);
        return new JTable(new TableModel(readData));
    }
}

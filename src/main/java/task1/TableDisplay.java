package task1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class TableDisplay extends JPanel
{
    private final JTable table;

    public TableDisplay() {
        super(new BorderLayout(3, 3));
        this.table = new JTable(new TableModel());
        this.table.setPreferredScrollableViewportSize(new Dimension(700, 70));
        this.table.setFillsViewportHeight(true);
        JPanel ButtonOpen = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(ButtonOpen, BorderLayout.SOUTH);
        // Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        // Add the scroll pane to this panel.
        add(scrollPane, BorderLayout.CENTER);
        // add a nice border
        setBorder(new EmptyBorder(5, 5, 5, 5));
        CsvReader Rd = new CsvReader();
        TableModel NewModel = new TableModel();
        this.table.setModel(NewModel);
        File DataFile = new File("res.csv");
        ArrayList<String[]> Rs2 = Rd.ReadCSVfile(DataFile);
        NewModel.AddCSVData(Rs2);
        System.out.println("Rows: " + NewModel.getRowCount());
        System.out.println("Cols: " + NewModel.getColumnCount());
    }
}

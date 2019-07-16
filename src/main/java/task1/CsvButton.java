package task1;

import javax.swing.*;

public class CsvButton extends JButton
{
    private TableDisplay tableDisplay = new TableDisplay();

    public CsvButton()
    {
        super("CSV button");
        this.addActionListener(e -> tableDisplay.loadTableData());
    }

    public TableDisplay getTableDisplay()
    {
        return tableDisplay;
    }
}

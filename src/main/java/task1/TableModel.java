package task1;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Optional;

public class TableModel extends AbstractTableModel {
    private List<List<String>> data;

    public TableModel(List<List<String>> data)
    {
        this.data = data;
        this.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return Optional.of(data.get(0).size()).orElse(0);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int col) {
        return Integer.toString(col);
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data.get(row).get(col);
    }
}

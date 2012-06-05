package pkgInterface;

import javax.swing.table.AbstractTableModel;
import pkgData.cBinaryTreeMethods;

public class bPersonTableModel extends AbstractTableModel {

    private String[] columnNames = {"Id", "Name", "Lastname", "Phone", "Address"};
    private Object[][] peopleData;

    public bPersonTableModel(cBinaryTreeMethods btm, Boolean inOrder) {
        if (inOrder) {
            peopleData = btm.getOrdered(inOrder);
        }
    }
 public boolean isEditable()
    {
        return false;
    }
    @Override
    public Class getColumnClass(int c) {
        if (c == 1)
            return int.class;
        else
            return String.class;
    }

    public int getRowCount() {
        return peopleData.length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return peopleData[rowIndex][columnIndex];
    }


}

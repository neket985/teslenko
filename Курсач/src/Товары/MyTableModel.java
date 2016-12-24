package Товары;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.LinkedList;

public class MyTableModel implements TableModel {
    String[] columnNames = {"wight", "height", "color", "price", "name"};
    LinkedList<Product> furniture;

    MyTableModel(LinkedList<Product> furniture){
        this.furniture = furniture;
    }
    public int getRowCount() {
        return furniture.size();
    }
    public int getColumnCount() {
        return 7;
    }
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 5:
                return Integer.class;
            default:
                return String.class;
        }
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex!=0){
            return true;
        }
        return false;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = furniture.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return Product.wight;
            case 1:
                return Product.height;
            case 2:
                return Product.color;
            case 3:
                return Product.price;
            default:
                return Product.name;
        }
    }
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Product product = furniture.get(rowIndex);
        switch (columnIndex) {
            case 1:
                Product.wight = static int ();
                break;
            case 2:
                Product.height = static int();
                break;
            case 3:
                Product.color =  static Color();
                break;
            case 4:
                Product.price =  static int();
                break;
            default:
                Product.name = static String();
        }
    }
    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {

    }
}

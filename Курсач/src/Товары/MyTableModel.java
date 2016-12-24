package Товары;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.LinkedList;

public class MyTableModel implements TableModel {
    String[] columnNames = {"wight", "height", "color", "price", "name"};
    LinkedList<Product> furniture;

    MyTableModel(LinkedList<Product> furniture) {
        this.furniture = furniture;
    }

    public int getRowCount() {
        return furniture.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 2:
                return Color.class;
            case 4:
                return String.class;
            default:
                return int.class;
        }
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = furniture.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.wight;
            case 1:
                return product.height;
            case 2:
                return product.color;
            case 3:
                return product.price;
            default:
                return product.name;
        }
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Product product = furniture.get(rowIndex);
        switch (columnIndex) {
            case 1:
                product.wight = Integer.parseInt(aValue.toString());
                break;
            case 2:
                product.height = Integer.parseInt(aValue.toString());
                break;
            case 3:
                product.color = new Color(Integer.parseInt(aValue.toString()));
                break;
            case 4:
                product.price =Integer.parseInt(aValue.toString());
                break;
            default:
                product.name = aValue.toString();
        }
    }

    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {

    }
}

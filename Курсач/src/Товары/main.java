package Товары;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.LinkedList;


public class main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Product> furniture = new LinkedList<Product>();
        furniture.add(new Product(3, 30, new Color(1, 0, 0), 30, "Kullen1")); //http://www.ikea.com/us/en/catalog/categories/departments/bedroom/20656/
        furniture.add(new Product(4, 32, new Color(1, 0, 0), 199, "Malm1"));
        furniture.add(new Product(4, 32, new Color(246, 254, 231), 70, "Hemnes1"));
        furniture.add(new Product(3, 34, new Color(248, 2, 0), 30, "Selje1"));
        furniture.add(new Product(2, 30, new Color(255, 241, 250), 30, "Trysil1"));
        furniture.add(new Product(2, 30, new Color(106, 248, 0), 199, "Brimnes1"));
        furniture.add(new Product(3, 30, new Color(106, 248, 0), 252, "Nordli1"));
        furniture.add(new Product(8, 84, new Color(246, 254, 231), 192, "Elvarli")); //http://www.ikea.com/us/en/catalog/categories/departments/bedroom/11466/
        furniture.add(new Product(7, 84, new Color(246, 254, 231), 252, "Algot"));
        furniture.add(new Product(7, 30, new Color(150, 75, 0), 148, "Brusali")); //http://www.ikea.com/us/en/catalog/categories/departments/bedroom/10451/
        furniture.add(new Product(8, 42, new Color(150, 75, 0), 30, "Koppang"));
        furniture.add(new Product(6, 42, new Color(249, 238, 46), 199, "Oppland"));
        furniture.add(new Product(4, 34, new Color(252, 254, 239), 252, "Brimnes2"));
        furniture.add(new Product(5, 34, new Color(150, 75, 0), 100, "Kullen2"));
        furniture.add(new Product(5, 34, new Color(249, 238, 46), 199, "Nornas1"));
        furniture.add(new Product(8, 42, new Color(1, 0, 0), 189, "Dyfjord1"));

        final String[] listComboBox = {"wight", "height", "color", "price", "name"};
        JFrame swg = new JFrame("furniture");
        final JComboBox list = new JComboBox(listComboBox);
        swg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swg.setSize(600, 400);

        TableModel model = new MyTableModel(furniture);
        final JTable table = new JTable(model);
        table.setGridColor(Color.BLACK);

        JPanel pannel = new JPanel();
        pannel.setBackground(new Color(255, 241, 31));
        pannel.add(new JLabel("Фильтр"));
        pannel.add(list);
        pannel.add(table.getTableHeader());
        pannel.add(table);
        swg.add(pannel);
        swg.setVisible(true);
    }
}
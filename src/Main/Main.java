package Main;

import Frame.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static JFrame frame = new JFrame();

    public static JMenu products = new JMenu("Products");

    public static JMenuBar menubar = new JMenuBar();
    public static JTextArea text = new JTextArea(10, 40);

    public static JMenu food = new JMenu("Food");
    public static JMenuItem buyFood = new JMenuItem("Buy Food");
    public static JMenu drinks = new JMenu("Drinks");
    public static JMenuItem buyDrinks = new JMenuItem("Buy Drinks");
    public static JMenu snacks = new JMenu("Snacks");
    public static JMenuItem buySnacks = new JMenuItem("Buy Snacks");

    public static double $food_Price, $drink_Price, $snack_Price;
    public static double _$food_Total, _$drink_Total, _$snack_Total;

    public static String _food_product, _drink_product, _snack_product;

    public static int returnVal, num_of_products;

    public static ArrayList<String> food_list = new ArrayList<>();
    public static ArrayList<String> drink_List = new ArrayList<>();

    public static Board board = new Board(frame, 1280, 720, "Purchasing System", true, menubar);

    public static void main(String[] args){
        board.draw();

        board.addTextToFrame(frame, text);
        text.setFont(text.getFont().deriveFont(16f));

        board.Add_MenuBar_TO_Frame(frame, menubar);
        board.Add_Menu_To_Bar(menubar, products);
        board.Add_Menu_To_Menu(products, food);
        board.Add_Menu_To_Menu(products, drinks);
        board.Add_Menu_To_Menu(products, snacks);

        board.Add_Item_To_Menu(food, buyFood);
        board.Add_Item_To_Menu(drinks, buyDrinks);
        board.Add_Item_To_Menu(snacks, buySnacks);

        buyFood.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Buy_Food();
                    }
                }
        );

        buyDrinks.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        buy_Drinks();
                    }
                }
        );

    }

    public static void Buy_Food(){
        text.setText(null);
        num_of_products = Integer.valueOf(JOptionPane.showInputDialog(frame, "How Many Food Products Are Being Purchased"));

        _$food_Total = 0;

        for (int i=0; i < num_of_products; ++i){
            returnVal = Integer.valueOf(JOptionPane.showInputDialog(frame, "Please choose a option Below"+
                                                                                    "\n1. Burger"+
                                                                                    "\n2. Pie"+
                                                                                    "\n3. Sandwich"+
                                                                                    "\n4. Tacos"));
            switch(returnVal){
                case 1:
                    _food_product = "Burger";
                    $food_Price = 9.45;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 2:
                    _food_product = "Pie";
                    $food_Price = 5.55;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 3:
                    _food_product = "Sandwich";
                    $food_Price = 3.25;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 4:
                    _food_product = "Tacos";
                    $food_Price = 7.35;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
            }

            food_list.add(_food_product);

        }


        for (String str:food_list){
            text.append(str.toString() +  "  $"  + $food_Price + "\n");
        }
            text.append("Total Of Purchase" + _$food_Total);
    }

    public static void buy_Drinks() {
        text.setText(null);
        num_of_products = Integer.valueOf(JOptionPane.showInputDialog(frame, "How Many Food Products Are Being Purchased"));

        _$drink_Total = 0;

        for (int i = 0; i < num_of_products; ++i) {
            returnVal = Integer.valueOf(JOptionPane.showInputDialog(frame, "Please choose a option Below" +
                                                                                    "\n1. Pepsi" +
                                                                                    "\n2. Coke" +
                                                                                    "\n3. Fanta" +
                                                                                    "\n4. Water"));

            switch (returnVal) {
                case 1:
                    _drink_product = "Pepsi";
                    $drink_Price = 9.45;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 2:
                    _drink_product = "Coke";
                    $drink_Price = 5.55;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 3:
                    _drink_product = "Fanta";
                    $drink_Price = 3.25;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
                case 4:
                    _drink_product = "Water";
                    $drink_Price = 7.35;
                    _$food_Total = _$food_Total + $food_Price;
                    break;
            }

            drink_List.add(_drink_product);
        }

        for (String drink:drink_List){
            text.append(drink.toString() +  "  $"  + $drink_Price + "\n");
        }
    }
}

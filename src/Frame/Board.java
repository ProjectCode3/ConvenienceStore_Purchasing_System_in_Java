package Frame;

import javax.swing.*;
import java.awt.*;

public class Board {
    private JFrame frame;
    private JMenu menu;
    private JMenuItem item;
    private JMenuBar menubar;

    private int WIDTH, HEIGHT;
    private String TITLE;
    private boolean isVisible;
    private double total;

    public JPanel panel = new JPanel();
    public JLabel lblCaption = new JLabel("Caption");

    public Board(JFrame frame, int width, int height, String title, boolean visible, JMenuBar menubar){
        this.frame = frame;
        this.WIDTH = width;
        this.HEIGHT = height;
        this.TITLE = title;
        this.isVisible = visible;
        this.menubar = menubar;
    }

    public void draw(){
        /**
         * Draws the frame, set width, height and title, visibility
         */
        this.frame.setSize(this.WIDTH, this.HEIGHT);
        this.frame.setTitle(this.TITLE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.frame.setLocation(dim.width/2-this.frame.getSize().width/2, dim.height/2 - this.frame.getSize().height/2);
        this.panel.add(this.lblCaption);
        this.frame.getContentPane().add(panel, BorderLayout.SOUTH);
        this.frame.setVisible(this.isVisible);

    }

    public void Add_MenuBar_TO_Frame(JFrame frame, JMenuBar menubar){
        /**
         * Add Menubar to frame
         * :param::Menubar
         * :param:: Frame
         * :return:: None
         */
        frame.setJMenuBar(menubar);
    }

    public void Add_Menu_To_Bar(JMenuBar menubar, JMenu menu){
        /**
         * Add menu to menubar
         * :param:: MenuBar
         * :param:: Menu
         * :return:: None
         */
        menubar.add(menu);
    }

    public void Add_Item_To_Menu(JMenu menu, JMenuItem items){
        /**
         * Add MenuItem to menu
         *:param:: Menu
         * :param:: MenuItem
         * :return:: None
         */
        menu.add(items);
    }

    public void Add_Menu_To_Menu(JMenu menu, JMenu item){
        menu.add(item);
    }

    public void addTextToFrame(JFrame frame, JTextArea text){
        frame.getContentPane().add(text, BorderLayout.CENTER);
    }

    public void setTotal(double total){
        /**
         * Set the total of every product purchased
         * :param:: Total: Double
         * :return:: None
         */
        this.total = total;
    }

    public double getTotal(){
        /**
         * Return the total of the purchase
         * :return:: Double
         */
        return total;
    }




}

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




}

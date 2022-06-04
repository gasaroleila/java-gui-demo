package awt.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuDemo extends JFrame {
    public MenuDemo() {
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Home");
        ImageIcon homeIcon = new ImageIcon("C:/Users/uwamg/Desktop/classwork_yr2/Java/gui-demo/src/TG3A11QGL-USR3WGUUC-da801353eb97-512.jfif");
        Image img = homeIcon.getImage().getScaledInstance(50,50,0);
        //img.
        m1.setIcon(new ImageIcon(img));
        JMenu m2 = new JMenu("M2");
        JMenu submenu = new JMenu("Sub M1");
        JMenuItem menuIt1 = new JMenuItem("M item1");
        JMenuItem menuIt2 = new JMenuItem(("M item2"));

        //subMenu items
        JMenuItem subitem1 = new JMenuItem("Sub M item1");
        JMenuItem subitem2 = new JMenuItem(("Sub M item2"));

        submenu.add(subitem1);
        submenu.add(subitem2);
        m1.add(submenu);
//        m1.add(subitem1);
//        m1.add(subitem2);

        m2.addActionListener(e -> {
            JFrame F2 = new JFrame();
            F2.setVisible(true);
            F2.setLayout(new FlowLayout(10));
            F2.setBounds(100, 100,120,100);
            this.add(F2);
        });

        mb.add(m1);
        mb.add(m2);
        this.add(mb);
        this.setVisible(true);
        this.setLayout(new FlowLayout(10));
        this.setBounds(100, 100,120,100);



    }

    public static void main(String args[]) throws IOException {
        new MenuDemo();
    }
}

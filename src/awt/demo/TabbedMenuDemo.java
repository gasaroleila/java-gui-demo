package awt.demo;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class TabbedMenuDemo {
    JFrame f;

    TabbedMenuDemo() {
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 100);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(10, 16, 10));
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tp.setBounds(50, 50, 200, 200);
        ImageIcon icon = null;
        String imgURL = "C:/Users/uwamg/Desktop/classwork_yr2/Java/gui-demo/src/TG3A11QGL-USR3WGUUC-da801353eb97-512.jfif";
        icon = new ImageIcon(imgURL, "Testing ima");
        tp.addTab("Test Tab 4", new ImageIcon(getScaledImage(icon.getImage(), 30, 30)), p4);
        tp.addTab("main", new ImageIcon(getScaledImage(icon.getImage(), 30, 30)),p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        f.add(tp);
        f.setSize(400, 400);
        // f.setLayout(new BoxLayout(f, BoxLayout.X_AXIS));
        f.setVisible(true);
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }

    public static void main(String[] args) {
        new TabbedMenuDemo();
    }
}



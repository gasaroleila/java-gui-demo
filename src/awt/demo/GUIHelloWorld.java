package awt.demo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class GUIHelloWorld extends Frame {
    public  GUIHelloWorld() {
        this.setBounds(10,20,1000, 1000);
        this.setVisible(true); //make window visible
        this.setLayout(null); //window layout
        this.setBackground(Color.GRAY);
        this.setTitle("Java AWT Example");


         Label mylabel = new Label("Hello World!");
         mylabel.setBounds(1170, 0, 120, 120);
         mylabel.setBackground(Color.red);

        Button button = new Button("Click Me!");
        button.setBounds(100, 100,120,100);
        button.setVisible(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
         this.add(mylabel);
         this.add(button);


        //methods
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    mylabel.setText("Closing");
                    Thread.sleep(1000); //current thread, each ui component creates a separate thread
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                dispose(); //System.exit(0) will close other windows
            }
        });
    }
    public static void main(String[] args) throws IOException {
        new GUIHelloWorld();
    }
}

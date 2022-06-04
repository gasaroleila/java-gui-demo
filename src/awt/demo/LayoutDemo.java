package awt.demo;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class LayoutDemo extends Frame {
    Label status = new Label("Status");
    public LayoutDemo() {
        this.setLayout(new GridLayout(3,1));
//        this.setBounds(10,20,1000, 1000);
        this.setVisible(true);

        Panel panel1  = new Panel();
        panel1.setVisible(true);
        Label heading = new Label("Java Awt Form");
        heading.setFont(new Font("Serif",Font.BOLD,20));
        heading.setVisible(true);
        panel1.add(heading);
//        heading.setBounds(100, 100,120,100);



        Panel panel3 = new Panel();


//        panel3.add()

        panel3.setVisible(true);
        status.setVisible(true);

        panel3.add(status);
        this.add(panel1);
        this.add(Form());
        this.add(panel3);

        //methods
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Thread.sleep(1000); //current thread, each ui component creates a separate thread
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                dispose(); //System.exit(0) will close other windows
            }
        });
    }

    public static void main(String[] args) throws IOException {
        new LayoutDemo();
    }

    public Label newLabel(String text) {
        Label label = new Label(text);
        label.setVisible(true);
        label.setAlignment(Label.CENTER);
        return label;
    }

    public TextField newInput() {
        TextField field = new TextField();
        field.setVisible(true);
        field.setColumns(18);
        return field;
    }

    public Panel Form() {
      Panel form = new Panel();
//      form.setLayout(new GridLayout(2,2));
      Label fname = newLabel("Firstname");
      TextField fInput = newInput();
      Button send = new Button("send"); //source object
      send.setActionCommand("SEND");

      Button clear = new Button("Clear");
      clear.setActionCommand("CLEAR"); //add action

       send.addActionListener(new ButtonClickHandler(fInput));
       clear.addActionListener(new ButtonClickHandler(fInput));

      form.add(fname);
      form.add(fInput);
      form.add(send);
      form.add(clear);

      return form;

    }


    //Listener object
    public class ButtonClickHandler implements ActionListener {
        TextField fieldToSubmit;
        public ButtonClickHandler(TextField field) {
            this.fieldToSubmit = field;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("there"+e.getActionCommand());
            String action = e.getActionCommand();
            if(action.equals("SEND")) {
                System.out.println("there");
               status.setText(fieldToSubmit.getText());
            }else if(action.equals("CLEAR")) {
                fieldToSubmit.setText("");
            }


        }
    }

}



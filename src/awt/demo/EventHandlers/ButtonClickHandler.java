package awt.demo.EventHandlers;


import java.awt.*;
import java.awt.event.*;

public class ButtonClickHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String output;
        String action = e.getActionCommand();
        if(action.equals("SEND")) {

        }else if(action.equals("CLEAR")) {
            output = "Clearing form";
        }


    }
}

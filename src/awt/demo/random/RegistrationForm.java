package awt.demo.random;

import awt.demo.LayoutDemo;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class RegistrationForm extends Frame {
    public RegistrationForm() {
        this.setVisible(true);
        this.setLayout(new GridLayout(1,3));
        Label heading = new Label("Registration Form");
        this.add(Form());

    }

    public static void main(String[] args) throws IOException {
        new RegistrationForm();
    }

//    public Label Heading() {
//    }

    public Label newLabel(String labelName){
        Label label = new Label();
        label.setText(labelName);
        label.setVisible(true);
        return label;
    }

    public TextField newTextField() {
        TextField field = new TextField();
        field.setVisible(true);
        return field;
    }

    public Panel fieldContainer() {
        Panel fc = new Panel();
        fc.setVisible(true);
        return fc;
    }

    public Panel Form() {
        Panel form = new Panel();
        form.setVisible(true);

        Label fname = newLabel("First Name");
        TextField ffield = newTextField();
        Panel ffc = fieldContainer();
        ffc.add(fname);
        ffc.add(ffield);

        form.add(ffc);

        return form;
    }
}

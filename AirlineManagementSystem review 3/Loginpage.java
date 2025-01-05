package airline.management.system;

import javax.swing.*;
import java.awt.*;

public class Loginpage extends JFrame {
    JButton submit, reset, close;
    JTextField tfusername;
    JPasswordField tfpassword;

    public Loginpage() {
        // Aesthetics and Visual Appeal of the UI
        getContentPane().setBackground(Color.WHITE);

        // Layout Manager (Component Placement)
        setLayout(null);

        // Component Placement and Alignment
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20, 20, 100, 20);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(130, 20, 200, 20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20, 60, 100, 20);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(130, 60, 200, 20);
        add(tfpassword);

        reset = new JButton("Reset");
        reset.setBounds(40, 120, 120, 20);
        add(reset);

        submit = new JButton("Submit");
        submit.setBounds(190, 120, 120, 20);
        add(submit);

        close = new JButton("Close");
        close.setBounds(120, 160, 120, 20);
        add(close);

        // Responsiveness and Accessibility
        setSize(400, 250);
        setLocation(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Loginpage();
    }
}

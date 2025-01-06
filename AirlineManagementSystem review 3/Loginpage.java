package airlinemanagementsystem;

import javax.swing.*;
import java.sql.*;

public class Login extends JFrame {
    JTextField tfusername;
    JPasswordField tfpassword;

    public Login() {
        // Core Feature: User Input Fields
        tfusername = new JTextField();
        tfpassword = new JPasswordField();

        // Integration: Adding components to the UI
        add(tfusername);
        add(tfpassword);
    }

    // Core Feature: Authentication Logic
    public void authenticateUser(String username, String password) {
        try {
            Conn c = new Conn(); // Integration with database connection class
            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";
            ResultSet rs = c.s.executeQuery(query);

            if (rs.next()) {
                new Home(); // Integration with Home module
                setVisible(false); // Closing Login window
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                setVisible(false);
            }
        } catch (Exception e) {
            // Error Handling: Logging errors for debugging
            e.printStackTrace();
        }
    }

    // Event Handling: Button actions
    public void handleEvent(String action) {
        if ("Submit".equals(action)) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            authenticateUser(username, password); // Core logic call
        } else if ("Close".equals(action)) {
            setVisible(false); // Close the application
        } else if ("Reset".equals(action)) {
            tfusername.setText(""); // Clear username field
            tfpassword.setText(""); // Clear password field
        }
    }

    public static void main(String[] args) {
        new Login(); // Core initialization
    }
}

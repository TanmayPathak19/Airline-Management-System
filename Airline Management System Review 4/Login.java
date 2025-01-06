package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton submit, reset, close;
    JTextField tfusername;
    JPasswordField tfpassword;
     
    public Login() {
        // Setting up the JFrame for the login window
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
         
        // Label for "Username"
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20, 20, 100, 20);
        add(lblusername);
        
        // JTextField for username input
        tfusername = new JTextField();
        tfusername.setBounds(130, 20, 200, 20);
        add(tfusername);
        
        
        // Label for "Password"
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20, 60, 100, 20);
        add(lblpassword);
        
        // JPasswordField for password input (hides text)
        tfpassword = new JPasswordField();
        tfpassword.setBounds(130, 60, 200, 20);
        add(tfpassword);
        
        // Reset button to clear the text fields
        reset = new JButton("Reset");
        reset.setBounds(40, 120, 120, 20);
        reset.addActionListener(this);
        add(reset);
        
        // Submit button to validate user login
        submit = new JButton("Submit");
        submit.setBounds(190, 120, 120, 20);
        submit.addActionListener(this);
        add(submit);
        
        // Close button to close the login window
        close = new JButton("Close");
        close.setBounds(120, 160, 120, 20);
        close.addActionListener(this);
        add(close);
        
        // JFrame window settings
        setSize(400, 250);
        setLocation(600, 250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            // Data Validation: Ensure that username and password are not empty
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword()); // Using getPassword() to get the password as a char array
            
            if(username.isEmpty() || password.isEmpty()) {
                // Error Handling: Alert the user if any field is empty
                JOptionPane.showMessageDialog(null, "Username or Password cannot be empty");
                return;
            }
            
            try{
                // Database connection setup
                Conn c = new Conn();
                
                // Query to check the credentials against the database
                String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
                
                // Execute the query
                ResultSet rs = c.s.executeQuery(query);
                
                // Checking the result of the query
                if (rs.next()) {
                    // Innovative Feature: Redirecting to Home screen after successful login
                    new Home();
                    setVisible(false); // Closing the login window
                } else {
                    // Error Handling: Show an error message if credentials are incorrect
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password"); 
                    setVisible(false); // Close the login window
                }
            } catch(Exception e) {
                // Error Handling: Catch and print any exceptions that occur
                e.printStackTrace();
            }
                
        } else if (ae.getSource()== close) {
            // Close button: Closes the login window
            setVisible(false);
        } else if (ae.getSource()== reset) {
            // Reset button: Clears the username and password fields
            tfusername.setText("");
            tfpassword.setText("");
        }
    }
    
    // Main method to launch the login window
    public static void main(String[] args) {
        new Login();
    }
}

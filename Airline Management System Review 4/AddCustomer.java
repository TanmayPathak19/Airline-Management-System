package airline.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    // Declaration of input fields and gender radio buttons
    JTextField tfname, tfphone, tfaadhar, tfnationality, tfaddress;
    JRadioButton rbmale, rbfemale;
    
    public AddCustomer() {
        getContentPane().setBackground(Color.WHITE); // Set background color
        setLayout(null); // Using absolute positioning for layout
        
        // Heading label setup
        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(220, 20, 500, 35); // Positioning and sizing the heading
        heading.setFont(new Font("Tahoma", Font.PLAIN, 32)); // Font style for heading
        heading.setForeground(Color.BLUE); // Set color of heading text
        add(heading); // Adding heading to the frame
        
        // Label and TextField for customer name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 80, 150, 25);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblname);
        
        tfname = new JTextField(); // Input field for customer name
        tfname.setBounds(220, 80, 150, 25);
        add(tfname);
        
        // Label and TextField for nationality
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60, 130, 150, 25);
        lblnationality.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(220, 130, 150, 25);
        add(tfnationality);
        
        // Label and TextField for Aadhar number
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(60, 180, 150, 25);
        lblaadhar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(220, 180, 150, 25);
        add(tfaadhar);
        
        // Label and TextField for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60, 230, 150, 25);
        lbladdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220, 230, 150, 25);
        add(tfaddress);
        
        // Label for gender selection
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60, 280, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblgender);
        
        // Radio button group for selecting gender
        ButtonGroup gendergroup = new ButtonGroup();
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(220, 280, 70, 25);
        rbmale.setBackground(Color.WHITE); // Background color for radio button
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(300, 280, 70, 25);
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        gendergroup.add(rbmale); // Adding male option to gender group
        gendergroup.add(rbfemale); // Adding female option to gender group
        
        // Label and TextField for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(60, 330, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);
        
        // Save button to save customer details
        JButton save = new JButton("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setBounds(220, 380, 150, 30);
        save.addActionListener(this); // Add action listener for save button
        add(save);
        
        // Adding image to the frame
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icons/emp.png"));
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(450, 80, 280, 400);
        add(lblimage);
        
        // Set size and position of the window
        setSize(900, 600);
        setLocation(300, 150);
        setVisible(true); // Display the window
    }
    
    // Event handling for the save button
    public void actionPerformed(ActionEvent ae) {
        // Collecting the form input values
        String name = tfname.getText();
        String nationality = tfnationality.getText();
        String phone = tfphone.getText();
        String address = tfaddress.getText();
        String aadhar = tfaadhar.getText();
        String gender = null;
        
        // Determine gender based on selected radio button
        if (rbmale.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        
        // Database interaction to insert the customer data
        try {
            Conn conn = new Conn();
            
            String query = "insert into passenger values('"+name+"', '"+nationality+"', '"+phone+"', '"+address+"', '"+aadhar+"', '"+gender+"')";
        
            conn.s.executeUpdate(query); // Execute the insert query
            
            // Show success message
            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
            
            setVisible(false); // Close the AddCustomer window
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new AddCustomer(); // Instantiate the AddCustomer class to display the form
    }
}

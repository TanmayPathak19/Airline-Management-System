package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class JourneyDetails extends JFrame implements ActionListener{
    // Core Feature Implementation: Declaring the core components (JTable, JTextField, JButton)
    JTable table;
    JTextField pnr;
    JButton show;
    
    public JourneyDetails() {
        // Core Feature Implementation: Setting up the JFrame properties
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Core Feature Implementation: Adding JLabel for "PNR Details"
        JLabel lblpnr = new JLabel("PNR Details");
        lblpnr.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpnr.setBounds(50, 50, 100, 25);
        add(lblpnr);
        
        // Core Feature Implementation: Creating the PNR input text field
        pnr = new JTextField();
        pnr.setBounds(160, 50, 120, 25);
        add(pnr);
        
        // Core Feature Implementation: Creating the "Show Details" button
        show = new JButton("Show Details");
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.setBounds(290, 50, 120, 25);
        show.addActionListener(this); // Event Handling: Adding action listener to the button
        add(show);
        
        // Core Feature Implementation: Creating JTable for displaying the reservation details
        table = new JTable();
        
        // Integration of Components: Adding JTable inside JScrollPane for better scrolling and display
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 800, 150);
        jsp.setBackground(Color.WHITE);
        add(jsp);
        
        // Core Feature Implementation: JFrame size and visibility settings
        setSize(800, 600);
        setLocation(400, 150);
        setVisible(true);
    }
    
    // Event Handling and Processing: Method to handle button click actions
    public void actionPerformed(ActionEvent ae) {
        try {
            // Core Feature Implementation: Handling database interaction
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from reservation where PNR = '"+pnr.getText()+"'");
            
            // Error Handling and Robustness: Checking if no data is found and showing an appropriate message
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No Information Found");
                return;
            }
            
            // Integration of Components: Setting the fetched data into the JTable
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            // Error Handling and Robustness: Catching exceptions and printing the stack trace
            e.printStackTrace();
        }
    }

    // Core Feature Implementation: Main method to launch the application
    public static void main(String[] args) {
        new JourneyDetails();
    }
}

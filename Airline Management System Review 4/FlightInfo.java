package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame{
    
    public FlightInfo() {
        
        // Task: Set the background color and layout for the JFrame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Task: Create a JTable to display flight information
        JTable table = new JTable();
        
        try {
            // Task: Establish a connection to the database
            Conn conn = new Conn();
            
            // Task: Execute a query to fetch flight information from the "flight" table
            ResultSet rs = conn.s.executeQuery("select * from flight");
            
            // Innovative Feature: Use DbUtils to directly map the ResultSet to the JTable
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            // Code Quality: Log and handle any SQL or database-related exceptions effectively
            e.printStackTrace();
        }
        
        // Task: Add the JTable to a JScrollPane to make it scrollable
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp);
        
        // Task: Configure the JFrame's size, location, and visibility
        setSize(800, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Task: Launch the FlightInfo JFrame
        new FlightInfo();
    }
}

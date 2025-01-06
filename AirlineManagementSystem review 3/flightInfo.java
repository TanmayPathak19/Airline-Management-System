package airlinemanagementsystem;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame {
    
    public FlightInfo() {
        // Core Feature Implementation and Integration of Components
        JTable table = new JTable();

        try {
            // Integration of Components and Core Feature Implementation
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs)); // Populating the table with flight data
        } catch(Exception e) {
            // Error Handling and Robustness
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp); // Integration of Components
        
        setSize(800, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Event Handling and Processing: Launching the GUI
        new FlightInfo();
    }
}

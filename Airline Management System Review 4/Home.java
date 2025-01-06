package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        // Layout setup for the Home screen
        setLayout(null);
        
        // Adding background image to the Home screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1800, 900); // Positioning and sizing the image
        add(image);
        
        // Label for heading with airline name
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500, 40, 1000, 40); // Positioning the heading text
        heading.setForeground(Color.BLUE); // Set text color to blue
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36)); // Setting font size and style
        image.add(heading); // Adding the heading to the background image
        
        // Menu bar setup
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        // "Details" menu and its items
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        details.add(flightDetails); // Menu item for flight details
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        details.add(customerDetails); // Menu item for adding customer details
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        details.add(bookFlight); // Menu item for booking flight
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        details.add(journeyDetails); // Menu item for journey details
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        details.add(ticketCancellation); // Menu item for canceling tickets
        
        // "Ticket" menu and its item
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass); // Menu item for generating boarding pass
        
        // Maximize the window and make it visible
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizing the window to full screen
        setVisible(true); // Display the window
    
    }

    // Placeholder for action handling when menu items are clicked (currently empty)
    public void actionPerformed(ActionEvent ae) {
        // No specific actions are defined for menu item clicks as the logic is not yet implemented
    }
        
    // Main method to initialize the Home screen
    public static void main(String[] args) {
        new Home(); // Creating an instance of the Home class to display the UI
    }
}

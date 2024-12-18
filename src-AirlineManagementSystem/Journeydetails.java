package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;

// Code for Aesthetics, Component Placement, and Responsiveness
public class JourneyDetails extends JFrame {

    JTable table;
    JTextField pnr;
    JButton show;

    public JourneyDetails() {
        // Aesthetics: Set background color for the content pane
        getContentPane().setBackground(Color.WHITE);
        
        // Component Placement: Disable default layout manager for custom positioning
        setLayout(null);

        // Component Placement: Add and position a label for "PNR Details"
        JLabel lblpnr = new JLabel("PNR Details");
        lblpnr.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Aesthetics: Set font and size
        lblpnr.setBounds(50, 50, 100, 25); // Alignment
        add(lblpnr);

        // Component Placement: Add a text field for entering PNR
        pnr = new JTextField();
        pnr.setBounds(160, 50, 120, 25); // Alignment
        add(pnr);

        // Component Placement: Add a button to show details
        show = new JButton("Show Details");
        show.setBackground(Color.BLACK); // Aesthetics: Set button background color
        show.setForeground(Color.WHITE); // Aesthetics: Set button text color
        show.setBounds(290, 50, 120, 25); // Alignment
        add(show);

        // Responsiveness: Use JScrollPane for the table to handle large data
        table = new JTable();
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 800, 150); // Alignment and placement
        jsp.setBackground(Color.WHITE); // Aesthetics
        add(jsp);

        // Responsiveness: Set frame size and position to maintain accessibility
        setSize(800, 600);
        setLocation(400, 150);
        setVisible(true); // Accessibility: Ensure the frame is visible when created
    }

    public static void main(String[] args) {
        new JourneyDetails();
    }
}

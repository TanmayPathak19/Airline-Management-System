package airlinemanagementsystem;

import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        // Core Feature: Setting up the main interface
        setLayout(null);
        
        // Integration: Adding background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1800, 900);
        add(image);

        // Integration: Adding heading to the interface
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500, 40, 1000, 40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);

        // Core Feature: Setting up a menu bar
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        // Integration: Adding menu items
        JMenu details = new JMenu("Details");
        menubar.add(details);

        details.add(new JMenuItem("Flight Details")); // Menu item: Flight Details
        details.add(new JMenuItem("Add Customer Details")); // Menu item: Customer Details
        details.add(new JMenuItem("Book Flight")); // Menu item: Book Flight
        details.add(new JMenuItem("Journey Details")); // Menu item: Journey Details
        details.add(new JMenuItem("Cancel Ticket")); // Menu item: Ticket Cancellation

        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);

        ticket.add(new JMenuItem("Boarding Pass")); // Menu item: Boarding Pass

        // Core Feature: Maximizing window size
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    // Event Handling: Placeholder for handling menu events
    public void actionPerformed(ActionEvent ae) {
        // Future event handling logic goes here
    }

    public static void main(String[] args) {
        new Home(); // Core Feature: Launching the application
    }
}

package airline.management.system;

import javax.swing.*;
import java.awt.*;

public class Homepage extends JFrame {

    public Homepage() {
        // Layout manager
        setLayout(null);

        // Background Image for Aesthetics
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1800, 900); // Component Placement
        add(image);

        // Heading for Aesthetic Appeal
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500, 40, 1000, 40); // Component Placement
        heading.setForeground(Color.BLUE); // Aesthetics
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36)); // Aesthetics
        image.add(heading);

        // Menu Bar for Accessibility
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        // Adding Menus and Menu Items
        JMenu details = new JMenu("Details");
        menubar.add(details);

        details.add(new JMenuItem("Flight Details"));
        details.add(new JMenuItem("Add Customer Details"));
        details.add(new JMenuItem("Book Flight"));
        details.add(new JMenuItem("Journey Details"));
        details.add(new JMenuItem("Cancel Ticket"));

        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);

        ticket.add(new JMenuItem("Boarding Pass"));

        // Responsiveness
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximized window
        setVisible(true);
    }

    public static void main(String[] args) {
        new Homepage();
    }
}
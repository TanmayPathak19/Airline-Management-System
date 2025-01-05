package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

public class BookFlight extends JFrame {

    JTextField tfaadhar;
    JLabel tfname, tfnationality, tfaddress, labelgender, labelfname, labelfcode;
    JButton fetchButton, flight, bookflight;
    Choice source, destination;
    JDateChooser dcdate;

    public BookFlight() {
        // Aesthetics: Set background color for the main content
        getContentPane().setBackground(Color.WHITE);
        
        // Component Placement: Custom layout for precise positioning
        setLayout(null);

        // Aesthetics and Placement: Heading label with font and alignment
        JLabel heading = new JLabel("Book Flight");
        heading.setBounds(420, 20, 500, 35); // Alignment
        heading.setFont(new Font("Tahoma", Font.PLAIN, 32)); // Aesthetics: Font size and style
        heading.setForeground(Color.BLUE); // Aesthetics: Text color
        add(heading);

        // Component Placement: Add label for Aadhar input
        JLabel lblaadhar = new JLabel("Aadhar");
        lblaadhar.setBounds(60, 80, 150, 25); // Alignment
        lblaadhar.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Aesthetics
        add(lblaadhar);

        // Component Placement: Add text field for Aadhar input
        tfaadhar = new JTextField();
        tfaadhar.setBounds(220, 80, 150, 25); // Alignment
        add(tfaadhar);

        // Aesthetics: Button for fetching user details
        fetchButton = new JButton("Fetch User");
        fetchButton.setBackground(Color.BLACK); // Aesthetics: Button background
        fetchButton.setForeground(Color.WHITE); // Aesthetics: Button text color
        fetchButton.setBounds(380, 80, 120, 25); // Alignment
        add(fetchButton);

        // Component Placement: Add source and destination dropdowns
        JLabel lblsource = new JLabel("Source");
        lblsource.setBounds(60, 330, 150, 25); // Alignment
        lblsource.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Aesthetics
        add(lblsource);

        source = new Choice();
        source.setBounds(220, 330, 150, 25); // Alignment
        add(source);

        JLabel lbldest = new JLabel("Destination");
        lbldest.setBounds(60, 380, 150, 25); // Alignment
        lbldest.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Aesthetics
        add(lbldest);

        destination = new Choice();
        destination.setBounds(220, 380, 150, 25); // Alignment
        add(destination);

        // Aesthetics: Add button for fetching flight details
        flight = new JButton("Fetch Flights");
        flight.setBackground(Color.BLACK); // Aesthetics: Button background
        flight.setForeground(Color.WHITE); // Aesthetics: Button text color
        flight.setBounds(380, 380, 120, 25); // Alignment
        add(flight);

        // Responsiveness: Date chooser for travel date
        JLabel lbldate = new JLabel("Date of Travel");
        lbldate.setBounds(60, 530, 150, 25); // Alignment
        lbldate.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Aesthetics
        add(lbldate);

        dcdate = new JDateChooser();
        dcdate.setBounds(220, 530, 150, 25); // Alignment
        add(dcdate);

        // Aesthetics: Book flight button with styling
        bookflight = new JButton("Book Flight");
        bookflight.setBackground(Color.BLACK); // Aesthetics: Button background
        bookflight.setForeground(Color.WHITE); // Aesthetics: Button text color
        bookflight.setBounds(220, 580, 150, 25); // Alignment
        add(bookflight);

        // Responsiveness: Set window size and location
        setSize(1100, 700);
        setLocation(200, 50);
        setVisible(true); // Accessibility: Ensure the frame is visible
    }

    public static void main(String[] args) {
        new BookFlight();
    }
}

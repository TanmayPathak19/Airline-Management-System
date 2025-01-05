package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;

public class FlightInfo extends JFrame {

    public FlightInfo() {
        // Setting background color for aesthetics
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Adding a scrollable table
        JTable table = new JTable();
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp);

        // Window settings for responsiveness
        setSize(800, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlightInfo();
    }
}

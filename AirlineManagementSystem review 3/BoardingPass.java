package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BoardingPass extends JFrame implements ActionListener {
    
    JTextField tfpnr;
    JLabel tfname, tfnationality, lblsrc, lbldest, labelfname, labelfcode, labeldate;
    JButton fetchButton;
    
    public BoardingPass() {
        // Core Feature: Creating the UI structure
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblaadhar = new JLabel("PNR DETAILS");
        lblaadhar.setBounds(60, 100, 150, 25);
        add(lblaadhar);
        
        tfpnr = new JTextField();
        tfpnr.setBounds(220, 100, 150, 25);
        add(tfpnr);
        
        fetchButton = new JButton("Enter");
        fetchButton.setBounds(380, 100, 120, 25);
        fetchButton.addActionListener(this); // Event Handling
        add(fetchButton);

        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60, 140, 150, 25);
        add(lblname);
        
        tfname = new JLabel();
        tfname.setBounds(220, 140, 150, 25);
        add(tfname);

        JLabel lblnationality = new JLabel("NATIONALITY");
        lblnationality.setBounds(60, 180, 150, 25);
        add(lblnationality);
        
        tfnationality = new JLabel();
        tfnationality.setBounds(220, 180, 150, 25);
        add(tfnationality);

        JLabel lbladdress = new JLabel("SRC");
        lbladdress.setBounds(60, 220, 150, 25);
        add(lbladdress);
        
        lblsrc = new JLabel();
        lblsrc.setBounds(220, 220, 150, 25);
        add(lblsrc);
        
        JLabel lblgender = new JLabel("DEST");
        lblgender.setBounds(380, 220, 150, 25);
        add(lblgender);
        
        lbldest = new JLabel();
        lbldest.setBounds(540, 220, 150, 25);
        add(lbldest);

        JLabel lblfname = new JLabel("Flight Name");
        lblfname.setBounds(60, 260, 150, 25);
        add(lblfname);
        
        labelfname = new JLabel();
        labelfname.setBounds(220, 260, 150, 25);
        add(labelfname);

        JLabel lblfcode = new JLabel("Flight Code");
        lblfcode.setBounds(380, 260, 150, 25);
        add(lblfcode);
        
        labelfcode = new JLabel();
        labelfcode.setBounds(540, 260, 150, 25);
        add(labelfcode);

        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 300, 150, 25);
        add(lbldate);
        
        labeldate = new JLabel();
        labeldate.setBounds(220, 300, 150, 25);
        add(labeldate);

        setSize(1000, 450);
        setLocation(300, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        // Event Handling and Error Handling
        String pnr = tfpnr.getText();

        try {
            Conn conn = new Conn();
            String query = "select * from reservation where PNR = '" + pnr + "'";
            ResultSet rs = conn.s.executeQuery(query);

            if (rs.next()) {
                // Core Feature: Fetching and displaying data
                tfname.setText(rs.getString("name")); 
                tfnationality.setText(rs.getString("nationality")); 
                lblsrc.setText(rs.getString("src")); 
                lbldest.setText(rs.getString("des"));  
                labelfname.setText(rs.getString("flightname"));  
                labelfcode.setText(rs.getString("flightcode"));  
                labeldate.setText(rs.getString("ddate")); 
            } else {
                JOptionPane.showMessageDialog(null, "Please enter correct PNR");                
            }
        } catch (Exception e) {
            e.printStackTrace(); // Error Handling
        }
    }

    public static void main(String[] args) {
        new BoardingPass();
    }
}

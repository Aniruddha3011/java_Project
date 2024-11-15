package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Balanceenq extends JFrame implements ActionListener {
    JButton back;
    String pinnumber;
    
    Balanceenq(String pinnumber){
        setLayout(null);
        this.pinnumber = pinnumber;
        
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
      
        back = new JButton("Back");
        back.setBounds(460, 510, 130, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        Conn c = new Conn();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "'");
            while (rs.next()) {
                String type = rs.getString("type");
                String amountStr = rs.getString("amount");
                if (amountStr != null) {
                    int amount = Integer.parseInt(amountStr);
                    if (type.equals("Deposite")) {
                        balance += amount;
                    } else if (type.equals("Withdraw")) {
                        balance -= amount;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // Display the balance
        JLabel text = new JLabel("Your Current Account Balance is Rs " + balance);
        text.setForeground(Color.WHITE);
        text.setBounds(330, 390, 400, 30);
        image.add(text);
        
        // Frame settings
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transaction(pinnumber).setVisible(true); // Open transaction page on "Back" click
    }
    
    public static void main(String[] args) {
        // Sample pin number for testing
        new Balanceenq("");
    }
}

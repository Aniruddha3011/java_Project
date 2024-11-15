package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {

    JButton deposite, withdraw, ministatement, fastcash, pinchange, balanceenq, exit;
    String pinnumber;

    Transaction(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 880, 880);
        add(image);

        // Text Label
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(320, 350, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Roboto", Font.BOLD, 16));
        image.add(text);

        // Deposite Button
        deposite = new JButton("Deposite");
        deposite.setBounds(290, 412, 120, 30);
        deposite.addActionListener(this);
        image.add(deposite);

        // Withdraw Button
        withdraw = new JButton("Cash Withdraw");
        withdraw.setBounds(460, 412, 120, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        // Fast Cash Button
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(290, 448, 120, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        // Mini-Statement Button
        ministatement = new JButton("Mini-Statement");
        ministatement.setBounds(460, 448, 120, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        // Pin Change Button
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(290, 482, 120, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        // Balance Enquiry Button
        balanceenq = new JButton("Check Balance");
        balanceenq.setBounds(460, 482, 120, 30);
        balanceenq.addActionListener(this);
        image.add(balanceenq);

        // Exit Button
        exit = new JButton("Exit");
        exit.setBounds(460, 515, 120, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
       
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposite) {
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdraw) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        } else if (ae.getSource() == balanceenq) {
            setVisible(false);
            new Balanceenq(pinnumber).setVisible(true);  // Fix: It should open the BalanceEnq class.
        }else if(ae.getSource()==ministatement){
            
            new Ministatement(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transaction("");  
    }
}

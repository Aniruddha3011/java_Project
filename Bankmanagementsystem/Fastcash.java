
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
    
    JButton deposite,withdraw,ministatement,fastcash,pinchange,balanceenq,exit;
    String pinnumber;
    
    Fastcash(String pinnumber){
        this.pinnumber=pinnumber;
       setLayout(null);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo4.jpg"));
       Image i2=i1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0, 0, 880, 880);
       add(image);
       
       JLabel text=new JLabel("Select Withdraw Amount");
       text.setBounds(350,360,700,35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Roboto",Font.BOLD,16));
       
       deposite=new JButton("RS 100");
       deposite.setBounds(290, 415, 120, 30);
       deposite.addActionListener(this);
       image.add(deposite);
       
       withdraw=new JButton("Rs 500");
       withdraw.setBounds(474, 420, 120, 30);
       withdraw.addActionListener(this);
       image.add(withdraw);
       
       fastcash=new JButton("Rs 1000");
       fastcash.setBounds(290, 448, 120, 30);
       fastcash.addActionListener(this);
       image.add(fastcash);
       
       ministatement=new JButton("Rs 2000");
       ministatement.setBounds(474, 453, 120, 30);
       ministatement.addActionListener(this);
       image.add(ministatement);
       
       pinchange=new JButton("Rs 5000");
       pinchange.setBounds(290, 481, 120, 30);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
       balanceenq=new JButton("Rs 10000");
       balanceenq.setBounds(474, 486, 120, 30);
       balanceenq.addActionListener(this);
       image.add(balanceenq);
       
       exit=new JButton("back");
       exit.setBounds(290, 514, 120, 28);
       exit.addActionListener(this);
       image.add(exit);

       
       
       
       
       
       image.add(text);
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else{
            String amount=((JButton)ae.getSource()).getText().substring(3);
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposite")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        balance -=Integer.parseInt(rs.getString("amount")); 
                    }
                    
                }
                
                if(ae.getSource()!=exit && balance< Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return ;
                }
                
                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+"debited Successfully");
                
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
        }
        
        }
    }
    
    
    public static void main(String[] args){
        new Fastcash("");
        
    }
    
}

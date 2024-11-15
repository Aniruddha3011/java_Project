package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Signuptwo extends JFrame implements ActionListener {

    long random;
    JTextField pan, adhar;
    JRadioButton eyes, eno, syes, sno;
    JDateChooser dateChooser;
    JComboBox religion, category, occupation, education, income;
    String formno;

    Signuptwo(String formno) {
        this.formno = formno;
        random = Math.abs((new Random().nextLong() % 9000L) + 1000L);
        
        setLayout(null);
        setTitle("New Application Form - PAGE 2");

        JLabel additionaldetails = new JLabel("Page 2: Additional Details");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 38));
        additionaldetails.setBounds(200, 70, 600, 44);
        add(additionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String varreligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "other" };
        religion = new JComboBox(varreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        String varcategory[] = { "GENERAL", "OBC", "SC", "ST", "other" };
        category = new JComboBox(varcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        String incomecat[] = { "Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000" };
        income = new JComboBox(incomecat);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational Qualification:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        String educationcat[] = { "Non-Graduate", "Graduation", "Post-Graduation", "Doctorate", "other" };
        education = new JComboBox(educationcat);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        String occupationcat[] = { "salaried", "self-Employed", "Business", "student", "Retired", "other" };
        occupation = new JComboBox(occupationcat);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pannumber = new JLabel("PAN Number:");
        pannumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pannumber.setBounds(100, 440, 300, 30);
        add(pannumber);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel adharnumber = new JLabel("Aadhar Number:");
        adharnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        adharnumber.setBounds(100, 490, 300, 30);
        add(adharnumber);

        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhar.setBounds(300, 490, 400, 30);
        add(adhar);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 300, 30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup status = new ButtonGroup();
        status.add(syes);
        status.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 300, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup estatus = new ButtonGroup();
        estatus.add(eyes);
        estatus.add(eno);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Roboto", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;

        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String span = pan.getText();
        String sadhar = adhar.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + sadhar + "','" + seniorcitizen + "','" + existingaccount + "')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Form Submitted Successfully");
            setVisible(false);
            new Signupthree(formno).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signuptwo("");
    }
}
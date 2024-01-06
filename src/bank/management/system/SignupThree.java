package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton sa, fda, ca, rda;
    ButtonGroup groupaccount;
    JCheckBox atmc, ib, mb, esa, cb, es, dc;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("PAGE 3 : ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        sa = new JRadioButton("Saving Account");
        sa.setFont(new Font ("Raleway", Font.BOLD, 16));
        sa.setBackground(Color.WHITE);
        sa.setBounds(100, 180, 200, 20);
        add(sa);
        
        fda = new JRadioButton("Fixed Deposit Account");
        fda.setFont(new Font ("Raleway", Font.BOLD, 16));
        fda.setBackground(Color.WHITE);
        fda.setBounds(350, 180, 250, 20);
        add(fda);
        
        ca = new JRadioButton("Current Account");
        ca.setFont(new Font ("Raleway", Font.BOLD, 16));
        ca.setBackground(Color.WHITE);
        ca.setBounds(100, 220, 200, 20);
        add(ca);
        
        rda = new JRadioButton("Recurring Deposit Account");
        rda.setFont(new Font ("Raleway", Font.BOLD, 16));
        rda.setBackground(Color.WHITE);
        rda.setBounds(350, 220, 250, 20);
        add(rda);
        
        groupaccount = new ButtonGroup();
        groupaccount.add(sa);
        groupaccount.add(fda);
        groupaccount.add(ca);
        groupaccount.add(rda);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(350, 300, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 100, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(350, 370, 100, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Pin Number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 300, 30);
        add(services);
        
        atmc =  new JCheckBox("ATM Card");
        atmc.setBackground(Color.WHITE);
        atmc.setFont(new Font("Raleway", Font.BOLD, 16));
        atmc.setBounds(100, 500, 200, 30);
        add(atmc);
        
        ib =  new JCheckBox("Internet Banking");
        ib.setBackground(Color.WHITE);
        ib.setFont(new Font("Raleway", Font.BOLD, 16));
        ib.setBounds(350, 500, 200, 30);
        add(ib);
        
        mb =  new JCheckBox("Mobile Banking");
        mb.setBackground(Color.WHITE);
        mb.setFont(new Font("Raleway", Font.BOLD, 16));
        mb.setBounds(100, 550, 200, 30);
        add(mb);
        
        esa =  new JCheckBox("Email & SMS Alerts");
        esa.setBackground(Color.WHITE);
        esa.setFont(new Font("Raleway", Font.BOLD, 16));
        esa.setBounds(350, 550, 200, 30);
        add(esa);
        
        cb =  new JCheckBox("Cheque Book");
        cb.setBackground(Color.WHITE);
        cb.setFont(new Font("Raleway", Font.BOLD, 16));
        cb.setBounds(100, 600, 200, 30);
        add(cb);
        
        es =  new JCheckBox("E-Statement");
        es.setBackground(Color.WHITE);
        es.setFont(new Font("Raleway", Font.BOLD, 16));
        es.setBounds(350, 600, 200, 30);
        add(es);
        
        dc =  new JCheckBox("I hereby declres that the above entered details are correct to the best of knowledge");
        dc.setBackground(Color.WHITE);
        dc.setFont(new Font("Raleway", Font.BOLD, 12));
        dc.setBounds(100, 680, 600, 30);
        add(dc);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(250, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(420, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource() == submit) {
        
            String accountType = null;
            if(sa.isSelected()) {
            
                accountType = " Saving Account";
            
            } else if(fda.isSelected()) {
            
                accountType = " Fixed Deposit Account";
            
            } else if(ca.isSelected()) {
            
                accountType = " Current Account";
            
            } else if(rda.isSelected()) {
            
                accountType = " Recurring Deposit Account";
            
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(atmc.isSelected()) {
            
                facility = facility + " ATM Card";
            
            } else if(ib.isSelected()) {
            
                facility = facility + " Internet Banking";
            
            } else if(mb.isSelected()) {
            
                facility = facility + " Mobile Banking";
            
            } else if(esa.isSelected()) {
            
                facility = facility + " Email & SMS Alerts";
            
            } else if(cb.isSelected()) {
            
                facility = facility + " Cheque Book";
            
            } else if(es.isSelected()) {
            
                facility = facility + " E-Statement";
            
            }
            
            try {
            
                if(accountType.equals("")) {
                
                    JOptionPane.showMessageDialog(null, "Account type is Required");
                
                } else {
                
                    Conn conn =  new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.execute(query1);
                    conn.s.execute(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardnumber + "\n Pin : " + pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                    
                }
                          
            } catch(Exception e) {
            
                System.out.println(e);
            
            }
                    
        }else if(ae.getSource() == cancel) {
        
            setVisible(false);
            new Login().setVisible(true);
        
        }
        
    }
    
    public static void main(String args[]) {
    
        new SignupThree("");
    
    }
    
}

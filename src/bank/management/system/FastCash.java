package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton amountoption1,amountoption2,amountoption3,amountoption4,amountoption5,amountoption6,back;
    String pinnumber;
    
    FastCash(String pinnumber) {
    
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select Withdrawl amount.");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        amountoption1 = new JButton("Rs 100");
        amountoption1.setBounds(170, 415, 150, 30);
        amountoption1.addActionListener(this);
        image.add(amountoption1);
        
        amountoption2 = new JButton("Rs 500");
        amountoption2.setBounds(355, 415, 150, 30);
        amountoption2.addActionListener(this);
        image.add(amountoption2);
        
        amountoption3 = new JButton("Rs 1000");
        amountoption3.setBounds(170, 450, 150, 30);
        amountoption3.addActionListener(this);
        image.add(amountoption3);
        
        amountoption4 = new JButton("Rs 2000");
        amountoption4.setBounds(355, 450, 150, 30);
        amountoption4.addActionListener(this);
        image.add(amountoption4);
        
        amountoption5 = new JButton("Rs 5000");
        amountoption5.setBounds(170, 485, 150, 30);
        amountoption5.addActionListener(this);
        image.add(amountoption5);
        
        amountoption6 = new JButton("rs 10000");
        amountoption6.setBounds(355, 485, 150, 30);
        amountoption6.addActionListener(this);
        image.add(amountoption6);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
            
    }
    
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource() == back) {
        
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        
        } else {
        
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()) {
                
                    if(rs.getString("type").equals("Deposit")) {
                    
                        balance += Integer.parseInt(rs.getString("amount"));
                    
                    } else {
                    
                        balance -= Integer.parseInt(rs.getString("amount"));
                    
                    }
                
                }
                
                if(ae.getSource() != back && balance<Integer.parseInt(amount)) {
                
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount +" Debited Sucessfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                        
            } catch (Exception e) {
            
                System.out.println(e);
                
            }
            
        }
    
    }
    public static void main(String args[]) {
    
        new FastCash("");
    
    }
    
}

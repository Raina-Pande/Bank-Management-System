package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    ButtonGroup seniorgroup, exisitinggroup;
    JTextField panTextField, aadhaarTextField, guarantorTextField;
    JRadioButton syes, sno, eyes, eno;
    JComboBox incomeChooser, educationChooser, occupationChooser, relationChooser; 
    JButton next; 
    String formno;
    
    SignupTwo(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
                
        JLabel additionalDetails = new JLabel ("PAGE 2 : ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel gname = new JLabel ("GUARANTOR NAME");
        gname.setFont(new Font("Railway", Font.BOLD, 20));
        gname.setBounds(100, 140, 250, 30);
        add(gname);
        
        guarantorTextField = new JTextField();
        guarantorTextField.setFont(new Font("Railway", Font.BOLD, 14));
        guarantorTextField.setBounds(300, 140, 400, 30);
        add(guarantorTextField);
        
        JLabel grelation = new JLabel ("RELATION");
        grelation.setFont(new Font("Railway", Font.BOLD, 20));
        grelation.setBounds(100, 190, 250, 30);
        add(grelation);
        
        String valRelation[] = {"Father", "Mother", "Brother", "Sister", "Friend", "Spouse", "Other"};
        relationChooser = new JComboBox(valRelation);
        relationChooser.setBounds(300, 190, 400, 30);
        relationChooser.setBackground(Color.WHITE);
        add(relationChooser);
        
        JLabel  income= new JLabel ("Income");
        income.setFont(new Font("Railway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeCategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        incomeChooser = new JComboBox(incomeCategory);
        incomeChooser.setBounds(300, 240, 400, 30);
        incomeChooser.setBackground(Color.WHITE);
        add(incomeChooser);
        
        JLabel education = new JLabel ("Educational");
        education.setFont(new Font("Railway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        JLabel qualification = new JLabel ("Qualification");
        qualification.setFont(new Font("Railway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationValues[] = {"Non-Graduation","Graduation","Post Graduation","Doctrate","Other"};
        educationChooser = new JComboBox(educationValues);
        educationChooser.setBounds(300, 315, 400, 30);
        educationChooser.setBackground(Color.WHITE);
        add(educationChooser);
        
        JLabel occupation = new JLabel ("Occupation");
        occupation.setFont(new Font("Railway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupationChooser = new JComboBox(occupationValues);
        occupationChooser.setBounds(300, 390, 400, 30);
        occupationChooser.setBackground(Color.WHITE);
        add(occupationChooser);
        
        JLabel pan = new JLabel ("PAN Number");
        pan.setFont(new Font("Railway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Railway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadhaar = new JLabel ("Aadhaar Number");
        aadhaar.setFont(new Font("Railway", Font.BOLD, 20));
        aadhaar.setBounds(100, 490, 200, 30);
        add(aadhaar);
        
        aadhaarTextField = new JTextField();
        aadhaarTextField.setFont(new Font("Railway", Font.BOLD, 14));
        aadhaarTextField.setBounds(300, 490, 400, 30);
        add(aadhaarTextField);
        
        JLabel senior = new JLabel ("Senior Citizen");
        senior.setFont(new Font("Railway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
                
        JLabel exisiting = new JLabel ("Exisiting Account");
        exisiting.setFont(new Font("Railway", Font.BOLD, 20));
        exisiting.setBounds(100, 590, 200, 30);
        add(exisiting);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        exisitinggroup = new ButtonGroup();
        exisitinggroup.add(eyes);
        exisitinggroup.add(eno);
                
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
      
        String gname = guarantorTextField.getText();
        String grelation = (String) relationChooser.getSelectedItem();
        String income = (String) incomeChooser.getSelectedItem();
        String education = (String) educationChooser.getSelectedItem();
        String occupation = (String) occupationChooser.getSelectedItem();
        String pan = panTextField.getText();
        String aadhaar = aadhaarTextField.getText();
        String senior = null;
        if (syes.isSelected()) {
        
            senior = "Yes";
        
        } else if (sno.isSelected()) {
        
            senior = "No";
            
        }
        
        String exisiting = null;
        if (eyes.isSelected()) {
        
            exisiting = "Yes";
        
        } else if (eno.isSelected()) {
        
            exisiting = "No";
            
        }
        
        try {
        
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+gname+"','"+grelation+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhaar+"','"+senior+"','"+exisiting+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        
        } catch (Exception e) {
        
            System.out.println(e);
        
        }
        
    }
    
    public static void main(String[] args) {
         
        new SignupTwo("");
    }
    
}

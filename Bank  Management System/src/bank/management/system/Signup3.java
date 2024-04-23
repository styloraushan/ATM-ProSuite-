package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton next,next2;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;

        Signup3(String formno) {
            super("Account Details");
            this.formno = formno;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank2.png"));
        Image i2= i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(5,10,200,100);
        add(image);

        JLabel label1=new JLabel("Page 3");
        label1.setBounds(380,650,600,30);
        label1.setFont(new Font("Ralway",Font.BOLD,22));
        add(label1);

        JLabel label2=new JLabel("Account details");
        label2.setBounds(330,90,600,40);
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        add(label2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(237, 175, 189));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(237, 175, 189));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(237, 175, 189));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(237, 175, 189));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,270,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,300,200,20);
        add(l5);

        JLabel l6= new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,270,250,30);
        add(l6);

        JLabel l7= new JLabel("(it would appear on ATM card / cheque book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,300,500,20);
        add(l7);

        JLabel l8= new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,340,200,30);
        add(l8);

        JLabel l9= new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,340,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit card Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,370,200,20);
        add(l10);

        JLabel l11= new JLabel("Services Required::");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,410,200,30);
        add(l11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(237, 175, 189));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,450,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(237, 175, 189));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,450,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(237, 175, 189));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,500,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(237, 175, 189));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,500,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(237, 175, 189));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,550,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(237, 175, 189));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,550,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge!",true);
        c7.setBackground(new Color(237, 175, 189));
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,610,700,20);
        add(c7);

        JLabel label12=new JLabel("Form No :");
        label12.setBounds(650,10,150,30);
        label12.setFont(new Font("Ralway",Font.BOLD,14));
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setBounds(750, 10, 150, 30);
        label13.setFont(new Font("Ralway", Font.BOLD, 14));
        add(label13);

        next = new JButton("Submit");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(560,650,100,30);
        next.addActionListener(this);
        add(next);

        next2 = new JButton("Cancel");
        next2.setFont(new Font("Raleway",Font.BOLD, 14));
        next2.setBackground(Color.BLACK);
        next2.setForeground(Color.WHITE);
        next2.setBounds(700,650,100,30);
        next2.addActionListener(this);
        add(next2);


        setSize(850,750);
        setLocation(450,80);
        setLayout(null);
        getContentPane().setBackground(new Color(237, 175, 189));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String atype="null";
            if(r1.isSelected()){
                atype="Saving Account";
            } else if (r2.isSelected()) {
                atype="Fixed Deposit Account";

            } else if (r3.isSelected()) {
                atype="Current Account";

            } else if (r3.isSelected()) {
                atype="Recurring Deposit Account";
            }
        Random ran=new Random();
            long first7=(ran.nextLong()%90000000L)+8825201000000000L;
            String cardno=""+Math.abs(first7);
            long first3=(ran.nextLong()%9000L)+1000L;
            String pin=""+Math.abs(first3);
            String fac="";
            if(c1.isSelected()){
                fac=fac+"ATM Card";
            } else if (c2.isSelected()) {
                fac=fac+"Internet Banking";
            }else if (c3.isSelected()) {
                fac=fac+"Mobile Banking";
            }
            else if (c4.isSelected()) {
                fac=fac+"Email Alerts";
            }else if (c5.isSelected()) {
                fac=fac+"Cheque Book";
            }else if (c6.isSelected()) {
                fac=fac+"E-Statement";
            }
            try{
                if(e.getSource()==next) {
                    if (atype.equals("")) {
                        JOptionPane.showMessageDialog(null, "Fill all the fields");
                    }
                else{
                        Connn c1=new Connn();
                        String q1 = "insert into signupthree values('" + formno + "','" +atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                        String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null,"Card Number:"+cardno+"\n Pin: "+pin);
                        new Deposit(pin);
                        setVisible(false);

                    }
                } else if (e.getSource()==next2) {
                    System.exit(0);

                }
            }catch (Exception E){
             E.printStackTrace();

            }
    }

    public static void main(String[] args) {

            new Signup3("");
    }
}

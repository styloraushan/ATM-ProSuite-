package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
JLabel label1,label2,label3;
JTextField  TextField1;
JButton button1,button2,button3;
JPasswordField PasswordField1;
    Login() {
        super("Bank Management System");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank2.png"));
        Image i2= i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(325,10,200,100);
        add(image);

        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2= ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage= new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.blue);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.blue);
        label2.setBounds(150,190,375,30);
        add(label2);

        TextField1=new JTextField(15);
        TextField1.setBounds(325,190,230,30);
        TextField1.setFont(new Font("Arial",Font.BOLD,14));
        add( TextField1);

        label3=new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.blue);
        label3.setBounds(150,250,375,30);
        add(label3);

        PasswordField1=new JPasswordField(15);
        PasswordField1.setBounds(325,250,230,30);
        PasswordField1.setFont(new Font("Arial",Font.BOLD,14));
        add( PasswordField1);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(320,300,105,30);
        button1.addActionListener(this);
        add(button1);
        button1.addActionListener(this);

        button2=new JButton(("CLEAR"));
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.black);
        button2.setBounds(455,300,105,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton(("SIGN UP"));
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.black);
        button3.setBounds(320,350,240,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/rkbg.png"));
        Image iii2= iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel iiimage= new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null);
        setSize(850, 480);
        setVisible(true);
        setLocation(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Add this line to close the application properly
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                Connn c = new Connn();
                String cardno = TextField1.getText();
                char[] pinCharArray = PasswordField1.getPassword();
                String pin = new String(pinCharArray);

                String q = "SELECT * FROM login WHERE card_number = '" + cardno + "' AND pin='" + pin + "'";

                try {
                    ResultSet resultSet = c.statement.executeQuery(q);
                    if (resultSet.next()) {
                        setVisible(false);
                        new main_Class(pin);
                    } else {
                        JOptionPane.showMessageDialog(null, "Your card no. and pin are incorrect!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (e.getSource() == button2) {
                TextField1.setText("");
                PasswordField1.setText("");
            } else if (e.getSource() == button3) {
                new Signup();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid action source!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
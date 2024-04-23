package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;

    JButton b1, b2;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,750);
        add(l3);

        JLabel label1 = new JLabel("ENETR AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,150,400,35);
        l3.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(71, 88, 241));
        textField.setForeground(Color.white);
        textField.setBounds(460,200,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,325,150,35);
        b1.setBackground(new Color(71, 88, 241));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,372,150,35);
        b2.setBackground(new Color(71, 88, 241));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = dateFormat.format(new Date());

            if (e.getSource()==b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Connn c = new Connn();
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + dateString + "','Deposit', '" + amount + "')");

                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " has been deposited successfully.");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if (e.getSource()==b2){
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Deposit("");
    }
}

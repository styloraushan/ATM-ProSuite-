package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(255,254,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("Your Statement");
        label2.setFont(new Font("System", Font.BOLD,15));
        label2.setBounds(140,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,450,300,20);
        add(label4);

        try{
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("card_number").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
int balance=0;
        try {
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                // Fetching date, transaction type, and amount from the result set
                String transactionDateTime = resultSet.getString("date");
                String transactionType = resultSet.getString("transaction_type");
                String transactionAmount = resultSet.getString("amount");

                // No need to format the date if it's already in the desired format

                // Updating label1 with the formatted transaction details
                label1.setText(label1.getText() + "<html>" + transactionDateTime + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + transactionType + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + transactionAmount + "<br><br><html>");

                // Calculating balance based on transaction type
                if (transactionType.equals("Deposit")) {
                    balance += Double.parseDouble(transactionAmount);
                } else {
                    balance -= Double.parseDouble(transactionAmount);
                }
            }
            // Setting the total balance label
            label4.setText("Your Total Balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }


        button = new JButton("Exit");
        button.setBounds(20,500,90,25);
        button.addActionListener(this);
        button.setBackground(Color.red);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}

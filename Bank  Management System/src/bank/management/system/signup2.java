package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    signup2(String formno) {
        super("APPLICATION FORM :");

        this.formno = formno;

    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank2.png"));
    Image i2= i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
    ImageIcon i3= new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    image.setBounds(5,10,200,100);
    add(image);



    JLabel label1=new JLabel("Page 2");
    label1.setBounds(380,650,600,30);
    label1.setFont(new Font("Ralway",Font.BOLD,22));
    add(label1);

    JLabel label2=new JLabel("Additional Details");
    label2.setBounds(330,90,600,40);
    label2.setFont(new Font("Ralway",Font.BOLD,22));
    add(label2);

    JLabel label3=new JLabel("Religion : ");
    label3.setBounds(120,160,150,30);
    label3.setFont(new Font("Ralway",Font.BOLD,22));
    add(label3);

    String religion[]={"Hindu","Muslim","sikh","christian","other"};

    combobox=new JComboBox(religion );
    combobox.setBackground(new Color(237, 175, 189));
    combobox.setFont(new Font("Ralway",Font.BOLD,14));
    combobox.setBounds(350,160,320,30);
    add(combobox);

    JLabel label4=new JLabel("Category :");
    label4.setBounds(120,210,150,30);
    label4.setFont(new Font("Ralway",Font.BOLD,22));
    add(label4);


    String Category[]={"General","OBC","SC","other"};

    combobox2=new JComboBox(Category);
    combobox2.setBackground(new Color(237, 175, 189));
    combobox2.setFont(new Font("Ralway",Font.BOLD,14));
    combobox2.setBounds(350,210,320,30);
    add(combobox2);

    JLabel label5=new JLabel("Income :");
    label5.setBounds(120,260,150,30);
    label5.setFont(new Font("Ralway",Font.BOLD,22));
    add(label5);

    String Income[]={"Null","<1,50,000",">2,50,000","5.00,000","Upto 10,00,000","Above 10,00,000 "};

    combobox3=new JComboBox(Income);
    combobox3.setBackground(new Color(237, 175, 189));
    combobox3.setFont(new Font("Ralway",Font.BOLD,14));
    combobox3.setBounds(350,260,320,30);
    add(combobox3);

    JLabel label6=new JLabel("Qualification :");
    label6.setBounds(120,310,150,30);
    label6.setFont(new Font("Ralway",Font.BOLD,22));
    add(label6);

    String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
    combobox4 = new JComboBox(educational);
    combobox4.setBackground(new Color(237, 175, 189));
    combobox4.setFont(new Font("Railway", Font.BOLD, 14));
    combobox4.setBounds(350, 310, 320, 30);
    add(combobox4);

    JLabel label7=new JLabel("Occupation :");
    label7.setBounds(120,360,150,30);
    label7.setFont(new Font("Ralway",Font.BOLD,22));
    add(label7);

    String Occupation[] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
    combobox5 = new JComboBox(Occupation);
    combobox5.setBackground(new Color(237, 175, 189));
    combobox5.setFont(new Font("Railway", Font.BOLD, 14));
    combobox5.setBounds(350, 360, 320, 30);
    add(combobox5);

    JLabel label8=new JLabel("PAN Number :");
    label8.setBounds(120,410,180,30);
    label8.setFont(new Font("Ralway",Font.BOLD,22));
    add(label8);

    textPan=new JTextField();
    textPan.setBackground(new Color(237, 175, 189));
    textPan.setFont(new Font("ralway",Font.BOLD,14));
    textPan.setBounds(350, 410, 320, 30);
    add(textPan);

    JLabel label9=new JLabel("Aadhar Number :");
    label9.setBounds(120,460,200,30);
    label9.setFont(new Font("Ralway",Font.BOLD,22));
    add(label9);

    textAadhar=new JTextField();
    textAadhar.setBackground(new Color(237, 175, 189));
    textAadhar.setFont(new Font("ralway",Font.BOLD,14));
    textAadhar.setBounds(350, 460, 320, 30);
    add(textAadhar);

    JLabel label10=new JLabel("Senior Citizen :");
    label10.setBounds(120,510,200,30);
    label10.setFont(new Font("Ralway",Font.BOLD,22));
    add(label10);

    r1 = new JRadioButton("Yes");
    r1.setBackground(new Color(237, 175, 189));
    r1.setFont(new Font("Ralway", Font.BOLD,22));
    r1.setBounds(350, 510, 80, 30);
    add(r1);

    r2 = new JRadioButton("No");
    r2.setBackground(new Color(237, 175, 189));
    r2.setFont(new Font("Ralway", Font.BOLD,22));
    r2.setBounds(460, 510, 80, 30);
    add(r2);


    ButtonGroup g1=new ButtonGroup();
    g1.add(r1);
    g1.add(r2);



    JLabel label11=new JLabel("Existing Account :");
    label11.setBounds(120,560,200,30);
    label11.setFont(new Font("Ralway",Font.BOLD,22));
    add(label11);

    e1 = new JRadioButton("Yes");
    e1.setBackground(new Color(237, 175, 189));e1.setFont(new Font("Ralway", Font.BOLD,22));
    e1.setBounds(350, 560, 80, 30);
    add(e1);

    e2 = new JRadioButton("No");
    e2.setBackground(new Color(237, 175, 189));
    e2.setFont(new Font("Ralway", Font.BOLD,22));
    e2.setBounds(460, 560, 80, 30);
    add(e2);


    ButtonGroup g11=new ButtonGroup();
    g11.add(e1);
    g11.add(e2);


    JLabel label12=new JLabel("Form No :");
    label12.setBounds(600,10,150,30);
    label12.setFont(new Font("Ralway",Font.BOLD,22));
    add(label12);

    JLabel label13=new JLabel(formno);
    label13.setBounds(700,10,150,30);
    label13.setFont(new Font("Ralway",Font.BOLD,22));
    add(label13);

    next = new JButton("Next");
    next.setFont(new Font("Raleway",Font.BOLD, 14));
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setBounds(590,650,80,30);
    next.addActionListener(this);
    add(next);

    setSize(850,750);
    setLocation(450,80);
    setLayout(null);
    getContentPane().setBackground(new Color(237, 175, 189));
    setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();
        String cat = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();
        String pan = textPan.getText();
        String adhar = textAadhar.getText();
        String scitizen = null;
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eaccount = null;
        if (e1.isSelected()) {
            eaccount = "Yes";
        } else if (e2.isSelected()) {
            eaccount = "No";
        }

        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Connn c1 = new Connn();
                String q = "insert into signuptwo values('" + formno + "','" + rel + "','" + cat + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + adhar + "','" + scitizen + "','" + eaccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }


    public static void main(String[] args) {

        new signup2("");
    }
}

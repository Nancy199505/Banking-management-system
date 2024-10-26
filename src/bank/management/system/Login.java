package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;


    Login(){
        super("BANK MANAGEMENT SYSTEM");

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image I2=I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3= new ImageIcon(I2);
        JLabel image= new JLabel(I3);
        image.setBounds(300,10,100,100);
        add(image);


        ImageIcon II1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image II2=II1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon II3= new ImageIcon(II2);
        JLabel iimage= new JLabel(II3);
        iimage.setBounds(550,320,100,100);
        add(iimage);


        label1= new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("SegoeUISemibold", Font.BOLD,35));
        label1.setBounds(200,120,450,40);
        add(label1);


        label2= new JLabel("Card No. :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Book Antiqua", Font.BOLD,30));
        label2.setBounds(150,175,450,40);
        add(label2);


        textField2=new JTextField(10);
        textField2.setBounds(350,180,200,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3= new JLabel("PIN :");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Book Antiqua", Font.BOLD,30));
        label3.setBounds(150,230,450,40);
        add(label3);


        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(350,235,200,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);


        button1=new JButton("LOGIN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBounds(280,280,100,28);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        add(button1);


        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBounds(400,280,100,28);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        add(button2);


        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBounds(280,320,220,28);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.addActionListener(this);
        add(button3);


        ImageIcon III1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image III2=III1.getImage().getScaledInstance(900,450, Image.SCALE_DEFAULT);
        ImageIcon III3= new ImageIcon(III2);
        JLabel iiimage= new JLabel(III3);
        iiimage.setBounds(0,0,900,450);
        add(iiimage);

        setLayout(null);
        setSize(750,450);
        setLocation(350,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){

            }
            else if (e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource()==button3){

            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}

package bank.management.system;

import com.toedter.calender.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Signup extends JFrame {

    JTextField textName , textFname;
    JDateChooser dateChooser;

    Random r1=new Random();
    long first4= (r1.nextLong() % 9000L) + 1000L;
    String first=" "+ Math.abs(first4);
    Signup(){

        super("APPLICATION FORM");

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image I2=I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon I3= new ImageIcon(I2);
        JLabel image= new JLabel(I3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO. " + first );
        label1.setBounds(190,20,600,30);
        label1.setFont(new Font("Raleway",Font.BOLD,32));
        add(label1);

        JLabel label2= new JLabel("Page 1 " );
        label2.setBounds(350,60,600,20);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3= new JLabel("Personal Information " );
        label3.setBounds(290,85,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel labelName= new JLabel("Name :");
        labelName.setFont(new Font ("Raleway",Font.BOLD,20));
        labelName.setBounds(100,180,100,25);
        add(labelName);

        textName= new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,180,400,25);
        add(textName);

        JLabel labelfName= new JLabel("Father's Name :");
        labelfName.setFont(new Font ("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,230,200,25);
        add(labelfName);

        textFname= new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,230,400,25);
        add(textFname);

        JLabel DOB= new JLabel("Date of Birth :");
        DOB.setFont(new Font ("Raleway",Font.BOLD,20));
        DOB.setBounds(100,330,200,25);
        add(DOB);







        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(800,670);
        setLocation(300,40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();

    }
}

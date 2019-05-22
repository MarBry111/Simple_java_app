package marbry.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstApp {
    //psvm
    //play there is the method to play in this class
    public static void main(String[] args) {
        JFrame frame = new JFrame("First app");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //get and set functions
        frame.setSize(200, 400);
        //we can set what layaut we only want
        frame.setLayout(null);
        frame.setLocation(600,200);

        int xPosition = 20;
        int yPosition = 20;
        int height = 20;
        int width = 150;

        JLabel lblEmail = new JLabel("Write your email");
        lblEmail.setBounds(xPosition,yPosition, width, height);
        frame.add(lblEmail);

        JTextField jtfEmail = new JTextField();
        jtfEmail.setBounds(xPosition,3*yPosition, width, height);
        frame.add(jtfEmail);

        JLabel lblGender = new JLabel("Chose your gender");
        lblGender.setBounds(xPosition,5*yPosition, width, height);
        frame.add(lblGender);

//////////// JRadio Buttons
        JRadioButton jrbMen = new JRadioButton("Men");
        jrbMen.setBounds(xPosition,7*yPosition, width, height);
        frame.add(jrbMen);

        JRadioButton jrbWomen = new JRadioButton("Women");
        jrbWomen.setBounds(xPosition,9*yPosition, width, height);
        frame.add(jrbWomen);
        // Adding JRB to one group
        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(jrbMen);
        bgGender.add(jrbWomen);
        //deafault option - selected Men button
        jrbMen.setSelected(true);


        JButton buttAppend = new JButton("Append");
        buttAppend.setBounds(xPosition, 11*yPosition, width, height);
        frame.add(buttAppend);

        JLabel jlbInfo = new JLabel();
        jlbInfo.setBounds(xPosition, 13*yPosition, width, height);
        frame.add(jlbInfo);

///////////// Action listeners - adding to button options to write to console
        buttAppend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //checking if field for email is empty, adding in front of ! - negation
                if( jtfEmail.getText().equals("") ){
                    //change field color to red
                    jlbInfo.setForeground(Color.RED);
                    //print to console
                    System.out.println("Error, empty email");
                    //write to our field under button
                    jlbInfo.setText("Error, empty email");
                }
                else {
                    //sout
                    jlbInfo.setForeground(Color.BLACK);
                    System.out.println("Saving to database");
                    System.out.println("Email: " + jtfEmail.getText());
                    System.out.println("Gender: " + (jrbMen.isSelected() ? "men" : "women"));
                    //write to our field under button
                    jlbInfo.setText("Everything correct");
                    //clear email field
                    jtfEmail.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}

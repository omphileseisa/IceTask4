/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask4;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author omphi
 */
public class IceTask4 {

    public static void main(String[] args) {
    JFrame frame = new  JFrame("Student Infromation");
       //set frame properties
       frame.setSize(350,300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //Create Layout
       frame.setLayout(new FlowLayout());
       //Create Lable 
       JLabel lblBookID = new  JLabel("BookID");
       JLabel lblAuthor = new  JLabel("Auther");
       JLabel lblNumberOfBook = new  JLabel("NumberOfBook");
       JLabel lblCost = new  JLabel("Cost");
       
       JTextField textBookID = new JTextField(30);
       JTextField textAuthor = new JTextField(30);
       JTextField textNumberOfBook = new JTextField(30);
       JTextField textCost = new JTextField(30);
       
       
       
       
       //Create Button
       JButton btnDisplay = new JButton("Display information");
       JButton btnClear = new  JButton("Clear");
       JButton btnExit =  new  JButton("Exit");
       //Create out area
       JTextArea textOutput = new JTextArea(5, 25);
       textOutput.setEditable(false);
       
       
       //Add componets to the frame/ window
       frame.add(lblBookID);
       frame.add(textBookID);
        
       
       frame.add(lblAuthor);
       frame.add(textAuthor);
       
       frame.add(lblNumberOfBook);
       frame.add(textNumberOfBook);
       
       frame.add(lblCost);
       frame.add(textCost);
       
       frame.add(btnDisplay);
       frame.add(btnClear);
       frame.add(btnExit);
      
       
       btnDisplay.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               
               String BookID;
               String Author;
               int NumberOfBook;
               double Cost;
               
               //asign values from textfield
               BookID = textBookID.getText();
               Author = textAuthor.getText();
               NumberOfBook = Integer.parseInt(textNumberOfBook.getText());
               Cost = Double.parseDouble(textCost.getText());
               
               textOutput.setText("enter your Book ID:" + BookID
               + "enter Author:" + Author +
                       "Number of Books Available: " + NumberOfBook + "\nCost:" + Cost);
               
           }
                    
       });
       
      btnClear.addActionListener(new ActionListener(){
          
          @Override
          public void actionPerformed(ActionEvent e){
              textBookID.setText(" ");
              textAuthor.setText(" ");
              textNumberOfBook.setText(" ");
              textCost.setText(" ");
              
          }
                    
      });
      
       btnExit.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed( ActionEvent e){
               System.exit(0);
           }
       }
       );
       
       
        frame.setVisible(true);
                 
    }
}

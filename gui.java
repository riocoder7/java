import java.io.*;
import javax.swing.*;
import java.awt.*;

import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.event.*;

public class gui {

  public static void main(String args[]) {

    JFrame frame = new JFrame("Rio Coder");

    JLabel lebel = new JLabel("hey this is my first java gui application ");
    lebel.setBounds(10, 10, 350, 20);
    frame.add(lebel);

    // Creating instance of JButton
    JButton button = new JButton("Previous");
    button.setBounds(20, 35, 100, 30);
    frame.add(button);

    JButton button2 = new JButton("Next");
    button2.setBounds(200, 35, 100, 30);
    frame.add(button2);

    // input box
    TextField text = new TextField("enter your first name :");
    text.setBounds(20, 100, 400, 30);

    TextField text2 = new TextField("enter your secound name :");
    text2.setBounds(20, 140, 400, 30);

    TextField text3 = new TextField("enter your surname :");
    text3.setBounds(20, 180, 400, 30);

    frame.add(text);
    frame.add(text2);
    frame.add(text3);

    // creating radio button
    JRadioButton radio1 = new JRadioButton("Male");
    radio1.setBounds(20, 220, 100, 30);

    JRadioButton radio2 = new JRadioButton("Female");
    radio2.setBounds(20, 250, 100, 30);

    ButtonGroup bg = new ButtonGroup();
    bg.add(radio1);
    bg.add(radio2);

    frame.add(radio1);
    frame.add(radio2);

    // cheakbox

    JLabel cheakbox_lebel = new JLabel("choose your course ?");
    cheakbox_lebel.setBounds(20, 290, 350, 20);
    frame.add(cheakbox_lebel);

    Checkbox checkbox1 = new Checkbox("Java");
    checkbox1.setBounds(40, 320, 80, 20);
    frame.add(checkbox1);

    Checkbox checkbox2 = new Checkbox("Python");
    checkbox2.setBounds(40, 340, 80, 20);
    frame.add(checkbox2);

    Checkbox checkbox3 = new Checkbox("javaScript");
    checkbox3.setBounds(40, 360, 80, 20);
    frame.add(checkbox3);

    Checkbox checkbox4 = new Checkbox("ReactJs");
    checkbox4.setBounds(40, 380, 80, 20);
    frame.add(checkbox4);

    Checkbox conformCheckbox = new Checkbox("conform");
    conformCheckbox.setBounds(20, 410, 80, 50);
    frame.add(conformCheckbox);

    // submit button

    JButton submit = new JButton("submit");
    submit.setBounds(20, 480, 400, 30);
    frame.add(submit);

    // 400 width and 500 height
    frame.setSize(500, 600);

    // using no layout managers
    frame.setLayout(null);

    // making the frame visible
    frame.setVisible(true);

  }

}
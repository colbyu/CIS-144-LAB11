package lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Colby Underhill, Lab 11

public class SimpleGui extends JFrame implements ActionListener 
    {
    private static final long serialVersionUID = 1L;
    JLabel l1, l2, l3, l4;
    JButton b1, b2;
    JTextField t1, t2, t3;
    JCheckBox check1;
    SimpleGui() 
        {
        l1 = new JLabel(" Current Salary (numbers only, no symbols or commas)");
        l2 = new JLabel(" Percent Rate (as a decimal value)");
        l3 = new JLabel(" New Salary");
        l4 = new JLabel("  ");
        b1 = new JButton("COMPUTE");
        b2 = new JButton("EXIT");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        check1 = new JCheckBox("Bonus Pay");
        check1.setSelected(true);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(check1);
        add(l4);     
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(e -> System.exit(0));
        check1 = new JCheckBox ("click to select");
        check1.setSelected(true);
        setSize(500, 300);
        setLayout(new GridLayout(5, 2));
        setTitle("Salary Calculators");
        }
    public void actionPerformed(ActionEvent ae) 
        {
        float a, b, c;
        if (ae.getSource() == b1) 
            {
            a = Float.parseFloat(t1.getText());
            b = Float.parseFloat(t2.getText());
            c = (a*b)+a;
            t3.setText(String.valueOf(c));
            if (check1.isSelected());
                {
                c = (a*b) + a + 500;
                t3.setText(String.valueOf(c));
                }
            }
        }
    public static void main(String args[]) 
        {
        SimpleGui a = new SimpleGui();
        a.setVisible(true);
        a.setLocation(200, 200);
        }
    }

package lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Colby Underhill, Lab 11

public class SimpleGui extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JLabel l1, l2, l3;
    JButton b1;
    JTextField t1, t2, t3;

    SimpleGui() {
        l1 = new JLabel(" INPUT 1");
        l2 = new JLabel(" INPUT 2");
        l3 = new JLabel(" OUTPUT");
        b1 = new JButton("BUTTON 1");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);

        setSize(500, 300);
        setLayout(new GridLayout(4, 2));
        setTitle("Simple Java GUI");
    }

    public void actionPerformed(ActionEvent ae) {
        float a, b, c;
        if (ae.getSource() == b1) {
            a = Float.parseFloat(t1.getText());
            b = Float.parseFloat(t2.getText());
            c = a + b;
            t3.setText(String.valueOf(c));
        }
    }

    public static void main(String args[]) {
        SimpleGui a = new SimpleGui();
        a.setVisible(true);
        a.setLocation(200, 200);
    }
}

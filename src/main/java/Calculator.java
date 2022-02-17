import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public Calculator() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame

        JTextField w = new JTextField();
        w.setLayout(new BoxLayout(w, BoxLayout.X_AXIS));
        frame.add(w);

        JPanel panel7 = new JPanel();
        panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));
        frame.add(panel7);


        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel7.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel7.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel7.add(panel3);


        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel7.add(panel4);

        JButton button1 = new JButton("7");
        panel1.add(button1);
        JButton button2 = new JButton("4");
        panel1.add(button2);
        JButton button3 = new JButton("1");
        panel1.add(button3);
        JButton button4 = new JButton("0");
        panel1.add(button4);

        JButton button5 = new JButton("8");
        panel2.add(button5);
        JButton button6 = new JButton("5");
        panel2.add(button6);
        JButton button7 = new JButton("2");
        panel2.add(button7);
        JButton button8 = new JButton(".");
        panel2.add(button8);

        JButton button9 = new JButton("9");
        panel3.add(button9);
        JButton button10 = new JButton("6");
        panel3.add(button10);
        JButton button11 = new JButton("3");
        panel3.add(button11);
        JButton button12 = new JButton("=");
        panel3.add(button12);

        JButton button13 = new JButton("/");
        panel4.add(button13);
        JButton button14 = new JButton("*");
        panel4.add(button14);
        JButton button15 = new JButton("-");
        panel4.add(button15);
        JButton button16 = new JButton("+");
        panel4.add(button16);




        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

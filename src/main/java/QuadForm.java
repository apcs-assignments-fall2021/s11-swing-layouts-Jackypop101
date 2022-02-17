import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadForm {

    public QuadForm() {
        //1. Create the frame.
        JFrame frame = new JFrame("Quadratic Formula");
        // frame.setLayout(...);

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        JLabel label = new JLabel ("ax^2 + bx + c = 0");
        frame.add(label);
        LTPanel ltenetwork = new LTPanel ("a =", 10);
        frame.add(ltenetwork);
        LTPanel ltenetwork1 = new LTPanel ("b =", 10);
        frame.add(ltenetwork1);
        LTPanel ltenetwork2 = new LTPanel ("c =", 10);
        frame.add(ltenetwork2);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        frame.add(panel1);

        JButton button1 = new JButton()

        //4. Size the frame.
        // frame.setSize(400, 400);
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        QuadForm qf = new QuadForm();
    }
}

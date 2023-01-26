
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gui_b {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");
        JTextField t1, t2, t3, t4;
        JButton b = new JButton("Submit");
        b.setBounds(50, 300, 200, 30);
        JLabel l1 = new JLabel("Enter the HRA");
        l1.setBounds(50, 70, 200, 30);
        JLabel l2 = new JLabel("Enter the TA");
        l2.setBounds(50, 120, 200, 30);
        JLabel l3 = new JLabel("Enter the MA");
        l3.setBounds(50, 170, 200, 30);
        JLabel l4 = new JLabel("Enter the PF.");
        l4.setBounds(50, 220, 200, 30);
        t1 = new JTextField();
        t1 = new JTextField();
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField();
        t2.setBounds(50, 150, 200, 30);
        t3 = new JTextField();
        t3.setBounds(50, 200, 200, 30);
        t4 = new JTextField();
        t4.setBounds(50, 250, 200, 30);
        JButton br = new JButton("Sub");
        br.setBounds(50, 400, 200, 30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        ActionListener listener = new istener();
        br.addActionListener(listener);
        f.add(br);

        final ActionListener listene = new OKListener();
        b.addActionListener(listene);
        f.add(b);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

    }

    public class SecondFrame {
        private JFrame f = new JFrame("Second");

        public SecondFrame() {

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300, 300);
            f.setVisible(true);
        }
    }

}

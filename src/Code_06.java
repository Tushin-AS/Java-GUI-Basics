// ---- BorderLayout ----

import javax.swing.*;
import java.awt.*;

public class Code_06 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(50,100));
        panel3.setPreferredSize(new Dimension(50,100));
        panel4.setPreferredSize(new Dimension(100,50));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
    }
}

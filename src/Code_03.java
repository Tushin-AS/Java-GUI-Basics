// ---- JLabel ----

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Code_03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon imageIcon = new ImageIcon("Images/computer01.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.RED,4);

        // JLabel label = new JLabel("Hello World.");
        label.setText("Hello World.");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.BOTTOM); // TOP, CENTER, BOTTOM
        label.setForeground(new Color(12,25,147));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(50); // +ve adds distance, -ve removes
        label.setBackground(new Color(0xC0C0C0));
        label.setOpaque(true); // Display Background Color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // TOP, CENTER, BOTTOM ;; icon + text
        label.setHorizontalAlignment(JLabel.CENTER); // LEFT, CENTER, RIGHT ;; icon + text
        //label.setBounds(65,50,350,350);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack(); // add all components before pack



    }
}

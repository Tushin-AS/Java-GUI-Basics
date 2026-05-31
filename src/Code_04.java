// ---- JPanel ----

import javax.swing.*;
import java.awt.*;

public class Code_04 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JLabel label = new JLabel();

        ImageIcon icon = new ImageIcon("Images/icon_java.png");

        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setLayout(null);

        redPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}

// Linked with Code_05

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameB extends JFrame implements ActionListener {
    ImageIcon image = new ImageIcon("Images/icon_java.png");
    ImageIcon icon = new ImageIcon("Images/pointing.png");

    JButton button;
    JLabel label;

    FrameB() {
        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-12);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);
        // button.addActionListener(e -> System.out.println("Something.."));    Lamda Expression.

        label = new JLabel();
        label.setIcon(image);
        label.setBounds(150,250,150,250);
        label.setVisible(false);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLayout(null);
        this.setIconImage(image.getImage());

        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("HALA MADRID");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

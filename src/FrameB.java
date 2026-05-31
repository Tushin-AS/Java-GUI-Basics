// Linked with Code_05

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameB extends JFrame implements ActionListener {
    ImageIcon image = new ImageIcon("Images/icon_java.png");

    JButton button;

    FrameB() {
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLayout(null);
        this.setIconImage(image.getImage());

        this.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("HALA MADRID");
        }
    }
}

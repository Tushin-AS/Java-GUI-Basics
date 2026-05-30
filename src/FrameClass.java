// Linked with Code_02

import javax.swing.*;
import java.awt.*;

public class FrameClass extends JFrame {
    ImageIcon image = new ImageIcon("Images/icon_java.png");

    FrameClass() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,250);
        this.setTitle("JFrame Title Bar......");
        this.setResizable(false);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(12,45,120));
    }
}

// ---- JFrame ----

import javax.swing.*;
import java.awt.*;

public class Code_01 {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Images/icon_java.png");

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,250);
        frame.setTitle("JFrame Title Bar......");
        frame.setResizable(false);
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(Color.BLUE);
        frame.getContentPane().setBackground(new Color(12,45,120));
        //frame.getContentPane().setBackground(new Color(0x123FFF));
    }
}

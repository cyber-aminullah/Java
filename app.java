import javax.swing.*;
import java.awt.*;

class app{
public static void main(String[] args)
{
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setSize(400,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel = new JPanel();
panel.setBackground(Color.green);
frame.add(panel);

JLabel label = new JLabel("Welcome to AIU");
frame.add(label1);
frame.add(label1, BorderLayout.SOUTH);
}
}

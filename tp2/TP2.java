import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TP2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TP2");
        frame.setTitle("TP2");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(82, 67, 180));

        ImageIcon icon = new ImageIcon("D:\\UNI\\IHM\\tp2\\7756321.png");
        frame.setIconImage(icon.getImage());

        JLabel lab = new JLabel();
        lab.setText("This is TP2");
        lab.setBounds(0, 0, 200, 200);
        frame.add(lab);

        frame.setVisible(true);
    }
}

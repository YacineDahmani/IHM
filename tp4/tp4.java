import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class tp4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TP4");
        frame.setTitle("TP4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        frame.getContentPane().setBackground(Color.GRAY);

        ImageIcon icon = new ImageIcon("D:\\UNI\\IHM\\tp4\\7756321.png");
        frame.setIconImage(icon.getImage());

        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 80, 80);
        panel1.setBackground(Color.BLUE);
        panel1.add(new JLabel("Panel 1"));
        panel1.setBorder(border);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(80, 80, 80, 80);
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("Panel 2"));
        panel2.setBorder(border);
        frame.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(160, 160, 80, 80);
        panel3.setBackground(Color.RED);
        panel3.add(new JLabel("Panel 3"));
        panel3.setBorder(border);
        frame.add(panel3);

        JPanel panel4 = new JPanel();
        panel4.setBounds(240, 240, 80, 80);
        panel4.setBackground(Color.YELLOW);
        panel4.add(new JLabel("Panel 4"));
        panel4.setBorder(border);
        frame.add(panel4);

        frame.setVisible(true);
    }
}

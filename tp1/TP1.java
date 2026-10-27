import javax.swing.JFrame;
public class TP1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("TP1");
        frame.setTitle("TP1");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0, 117, 255));
        ImageIcon icon = new ImageIcon("D:\\UNI\\IHM\\tp2\\7756321.png");
        frame.setIconImage(icon.getImage());
        JLabel lab = new JLabel();
        label.d.setText("Hello World");
        frame.add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
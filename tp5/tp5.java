package tp5;

import javax.swing.*;
import java.awt.*;

public class tp5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TP5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel container = new JPanel(null);
        container.setPreferredSize(new Dimension(400, 400));

        JPanel topPanel = new JPanel(null);
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.setBounds(0, 0, 400, 100);
        JLabel titleLabel = new JLabel("JAVA", SwingConstants.CENTER);
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
        titleLabel.setForeground(Color.GREEN);
        titleLabel.setBounds(0, 0, 400, 100);
        topPanel.add(titleLabel);

        JPanel leftPanel = new JPanel(null);
        leftPanel.setBackground(Color.CYAN);
        leftPanel.setBounds(0, 100, 133, 300);

        JPanel centerPanel = new JPanel(null);
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBounds(133, 100, 134, 300);
        ImageIcon originalIcon = new ImageIcon("tp5/7756321.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel("image", new ImageIcon(scaledImage), SwingConstants.CENTER);
        imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        imageLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        imageLabel.setBounds(0, 0, 134, 300);
        centerPanel.add(imageLabel);

        JPanel rightPanel = new JPanel(null);
        rightPanel.setBackground(Color.YELLOW);
        rightPanel.setBounds(267, 100, 133, 300);
        JButton button = new JButton("Send");
        button.setBounds(43, 255, 80, 30);
        rightPanel.add(button);

        container.add(topPanel);
        container.add(leftPanel);
        container.add(centerPanel);
        container.add(rightPanel);

        frame.setContentPane(container);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
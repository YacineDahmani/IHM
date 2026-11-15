package tp5;

import javax.swing.*;
import java.awt.*;

public class tp5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TP5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        topPanel.setPreferredSize(new Dimension(400, 90));
        JLabel titleLabel = new JLabel("JAVA");
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
        titleLabel.setForeground(Color.GREEN);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        topPanel.add(titleLabel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.CYAN);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftPanel.setPreferredSize(new Dimension(120, 0));

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ImageIcon originalIcon = new ImageIcon("tp5/7756321.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel("image", new ImageIcon(scaledImage), SwingConstants.CENTER);
        imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        imageLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        centerPanel.add(imageLabel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rightPanel.setPreferredSize(new Dimension(120, 0));

        bottomPanel.add(leftPanel, BorderLayout.WEST);
        bottomPanel.add(centerPanel, BorderLayout.CENTER);
        bottomPanel.add(rightPanel, BorderLayout.EAST);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
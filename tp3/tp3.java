import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class tp3 { 
    public static void main(String[] args) { 
        JFrame f = new JFrame("TP3"); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(400, 400); 
        f.setLayout(null); 
        
        ImageIcon icon = new ImageIcon("D:\\UNI\\IHM\\tp3\\7756321.png"); 
        
        Image scaledImage = icon.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        JLabel lab = new JLabel(); 
        lab.setText("This is TP3"); 
        lab.setBounds(75, 75, 250, 250); 
        lab.setBackground(Color.LIGHT_GRAY); 
        lab.setOpaque(true); 
        
        lab.setIcon(scaledIcon); 
        
        Border border = BorderFactory.createLineBorder(Color.pink, 3); 
        lab.setBorder(border); 
        
        f.add(lab); 
        f.setVisible(true); 
    } 
}

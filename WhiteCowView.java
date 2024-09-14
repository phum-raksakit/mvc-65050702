import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class WhiteCowView {
    //show white cow information
    public WhiteCowView(String[] data) {
        JFrame infoFrame = new JFrame("Cow Information");
        infoFrame.setSize(300, 150);
        infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        infoFrame.setLocationRelativeTo(null); 

        JLabel ID = new JLabel("ID : " + data[0]);
        JLabel color = new JLabel("Color : " + data[1]);
        JLabel age = new JLabel("Age : " + data[2] + " Years " + data[3] + " Months");
        
        ID.setAlignmentX(Component.CENTER_ALIGNMENT);
        color.setAlignmentX(Component.CENTER_ALIGNMENT);
        age.setAlignmentX(Component.CENTER_ALIGNMENT);
        

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton milk = new JButton("MILK");
        JButton feedLemon = new JButton("Feed The Lemon");

        milk.setAlignmentX(Component.CENTER_ALIGNMENT);
        feedLemon.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(milk);
        buttonPanel.add(feedLemon);
        
        panel.add(ID);
        panel.add(color);
        panel.add(age);
        panel.add(buttonPanel);

        infoFrame.add(panel);
        infoFrame.setVisible(true);
    }
}

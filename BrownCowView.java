import javax.swing.*;
import java.awt.*;

public class BrownCowView {
    public BrownCowView(String[] data) {
        JFrame infoFrame = new JFrame("Brown Cow Information");
        infoFrame.setSize(300, 150);
        infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        infoFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel ID = new JLabel("ID: " + data[0]);
        JLabel color = new JLabel("Color: " + data[1]);
        JLabel age = new JLabel("Age: " + data[2] + " Years " + data[3] + " Months");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton milk = new JButton("MILK");
        milk.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(milk);

        panel.add(ID);
        panel.add(color);
        panel.add(age);
        panel.add(buttonPanel);

        infoFrame.add(panel);
        infoFrame.setVisible(true);
    }

}

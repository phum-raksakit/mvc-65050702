import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserView {
    private JFrame frame;
    private JTextField textField;
    private JButton button;

    //Show Menu
    public UserView() {
        frame = new JFrame("Search ID");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null); 

        JLabel label = new JLabel("Enter ID:");
        frame.add(label);

        textField = new JTextField(8);
        frame.add(textField);

        button = new JButton("Confirm");
        frame.add(button);

        frame.setVisible(true);
    }

    //Get Input
    public String getTextFieldValue() {
        return textField.getText();
    }

    //Check Button
    public void confirmButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    //Show not found
    public void notFound(){
        JOptionPane.showMessageDialog(null, "ID not found.");
    }

    //Show Invalid ID
    public void invalidID(){
        JOptionPane.showMessageDialog(null, "Invalid ID format.");
    }
}

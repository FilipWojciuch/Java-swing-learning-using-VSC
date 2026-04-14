import javax.swing.*;
import java.awt.*;

public class LoginGUI{
   public LoginGUI(){
    JFrame frame = new JFrame("LoginGUI");
    JButton button = new JButton("Click Me");
    JLabel label = new JLabel("Hello, Swing!");
    JCheckBox checkbox = new JCheckBox("Check Me");
    JRadioButton radiobutton = new JRadioButton("Select me");
    frame.setSize(150, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    frame.add(button);
    frame.add(label);
    frame.add(checkbox);
    frame.add(radiobutton);
    frame.setVisible(true);
}
}
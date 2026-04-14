import javax.swing.*;
import java.awt.*;

public class LoginGUI{
   public LoginGUI(){
    JFrame frame = new JFrame("LoginGUI");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

    JLabel system_status = new JLabel("System OK", SwingConstants.CENTER);
    JLabel user_details = new JLabel ("User: You");
    JLabel real_time_data = new JLabel ("Calculating live data...", SwingConstants.CENTER);
    JLabel app_status = new JLabel ("App OK");
    JButton start = new JButton ("Start Process");
    JButton end = new JButton ("End Process");
    JButton left = new JButton ("Back");
    JButton right = new JButton ("Next");
    
    JPanel border_layout_panel = new JPanel(new BorderLayout());
    border_layout_panel.add(real_time_data, BorderLayout.NORTH);
    border_layout_panel.add(user_details, BorderLayout.WEST);
    border_layout_panel.add(app_status, BorderLayout.EAST);
    border_layout_panel.add(system_status,BorderLayout.CENTER);
    
    JPanel grid_layout_panel = new JPanel(new GridLayout(1,4));
    grid_layout_panel.add(left);
    grid_layout_panel.add(start);
    grid_layout_panel.add(end);
    grid_layout_panel.add(right);
    frame.add(border_layout_panel);
    frame.add(grid_layout_panel, BorderLayout.SOUTH);
    frame.setVisible(true);
}
}
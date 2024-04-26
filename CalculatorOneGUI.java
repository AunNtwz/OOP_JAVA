import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    private JFrame frame;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2, bn3, bn4;
    private JPanel panel;
    public CalculatorOneGUI(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,0));
        
        tf1 = new JTextField(40);
        tf2 = new JTextField(40);
        tf3 = new JTextField(40);
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("x");
        bn4 = new JButton("/");
        panel = new JPanel();
        panel.add(bn1); panel.add(bn2);
        panel.add(bn3); panel.add(bn4);
        frame.add(tf1); frame.add(tf2);
        frame.add(panel); frame.add(tf3);
        
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       new CalculatorOneGUI();
 }
}
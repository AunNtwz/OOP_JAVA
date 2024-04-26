import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI{
    private JFrame frame;
    private JTextField tf1;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9;
    private JButton bn10, bn11, bn12, bn13, bn14, bn15;
    private JPanel panel;
    public CalculatorTwoGUI(){
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(2,0));

        tf1 = new JTextField();
        bn0 = new JButton("0"); bn1 = new JButton("1");
        bn2 = new JButton("2"); bn3 = new JButton("3");
        bn4 = new JButton("4"); bn5 = new JButton("5");
        bn6 = new JButton("6"); bn7 = new JButton("7");
        bn8 = new JButton("8"); bn9 = new JButton("9");
        bn10 = new JButton("c"); bn11 = new JButton("=");
        bn12 = new JButton("+"); bn13 = new JButton("-");
        bn14 = new JButton("x"); bn15 = new JButton("/");
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        panel.add(bn7); panel.add(bn8); panel.add(bn9); panel.add(bn12);
        panel.add(bn4); panel.add(bn5); panel.add(bn6); panel.add(bn13);
        panel.add(bn1); panel.add(bn2); panel.add(bn3); panel.add(bn14);
        panel.add(bn0); panel.add(bn10); panel.add(bn11); panel.add(bn15);
        frame.add(tf1, BorderLayout.NORTH);
        frame.add(panel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}

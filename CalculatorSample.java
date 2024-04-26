import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener{
    private JFrame frame;
    private JTextField tf1;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9;
    private JButton bn10, bn11, bn12, bn13, bn14, bn15;
    private JPanel panel;
    double num1;
    double num2;
    double result;
    String operator;
    public CalculatorSample(){
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
        bn0.addActionListener(this); bn1.addActionListener(this);
        bn2.addActionListener(this); bn3.addActionListener(this);
        bn4.addActionListener(this); bn5.addActionListener(this);
        bn6.addActionListener(this); bn7.addActionListener(this);
        bn8.addActionListener(this); bn9.addActionListener(this);
        bn10.addActionListener(this); bn11.addActionListener(this);
        bn12.addActionListener(this); bn13.addActionListener(this);
        bn14.addActionListener(this); bn15.addActionListener(this);
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
        new CalculatorSample();
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        if(ev.getActionCommand().matches("[0-9]")){
            tf1.setText(tf1.getText() + ev.getActionCommand());
        }
        else{
            if(ev.getActionCommand().equals("+")){
                operator = "+";
                num1 = Double.parseDouble(tf1.getText());
                tf1.setText("");
            }
            else if (ev.getActionCommand().equals("-")){
                operator = "-";
                num1 = Double.parseDouble(tf1.getText());
                tf1.setText("");
            }
            else if (ev.getActionCommand().equals("x")){
                operator = "*";
                num1 = Double.parseDouble(tf1.getText());
                tf1.setText("");
            }
            else if (ev.getActionCommand().equals("/")){
                operator = "/";
                num1 = Double.parseDouble(tf1.getText());
                tf1.setText("");
            }
            else if(ev.getActionCommand().equals("c")){
            tf1.setText("");
            num1 = 0.0;
            num2 = 0.0;
            result = 0.0;
            }
            if (ev.getActionCommand().equals("=")){
                num2 = Double.parseDouble(tf1.getText());
                if (operator.equals("+")){
                    result = num1 + num2;
                }
                else if (operator.equals("-")){
                    result = num1 - num2;
                }
                else if (operator.equals("*")){
                    result = num1 * num2;
                }
                else if (operator.equals("/")){
                    result = num1 / num2;
                }
            tf1.setText(String.valueOf(result));
            }
        }
    }
}

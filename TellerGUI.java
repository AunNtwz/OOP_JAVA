import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    private JFrame frame;
    private JLabel lb1, lb2;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;
    private JPanel panel1, panel2;
    private Account ac;
    private JOptionPane op;
    public TellerGUI(){
        frame = new JFrame("Teller GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(2,0));
        
        ac = new Account(6000.0, "");
        lb1 = new JLabel("  Balance");
        lb2 = new JLabel("  Amount");
        tf1 = new JTextField(String.valueOf(ac.getBalance()));
        tf1.setEditable(false);
        tf2 = new JTextField();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        panel1.add(lb1); panel1.add(tf1);
        panel1.add(lb2); panel1.add(tf2);
        panel2.add(bn1); panel2.add(bn2); panel2.add(bn3);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2);
        
        frame.setSize(300,150);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
    public void actionPerformed(ActionEvent ev){
        if (tf2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            if (ev.getSource().equals(bn2)){
                if (Double.parseDouble(tf2.getText()) <= ac.getBalance()){
                    ac.setBalance(ac.getBalance() - Double.parseDouble(tf2.getText()));
                    tf1.setText(String.valueOf(ac.getBalance()));
                }
            } else if (ev.getSource().equals(bn1)){
                ac.setBalance(ac.getBalance() + Double.parseDouble(tf2.getText()));
                tf1.setText(String.valueOf(ac.getBalance()));
            } else if (ev.getSource().equals(bn3)){
                System.exit(0);
            }
        }
    }
}

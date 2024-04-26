import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel buttonPanel, mainPanel;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn1, btn2;
    public ChatDemo(){
        frame = new JFrame();
        ta = new JTextArea();
        tf = new JTextField();
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        buttonPanel = new JPanel();
        mainPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setTitle("ChatDemo");
        mainPanel.setLayout(new BorderLayout());
        buttonPanel.setLayout(new FlowLayout());
        
        //TEXT
        ta.setSize(45,20);
        ta.setEditable(false);
        ta.setForeground(Color.blue);
        tf.setSize(20,0);
        
        //BUTTON
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        mainPanel.add(ta);
        mainPanel.add(tf, BorderLayout.SOUTH);
        frame.add(mainPanel);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.addWindowListener(this);
        ReadFile();
        
        frame.setSize(450,350);
        frame.setVisible(true);

    }
    public static void main(String[] args){
        new ChatDemo();
    }
    public void WriteFile(){
        String text;
        text = ta.getText();
        File f = new File("ChatDemo.dat");
        try(FileWriter fw = new FileWriter(f)){
            try(BufferedWriter bw = new BufferedWriter(fw)){
                bw.write(text);
            }
        } catch (IOException IOex) {
            IOex.printStackTrace();
        }
    }
    public void ReadFile(){
        String message;
        String allmessage = "";
        try(FileReader fr = new FileReader("ChatDemo.dat")){
            try(BufferedReader br = new BufferedReader(fr)){
                while((message = br.readLine()) != null){
                    allmessage += (message+"\n");
                    ta.setText(allmessage);
                }
            }
        } catch (FileNotFoundException ex) {
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        if (ev.getActionCommand().equals("Submit")){
            ta.setText(ta.getText() + dtf.format(LocalDateTime.now()) + " : " + tf.getText()+ "\n");
            tf.setText("");
        }
        if (ev.getActionCommand().equals("Reset")){
            ta.setText("");
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        WriteFile();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

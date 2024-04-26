import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

import javax.swing.*;

public class StudentView {
    private JFrame fr;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2;

    public StudentView() {
        fr = new JFrame("");
        l1 = new JLabel("ID: ");
        l2 = new JLabel("Name: ");
        l3 = new JLabel("Money: ");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");

        fr.setLayout(new BorderLayout());
        JPanel top = new JPanel(new GridLayout(3, 3));
        top.add(l1);
        top.add(tf1);
        top.add(l2);
        top.add(tf2);
        top.add(l3);
        top.add(tf3);

        tf3.setEditable(false);
        JPanel button = new JPanel(new FlowLayout());
        button.add(b1);
        button.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(tf3.getText());
                amount += 100;
                tf3.setText(String.valueOf(amount));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(tf3.getText());
                amount -= 100;
                if (amount < 0) {
                    amount = 0;
                }
                tf3.setText(String.valueOf(amount));
            }
        });

        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveStudentToFile();
            }
        });

        loadFromFile();

        fr.add(top, BorderLayout.NORTH);
        fr.add(button, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 150);
        fr.setVisible(true);
    }

    private void saveStudentToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))) {
            Student student = new Student(tf2.getText(), tf1.getText(), tf3.getText());
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        File file = new File("StudentM.dat");

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("StudentM.dat"))) {
                while (true) {
                    try {
                        Student student = (Student) objectInputStream.readObject();
                        tf1.setText(String.valueOf(student.getID()));
                        tf2.setText(student.getName());
                        tf3.setText(String.valueOf(student.getMoney()));
                    } catch (EOFException e) {
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new StudentView();
    }
}

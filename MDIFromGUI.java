import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame frame;
    private JMenuBar mb;
    private JMenu m1, m2, m3, mNew;
    private JMenuItem mi2, mi3, mi4, mNew1, mNew2;
    private JDesktopPane dp;
    private JInternalFrame itnf1, itnf2, itnf3;
    public MDIFromGUI() {
        frame = new JFrame("SubMenuItem Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m1.setMnemonic('f');
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mb.add(m1); mb.add(m2); mb.add(m3);
        mNew = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(mNew);
        m1.add(mi2); 
        m1.addSeparator();
        m1.add(mi3); 
        m1.addSeparator();
        m1.add(mi4);
        mNew1 = new JMenuItem("Window");
        mNew2 = new JMenuItem("Message");
        mNew.add(mNew1);
        mNew.addSeparator();
        mNew.add(mNew2);
        frame.setJMenuBar(mb);
        dp = new JDesktopPane();
        itnf1 = new JInternalFrame("Application 01", true, true, true, true);
        itnf2 = new JInternalFrame("Application 02", true, true, true, true);
        itnf3 = new JInternalFrame("Application 03", true, true, true, true);
        itnf1.setSize(300,150);
        itnf1.setVisible(true);
        itnf1.setLocation(30, 330);
        itnf2.setSize(270,200);
        itnf2.setVisible(true);
        itnf2.setLocation(270, 100);
        itnf3.setSize(350,250);
        itnf3.setVisible(true);
        itnf3.setLocation(580, 250);
        dp.setBackground(Color.black);
        dp.add(itnf1); dp.add(itnf2); dp.add(itnf3);
        frame.add(dp);
        
        frame.setSize(1000,600);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            e.printStackTrace();
        }
        
        new MDIFromGUI();
 }
}

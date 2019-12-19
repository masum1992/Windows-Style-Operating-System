import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import static java.lang.Math.abs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Soumik
 */
public class Dsk2 {

    void clr(int a, int n, int node[]) {

        int i;

        for (i = 0; i <= n; i++) {
            if (a == node[i]) {
                node[i] = -1;
            }
        }
    }

    Dsk2() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setBounds(0, 0, 1366, 768);
        f.setUndecorated(true);

        ImageIcon i = new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\w.png");
        JLabel l = new JLabel(i);
        l.setBounds(0, 0, 1366, 768);
        f.add(l);
        l.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON3) {
                    int x = e.getXOnScreen();
                    int y = e.getYOnScreen();

                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(null);
                    frame.setSize(55, 55);
                    frame.setLocation(x, y);
                    frame.setUndecorated(true);
                    frame.setVisible(true);
//                    JLabel label = new JLabel("View");
//                    label.setBounds(60, 13, 150, 20);
//                    label.setForeground(Color.BLACK);
//                    frame.add(label);
//                    JLabel label1 = new JLabel("Sort by");
//                    label1.setBounds(55, 50, 150, 20);
//                    label1.setForeground(Color.BLACK);
//                    frame.add(label1);
                    
                    ImageIcon i5 =new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\refresh.png");
                    JLabel label2 = new JLabel(i5);
                    label2.setBounds(0,0, 55, 55);
                    //label2.setSize(55,55);
                    label2.setForeground(Color.BLACK);
                    frame.add(label2);
                    label2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getButton() == MouseEvent.BUTTON1) {

                                GraphicsDevice gd1 = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                                Robot robo1 = null;
                                try {
                                    robo1 = new Robot(gd1);
                                } catch (AWTException ex) {
                                    Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                robo1.setAutoDelay(100);
                                robo1.keyPress(KeyEvent.VK_F5);
                                robo1.keyRelease(KeyEvent.VK_F5);
                                frame.setVisible(false);

                            }
                        }
                    });
                    l.add(frame);
                }
            }

        });

        ImageIcon i1 = new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\mycomputer.png");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(15,9, 64,64);
        l.add(l1);
        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                l1MouseClicked(e);
            }

            private void l1MouseClicked(MouseEvent e) {

                try {
                    
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:mycomputerfolder");
                } catch (IOException ex) {
                    Logger.getLogger(Dsk2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        JLabel l2 = new JLabel("My Computer");
        l2.setBounds(12, 55, 75, 64);
        l2.setForeground(Color.WHITE);
        l.add(l2);

        ImageIcon i2 = new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\recyclebin.png");
        JLabel l3 = new JLabel(i2);
        l3.setBounds(15, 118, 64, 64);
        l.add(l3);
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                l3MouseClicked(e);
            }

            private void l3MouseClicked(MouseEvent e) {

                try {
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:Recyclebinfolder");
                } catch (IOException ex) {
                    Logger.getLogger(Dsk2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        JLabel l4 = new JLabel("Recycle Bin");
        l4.setBounds(15, 162, 70, 64);
        l4.setForeground(Color.WHITE);
        l.add(l4);

        ImageIcon i3 = new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\taskbar.png");
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0, 720, 1368, 45);
        l.add(l5);
        l5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON3) {
                    int x = e.getXOnScreen();
                    int y = e.getYOnScreen();
                    JFrame frame1 = new JFrame();
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.setLayout(null);
                    frame1.setSize(150, 40);
                    frame1.setLocation(x, y);
                    frame1.setUndecorated(true);
                    Container c1 = frame1.getContentPane();
                    c1.setBackground(Color.GRAY);
                    frame1.setVisible(true);
                    JLabel label00 = new JLabel("Task Manager");
                    label00.setBounds(30, 1, 150, 40);
                    label00.setForeground(Color.BLACK);
                    frame1.add(label00);

                    label00.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {

                            if (e.getButton() == MouseEvent.BUTTON1) {

                                try {
                                    Process p = Runtime.getRuntime().exec("C:\\Windows\\System32\\taskmgr.exe");
                                } catch (IOException ex) {
                                    Logger.getLogger(Dsk2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                frame1.setVisible(false);

                            }
                        }

                    });

                }
            }

        });

        ImageIcon i4 = new ImageIcon("C:\\Users\\Soumik\\Documents\\GitHub\\Windows-Style-Operating-System\\Dsk2\\Pictures\\startbutton.png");
        JLabel l6 = new JLabel(i4);
        l6.setBounds(0, 0, 55, 55);
        l5.add(l6);
        l6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    l6MouseClicked(e);
                } catch (AWTException ex) {
                    Logger.getLogger(Dsk2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void l6MouseClicked(MouseEvent e) throws AWTException {

                GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                Robot robo = new Robot(gd);
                robo.setAutoDelay(100);
                robo.keyPress(KeyEvent.VK_WINDOWS);
                robo.keyRelease(KeyEvent.VK_WINDOWS);
            }

        });

        JLabel l7 = new JLabel("time");
        l7.setBounds(1280, 0, 100, 20);
        l5.add(l7);

        JLabel l8 = new JLabel("date");
        l8.setBounds(1275, 20, 100, 20);
        l5.add(l8);

        final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        ActionListener timeListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                String time = timeFormat.format(date);
                l7.setText(time);
                l8.setText(dateFormat.format(c.getTime()));

            }
        };
        Timer timer = new Timer(1000, timeListener);
        timer.setInitialDelay(0);
        timer.start();

        JLabel lab=new JLabel("Total No. Of Nodes:");
        lab.setBounds(580, 30, 250, 20);
        lab.setForeground(Color.WHITE);
        l.add(lab);
        
        JTextField t1 = new JTextField();
        t1.setBounds(700, 30, 250, 30);
        l.add(t1);

        JLabel lab1=new JLabel("Give The Nodes:");
        lab1.setBounds(580, 70, 250, 20);
        lab1.setForeground(Color.WHITE);
        l.add(lab1);
        
        JTextField t2 = new JTextField();
        t2.setBounds(700, 70, 250, 30);
        l.add(t2);

        JLabel lab2=new JLabel("Give The Head:");
        lab2.setBounds(580, 110, 250, 20);
        lab2.setForeground(Color.WHITE);
        l.add(lab2);
        
        JTextField t3 = new JTextField();
        t3.setBounds(700, 110, 250, 30);
        l.add(t3);

        JButton b = new JButton("SSTF");
        b.setBounds(700, 150, 100, 30);
        l.add(b);

        JLabel lab3=new JLabel("Shortest Seek Time First:");
        lab3.setBounds(550, 190, 250, 20);
        lab3.setForeground(Color.WHITE);
        l.add(lab3);
        
        JTextField t4 = new JTextField();
        t4.setBounds(700, 190, 250, 30);
        l.add(t4);

        b.addActionListener((ActionEvent e) -> {

            if (e.getSource() == b) {
                int n, node[], i00, h, la[];
                node = new int[20];
                la = new int[20];
                n = Integer.parseInt(t1.getText());//how many nodes
                
                String temp = t2.getText();
                StringTokenizer token = new StringTokenizer(temp);
                int len=0;
                while (token.hasMoreTokens()){
                    node[++len] = Integer.parseInt(token.nextToken());
                }
                h = Integer.parseInt(t3.getText());//head
                int t = h, tmp, dif, j;

                la[0] = h;

                for (i00 = 1; i00 <= n; i00++) {
                    for (j = 1, tmp = 10000; j <= n; j++) {
                        if (node[j] != -1) {
                            dif = abs(t - node[j]);
                        } else {
                            continue;
                        }

                        if (dif < tmp && dif != 0) {
                            tmp = dif;
                            la[i00] = node[j];

                        }

                    }
                    clr(t, n, node);
                    t = la[i00];

                }
                
                String ans = "";

                for (i00 = 0; i00 <= n; i00++) {

                    ans += String.valueOf(la[i00]);
                    ans += " ";
                }
                t4.setText(ans);
            }
        });

        f.setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dsk2 d2 = new Dsk2();
    }

}

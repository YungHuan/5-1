import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jb1 =new JButton("Add");
    private JButton jb2 =new JButton("Less");
    private JButton jb3 =new JButton("Exit");
    private int a= 0;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(100,100,500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.jb1.setBounds(50,50,100,100);
        this.jb2.setBounds(50,150,100,100);
        this.jb3.setBounds(50,250,100,100);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                setTitle(Integer.toString(a));
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a--;
                setTitle(Integer.toString(a));
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
}}

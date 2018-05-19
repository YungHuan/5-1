import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame2 extends JFrame{
    private JButton jb1 =new JButton("----->");
    private JButton jb2 =new JButton("<-----");
    private JButton jb3 =new JButton("Exit");
    private JLabel jl =new JLabel("0*0");
    private int a = 200;
    public MainFrame2(){
        init();
    }
    public void init(){
        this.setBounds(100,100,500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.jb1.setBounds(50,50,100,100);
        this.jb2.setBounds(50,150,100,100);
        this.jb3.setBounds(50,250,100,100);
        this.jl.setBounds(200,150,100,100);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jl);
        this.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=a+10;
                jl.setBounds(a,150,100,100);
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=a-10;
                jl.setBounds(a,150,100,100);
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
class Wizard01 extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JButton btn1;
    private JButton btn2;
    private Wizard02 screen2;
    private Wizard03 screen3;
    private Wizard04 screen4;
    Wizard01(){
        initComponents();
    }
    public void initComponents() {
        setSize(800, 600);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lbl1=new JLabel();
        lbl1.setFont(new Font("Serif", Font.BOLD, 20));
        lbl1.setText("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
        lbl1.setBounds(10,5,1000,45);
        lbl2=new JLabel();
        lbl2.setText("This wizard will guide you through the installation of the");
        lbl2.setBounds(10,150,800,45);
        lbl2.setFont(new Font("Serif",0, 20));
        lbl3=new JLabel();
        lbl3.setText("ENGENIES software.");
        lbl3.setBounds(10,175,800,45);
        lbl3.setFont(new Font("Serif",0, 20));
        lbl4=new JLabel();
        lbl4.setText("click NEXT to continue...");
        lbl4.setBounds(10,350,800,45);
        lbl4.setFont(new Font("Serif",0, 20));
        btn1=new JButton("next");
        btn1.setBounds(610,500,80,30);
        btn2=new JButton("cancel");
        btn2.setBounds(700,500,80,30);
        btn1.addActionListener((event)->{
            dispose();
            screen2.setVisible(true);
        });
        btn2.addActionListener((event)->{
            System.exit(0);
        });

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(btn1);
        add(btn2);
    }
    public void setScreen(Wizard02 screen2, Wizard03 screen3, Wizard04 screen4){
        this.screen2 = screen2;
        this.screen3 = screen3;
        this.screen4 = screen4;
    }
}
class Wizard02 extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JTextField txt1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private Wizard01 screen1;
    private Wizard03 screen3;
    private Wizard04 screen4;
    Wizard02(){
        initComponents();
    }
    public void initComponents() {
        setSize(800, 600);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lbl1=new JLabel();
        lbl1.setFont(new Font("Serif", Font.BOLD, 20));
        lbl1.setText("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
        lbl1.setBounds(10,5,1000,45);
        lbl2=new JLabel();
        lbl2.setText("This Engenies environment setup wizard will install the");
        lbl2.setBounds(10,100,1000,45);
        lbl2.setFont(new Font("Serif",0, 20));
        lbl3=new JLabel();
        lbl3.setText("Engenies software on your computer.");
        lbl3.setBounds(10,125,800,45);
        lbl3.setFont(new Font("Serif",0, 20));
        lbl4=new JLabel();
        lbl4.setText("To continue,");
        lbl4.setBounds(10,150,800,45);
        lbl4.setFont(new Font("Serif",0, 20));
        lbl5=new JLabel();
        lbl5.setText("Enter your NIC number:");
        lbl5.setBounds(10,225,800,45);
        lbl5.setFont(new Font("Serif",0, 20));
        lbl6=new JLabel();
        lbl6.setText("click NEXT to continue...");
        lbl6.setBounds(10,400,800,45);
        lbl6.setFont(new Font("Serif",0, 20));
        txt1=new JTextField(25);
        txt1.setBounds(10,300,775,75);
        txt1.setFont(new Font("Serif",Font.BOLD, 32));
        btn1=new JButton("back");
        btn1.setBounds(460,500,100,30);
        btn1.setFont(new Font("Serif",0, 20));
        btn2=new JButton("next");
        btn2.setBounds(570,500,100,30);
        btn2.setFont(new Font("Serif",0, 20));
        btn3=new JButton("cancel");
        btn3.setBounds(680,500,100,30);
        btn3.setFont(new Font("Serif",0, 20));

        btn1.addActionListener((event)->{
            dispose();
            screen1.setVisible(true);
        });
        btn2.addActionListener((event)->{
            dispose();
            screen3.setVisible(true);
        });
        btn3.addActionListener((event)->{
            System.exit(0);
        });
       txt1.addActionListener((event)->{
            if (txt1.getText().length()>0){
                btn2.setEnabled(true);
            }else{
                btn2.setEnabled(false);
            }
        });

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(txt1);
        add(btn1);
        add(btn2);
        add(btn3);
    }
    public void setScreen(Wizard01 screen1, Wizard03 screen3, Wizard04 screen4){
        this.screen1 = screen1;
        this.screen3 = screen3;
        this.screen4 = screen4;
    }
}
class Wizard03 extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JTextField txt1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private Wizard01 screen1;
    private Wizard02 screen2;
    private Wizard04 screen4;
    Wizard03(){
        initComponents();
    }
    public void initComponents() {
        setSize(800, 600);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lbl1=new JLabel();
        lbl1.setFont(new Font("Serif", Font.BOLD, 20));
        lbl1.setText("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
        lbl1.setBounds(10,5,1000,45);
        lbl2=new JLabel();
        lbl2.setText("Fill in the following requirements to continue the");
        lbl2.setBounds(10,100,1000,45);
        lbl2.setFont(new Font("Serif",0, 20));
        lbl3=new JLabel();
        lbl3.setText("installation process");
        lbl3.setBounds(10,125,800,45);
        lbl3.setFont(new Font("Serif",0, 20));
        lbl4=new JLabel();
        lbl4.setText("Enter your name:");
        lbl4.setBounds(10,200,800,45);
        lbl4.setFont(new Font("Serif",0, 20));
        txt1=new JTextField(25);
        txt1.setBounds(10,300,775,100);
        txt1.setFont(new Font("Serif",Font.BOLD, 32));
        btn1=new JButton("back");
        btn1.setBounds(460,500,100,30);
        btn1.setFont(new Font("Serif",0, 20));
        btn2=new JButton("next");
        btn2.setBounds(570,500,100,30);
        btn2.setFont(new Font("Serif",0, 20));
        btn3=new JButton("cancel");
        btn3.setBounds(680,500,100,30);
        btn3.setFont(new Font("Serif",0, 20));

        btn1.addActionListener((event)->{
            dispose();
            screen2.setVisible(true);
        });
        btn2.addActionListener((event)->{
            dispose();
            screen4.setVisible(true);
        });
        btn3.addActionListener((event)->{
            System.exit(0);
        });
        txt1.addActionListener((event)->{
            if (txt1.getText().length()>0){
                btn2.setEnabled(true);
            }else{
                btn2.setEnabled(false);
            }
        });

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(txt1);
        add(btn1);
        add(btn2);
        add(btn3);
    }
    public void setScreen(Wizard01 screen1, Wizard02 screen2, Wizard04 screen4){
        this.screen1 = screen1;
        this.screen2 = screen2;
        this.screen4 = screen4;
    }
}
class Wizard04 extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;

    private JButton btn1;
    private JButton btn2;
    private Wizard01 screen1;
    private Wizard02 screen2;
    private Wizard03 screen3;
    Wizard04(){
        initComponents();
    }
    public void initComponents() {
        setSize(800, 600);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lbl1=new JLabel();
        lbl1.setFont(new Font("Serif", Font.BOLD, 20));
        lbl1.setText("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
        lbl1.setBounds(10,5,1000,45);
        lbl2=new JLabel();
        lbl2.setText("Your installation requirements has been fulfilled.");
        lbl2.setBounds(10,125,1000,45);
        lbl2.setFont(new Font("Serif",0, 20));
        lbl3=new JLabel();
        lbl3.setText("Click FINISH to complete the installation process.");
        lbl3.setBounds(10,150,800,45);
        lbl3.setFont(new Font("Serif",0, 20));

        btn1=new JButton("Back");
        btn1.setBounds(570,500,100,30);
        btn1.setFont(new Font("Serif",0, 20));
        btn2=new JButton("Finish");
        btn2.setBounds(680,500,100,30);
        btn2.setFont(new Font("Serif",0, 20));

        btn1.addActionListener((event)->{
            dispose();
            screen3.setVisible(true);
        });
        btn2.addActionListener((event)->{
            System.exit(0);
        });

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(btn1);
        add(btn2);
    }
    public void setScreen(Wizard01 screen1, Wizard02 screen2, Wizard03 screen3){
        this.screen1 = screen1;
        this.screen2 = screen2;
        this.screen3 = screen3;
    }
}
public class Demo {
    public static void main(String[] args) {
        Wizard01 screen1 =new Wizard01();
        Wizard02 screen2 =new Wizard02();
        Wizard03 screen3 =new Wizard03();
        Wizard04 screen4 =new Wizard04();

        screen1.setScreen(screen2,screen3,screen4);
        screen2.setScreen(screen1,screen3,screen4);
        screen3.setScreen(screen1,screen2,screen4);
        screen4.setScreen(screen1,screen2,screen3);

        screen1.setVisible(true);
    }
}

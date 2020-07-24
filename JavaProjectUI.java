import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class CricketUI   implements ActionListener {
	JButton b1,b2,b3;
	String s1,s2;
	
	int a,b;
	CricketUI(){
  JFrame f1=new JFrame(" CRICKET");
  JLabel l1=new JLabel("CRICKET SCORE BOARD:");
  l1.setBounds(100,20,200,50);
  JLabel l2=new JLabel("VENUE:");
  l2.setBounds(40,90,50,50);
  JTextField t1=new JTextField();
  t1.setBounds(100,110,200,50);
  JLabel l3=new JLabel("TEAM1");
  l3.setBounds(40,190,250,100);
  JTextField t2=new JTextField();
  t2.setBounds(100,235,200,50);
  JLabel l4=new JLabel("TEAM2");
  l4.setBounds(40,250,250,100);
  JTextField t3=new JTextField();
  t3.setBounds(100,295,200,50);
  b1=new JButton("SUBMIT");
  b1.setBounds(200,400,150,50);
  b1.addActionListener(this);
  f1.add(l1);
  f1.add(l2);
  f1.add(t1);
  f1.add(l3);
  f1.add(t2);
  f1.add(l4);
  f1.add(t3);
  f1.add(b1);
  f1.setLayout(null);
  JLabel l12= new JLabel(new ImageIcon("C:\\Users\\d krishna\\Desktop\\chandrakiran\\capture.png"));
  l12.setBounds(10,10,500,400);
  f1.add(l12);
  f1.setSize(500,500);
  f1.setLocationRelativeTo(null);
  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f1.setVisible(true);
  f1.setBackground(Color.white);
}
    public void actionPerformed(ActionEvent e)
    {if(e.getSource()==b1)
    {JFrame jf1=new JFrame("INDIA");
    JLabel li=new JLabel("NO OF RUNS");
    li.setBounds(40,50,100,50);
    JTextField ti=new JTextField();
    ti.setBounds(150,50,100,50);
    JLabel li1=new JLabel("NO OF FOURS");
    li1.setBounds(260,50,100,50);
    SpinnerModel value =  new SpinnerNumberModel(0,0,40,1);  
    JSpinner spinner = new JSpinner(value);   
    spinner.setBounds(350,50,100,50);    
    jf1.add(spinner);
    JLabel li2=new JLabel("NO OF SIXES");
    li2.setBounds(40,150,100,50);
    SpinnerModel value1 =  new SpinnerNumberModel(0,0,40,1);  
    JSpinner spinner1 = new JSpinner(value1);   
    spinner1.setBounds(150,150,100,50);
    JLabel li3=new JLabel("WIDES");
    li3.setBounds(260,150,100,50);
    JTextField ti1=new JTextField();
    ti1.setBounds(350,150,100,50);
    JLabel li4=new JLabel("NO-BALLS");
    li4.setBounds(40,250,100,50);
    JTextField ti2=new JTextField();
    ti2.setBounds(150,250,100,50);
    JLabel l12= new JLabel(new ImageIcon("C:\\Users\\d krishna\\Desktop\\chandrakiran\\indian.png"));
    l12.setBounds(300,250,400,400);
    jf1.add(l12);
    b2=new JButton("SUBMIT");
    b2.setBounds(200,490,150,50);
    b2.addActionListener(new teamB());
    jf1.add(spinner1);
    jf1.add(li);
    jf1.add(ti);
    jf1.add(li1);
    jf1.add(li2);
    jf1.add(ti1);
    jf1.add(li3);
    jf1.add(li4);
    jf1.add(ti2);
    jf1.add(b2);  
    jf1.setSize(600,600);
    jf1.setBackground(Color.red);
    jf1.setLayout(null);
    jf1.setLocationRelativeTo(null);
    jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf1.setVisible(true);
    }
    }
class teamB implements ActionListener
{
    public void actionPerformed(ActionEvent e1)
    {if(e1.getSource()==b2)
    {JFrame jf2=new JFrame("PAKISTAN");
    JLabel li5=new JLabel("NO OF RUNS");
    li5.setBounds(40,50,100,50);
    JTextField ti5=new JTextField();
    ti5.setBounds(150,50,100,50);
    JLabel li6=new JLabel("NO OF FOURS");
    li6.setBounds(40,120,100,50);
    SpinnerModel value =  new SpinnerNumberModel(0,0,40,1);  
    JSpinner spinner = new JSpinner(value);   
    spinner.setBounds(150,130,100,50);    
    jf2.add(spinner);
    JLabel li7=new JLabel("NO OF SIXES");
    li7.setBounds(40,200,100,50);
    SpinnerModel value1 =  new SpinnerNumberModel(0,0,40,1);  
    JSpinner spinner1 = new JSpinner(value1);   
    spinner1.setBounds(150,200,100,50);
    JLabel li8=new JLabel("WIDES");
    li8.setBounds(40,290,100,50);
    JTextField ti8=new JTextField();
    ti8.setBounds(150,300,100,50);
    JLabel li9=new JLabel("NO-BALLS");
    li9.setBounds(40,370,100,50);
    JTextField ti9=new JTextField();
    ti9.setBounds(150,370,100,50);
    b3=new JButton("SUBMIT");
    b3.setBounds(200,490,150,50);
    b3.addActionListener(new result());
    jf2.add(spinner1);
    jf2.add(li5);
    jf2.add(ti5);
    jf2.add(li6);
    jf2.add(li7);
    jf2.add(li8);
    jf2.add(ti8);
    jf2.add(li9);
    jf2.add(ti8);
    jf2.add(ti9);
    jf2.add(b3);
    jf2.setBackground(Color.red);
    JLabel l12= new JLabel(new ImageIcon("C:\\Users\\d krishna\\Desktop\\chandrakiran\\pakistan.png"));
    l12.setBounds(300,250,200,200);
    jf2.add(l12);
    jf2.setSize(600,600);
    jf2.setLayout(null);
    jf2.setLocationRelativeTo(null);
    jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf2.setVisible(true);
    }
    }
}
class result implements ActionListener
{
    public void actionPerformed(ActionEvent e3)
    {if(e3.getSource()==b3)
    {JFrame f5=new JFrame("RESULT"); 
    JLabel l12= new JLabel(new ImageIcon("C:\\Users\\d krishna\\Desktop\\chandrakiran\\indian.png"));
    l12.setBounds(20,20,200,200);
    f5.add(l12);
    JLabel l13= new JLabel(new ImageIcon("C:\\Users\\d krishna\\Desktop\\chandrakiran\\pakistan.png"));
    l13.setBounds(400,70,150,100);
    f5.add(l13);
    JLabel li5=new JLabel("VS");
    li5.setBounds(300,100,100,50);
    JTextArea f51=new JTextArea();
    f51.setBounds(250,350,100,40);
    if(a>b)
    {f51.setText("INDIA WINS !!!");
    }
    else
    {f51.setText("PAKISTAN WINS!!!");
    }
     f5.setSize(650,500);    
     f5.setLayout(null);  
     f5.add(f51);
     f5.add(li5);
     f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f5.setVisible(true);     
     f5.setLocationRelativeTo(null);
}
}
}
public static void main(String args[])
{
	SwingUtilities.invokeLater(new Runnable()
			{
		         public void run()
		         {
		        	new CricketUI();
		         }
			});
}
public void actionPerformed1(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}

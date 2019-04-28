package LMS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Welcome extends JFrame implements ActionListener
{  
 /**
	 *    
	 */  
	private static final long serialVersionUID = 1L; 
 JLabel l1; 
 JButton b1; 
 public Welcome() 
 {
  JPanel p=new JPanel(new GridLayout(2,1,15,15));
  l1=new JLabel("LIBRARY MANAGEMENT SYSTEM");
  b1=new JButton("Begin...");
  b1.setFont(new Font("Calibri", Font.PLAIN, 24));
  p.add(l1);
  p.add(b1);
  b1.addActionListener(this);
  setContentPane(p);
 }
  public void paint(Graphics g)
  {    
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("lib3.jpg");  
        g.drawImage(i,90,90,this);            
  }  
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
  {
   Adminlogin a=new Adminlogin();
   a.setSize(600,400);
   a.setVisible(true);
  }
 }
 public static void main(String arg[])
 {
  Welcome w=new Welcome();
  w.setSize(500,500);
  w.setVisible(true);
 }
}

class Adminlogin extends JFrame implements ActionListener
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 JLabel l1,l2;
 JTextField t1,t2;
 JButton b1;
 String un,pwd;
 public Adminlogin()
{
  JPanel p=new JPanel(new GridLayout(3,2,10,10));
  l1=new JLabel("Username");
  l2=new JLabel("Password");
  t1=new JTextField(10);
  t2=new JPasswordField(10);
  b1=new JButton("Submit");
  l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  GridBagConstraints gbc = new GridBagConstraints();
  gbc.gridwidth = GridBagConstraints.REMAINDER;
  l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  b1.setFont(new Font("Calibri", Font.PLAIN, 24));
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(b1);
  b1.addActionListener(this);
  setContentPane(p);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
  {
    un=t1.getText();
    pwd=t2.getText();
    if(t1.getText().equals("Admin") && t2.getText().equals("pec"))
    {
      Choose2 ch=new Choose2();
      ch.setVisible(true);
      ch.setSize(450,550);
    }
    else
   {
      JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Oops!!!Invalid Username or Password.<br><center>Try Again!!!</center>");
   }
  }
 }
}
class Choose2 extends JFrame implements ActionListener
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton b1,b2,b3;
public Choose2()
{
JPanel p=new JPanel(new GridLayout(2,2,15,15));
b1=new JButton("Student");
b2=new JButton("Staff");
b3=new JButton("Exit");
b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
p.add(b1);
p.add(b2);
p.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setContentPane(p);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
Toggle1 t=new Toggle1();
t.setSize(550,700);
t.setVisible(true);
}
else if(e.getSource()==b2)
{
Toggle1 t=new Toggle1();
t.setSize(350,500);
t.setVisible(true);
}
else if(e.getSource()==b3)
{
System.exit(0);
}
}
} 
class Toggle1 extends JFrame implements ActionListener
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton b1,b2,b3;
JLabel l1;
JTextField t1;
public Toggle1()
{
JPanel p=new JPanel(new GridLayout(3,2,15,15));
b1=new JButton("Return");
b2=new JButton("Issue/Renew");
b3=new JButton("Back");
l1=new JLabel("Enter Card Number");
t1=new JTextField(20);
b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
p.add(l1);
p.add(t1);
p.add(b1);
p.add(b2);
p.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setContentPane(p);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String cno=t1.getText();
if(t1.getText().equals("A100")||t1.getText().equals("A101")||t1.getText().equals("A102")||t1.getText().equals("D100")||t1.getText().equals("D101")||t1.getText().equals("D102"))
{
Ret2 r=new Ret2();
r.setVisible(true);
r.setSize(500,700);
}
else
{
JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Oops!!!Invalid Card Number");
}
}
else if(e.getSource()==b2)
{
if(t1.getText().equals("A100")||t1.getText().equals("A101")||t1.getText().equals("A102")||t1.getText().equals("D100")||t1.getText().equals("D101")||t1.getText().equals("D102"))
{
Issue2 i=new Issue2();
i.setVisible(true);
i.setSize(500,700);
}
else
{
JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Oops!!!Invalid Card Number");
}
}
else if(e.getSource()==b3)
{
Choose2 ch=new Choose2();
ch.setSize(450,550);
ch.setVisible(true);
}
}
}
class Issue2 extends JFrame implements ActionListener
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String bname,isbn;
 JLabel l1,l2,l3,l4;
 JTextField t1,t2,t3,t4;
 JButton b1,b2,b3,b4,b5;
 public Issue2()
 {
  JPanel p=new JPanel(new GridLayout(7,2,15,15));
  l1=new JLabel("Book Name");
  l2=new JLabel("ISBN Number");
  l3=new JLabel("Issue Date");
  l4=new JLabel("Return Date");
  t1=new JTextField(20);
  t2=new JTextField(20);
  t3=new JTextField(20);
  t4=new JTextField(20);
  b1=new JButton("Find Issue Date");
  b2=new JButton("Renew");
  b3=new JButton("Find Return Date");
  b4=new JButton("Back");
  b5=new JButton("Issue");
 b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 b4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 b5.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 l3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 l4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 t3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
 t4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(l3);
  p.add(t3);
  p.add(b1);
  p.add(b3);
  p.add(l4);
  p.add(t4);
  p.add(b5);
  p.add(b2);
  p.add(b4);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  setContentPane(p);
 }
 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource()==b1)
   {
      int day, month, year;
      GregorianCalendar date = new GregorianCalendar();
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      String g=day+"/"+(month+1)+"/"+year;
      t3.setText(g);
   }
   else if(e.getSource()==b2)
  {
      JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Book Renewed Successfully!!!");
  }
  else if(e.getSource()==b3)
  {
      long day, month, year;
      GregorianCalendar date = new GregorianCalendar();
      day = (date.get(Calendar.DAY_OF_MONTH))+15;
      month = date.get(Calendar.MONTH)+1;
      year = date.get(Calendar.YEAR);
      if(year%4==0)
      {
        if((month==01||month==03||month==05||month==07||month==(07+01)||month==10||month==12)&&(day>31))
        {
          day=day-31;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
       else if((month==04||month==06||month==(07+02)||month==11)&&(day>30))
        {
          day=day-30;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
       else if((month==02)&&(day>29))
        {
          day=day-29;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
      }
      else
      {
        if((month==01||month==03||month==05||month==07||month==(07+01)||month==10||month==12)&&(day>31))
        {
          day=day-31;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
       else if((month==04||month==06||month==(07+02)||month==11)&&(day>30))
        {
          day=day-30;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
       else if((month==02)&&(day>28))
        {
          day=day-28;
          month=month+1;
          if(month>12)
          {
           month=month-12;
           year=year+1;
          }
        }
      }
      String g=day+"/"+month+"/"+year;
      t4.setText(g);
  }
  else if(e.getSource()==b4)
  {
     Toggle1 t=new Toggle1();
     t.setSize(350,350);
     t.setVisible(true);
  }
  else if(e.getSource()==b5)
  {
     JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Book Issued Successfully!!!");
  }
 }
}
class Ret2 extends JFrame implements ActionListener
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String bname,isbn;
JLabel l1,l2,l3,l4,l5;
 JTextField t1,t2,t3,t4,t5;
 JButton b1,b2,b3,b4;
 public Ret2()
 {
  JPanel p=new JPanel(new GridLayout(7,2,15,15));
  l1=new JLabel("Book Name");
  l2=new JLabel("ISBN Number");
  l3=new JLabel("No.of days past due");
  l4=new JLabel("Fine Amount");
  l5=new JLabel("Today's Date");
  t1=new JTextField(20);
  t2=new JTextField(20);
  t3=new JTextField(20);
  t4=new JTextField(20);
  t5=new JTextField(20);
  b1=new JButton("Calculate Fine");
  b2=new JButton("Return");
  b3=new JButton("Today's Date");
  b4=new JButton("Back");
  b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  b4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  l3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  l4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  l5.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t5.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  t4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(l3);
  p.add(t3);
  p.add(l5);
  p.add(t5);
  p.add(b3);
  p.add(b1);
  p.add(l4);
  p.add(t4);
  p.add(b2);
  p.add(b4);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  setContentPane(p);
 }
 public void actionPerformed(ActionEvent e)  {
   if(e.getSource()==b1)
   {
      int due_days=Integer.parseInt(t3.getText());       
      double total_due =due_days * 0.75;
      t4.setText(String.valueOf(total_due));
   }
   else if(e.getSource()==b2)
  {
       JOptionPane.showMessageDialog(this, 
        "<html><font face='Calibri' size='8' color='black'>Book Returned Successfully!!!");
  }
   else if(e.getSource()==b3)
  {
      int day, month, year;
      GregorianCalendar date = new GregorianCalendar();
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      String g=day+"/"+(month+1)+"/"+year;
      t5.setText(g);
  }
   else if(e.getSource()==b4)
  {
      Toggle1 t=new Toggle1();
      t.setSize(350,350);
      t.setVisible(true);
  }
 }
}

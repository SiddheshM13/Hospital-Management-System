import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



 
class Login extends JFrame implements ActionListener
{
 JButton SUBMIT, exitBtn;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
  Login()
  {
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  label1 = new JLabel();
  label1.setText("Username:");
  text1 = new JTextField(15);

  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(15);

  SUBMIT=new JButton("Login", new ImageIcon("images/key.gif"));
exitBtn = new JButton("Exit", new ImageIcon("images/Keys.gif"));


  
  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(SUBMIT);
  panel.add(exitBtn);

startBGMusic page1 = new startBGMusic();
try{
page1.playMusic();
}catch(Exception e){e.printStackTrace();}
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
                dispose();
                   
                    
}});

  setTitle("HOSPITAL DATABASE LOGIN ");
  }
 public void actionPerformed(ActionEvent ae)
  {
  String value1=text1.getText();
  String value2=text2.getText();
  if (value1.equals("akhil") && value2.equals("12345") || value1.equals("ashwin") && value2.equals("12345")||value1.equals("siddhesh") && value2.equals("12345")||value1.equals("srisail") && value2.equals("12345")) {
   this.hide();
  NextPage page=new NextPage();
  start page1=new start();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome  :  "+value1);
  page.getContentPane().add(label);


  }
  else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}
 class LoginDemo
{
  public static void main(String arg[])
  {
  try
  {
  Login frame=new Login();
  frame.setSize(400,200);
  frame.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
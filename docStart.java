import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class docStart extends JFrame implements ActionListener
{
	JButton badd,bmod,bview,bback,bexit;
	JLabel linfo,linfo1,linfo2,linfo3,linfo4;

	docStart()
	{
		super("Doctor's Information");
		setSize(1024,768);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		
		linfo=new JLabel("Doctor's   Information");
		linfo.setBounds(445,30,210,20);
		add(linfo);

		linfo1=new JLabel("1.  Add  Doctors  Information");
		linfo1.setBounds(200,150,210,20);
		add(linfo1);

		badd=new JButton("Add Data",new ImageIcon("images/add.gif"));
		badd.setBounds(350,180,180,30);
		add(badd);

		linfo2=new JLabel("2.  Modify  Doctors  Information");
		linfo2.setBounds(200,250,210,20);
		add(linfo2);

		bmod=new JButton("Modify Data",new ImageIcon("images/bModify.png"));
		bmod.setBounds(350,280,180,30);
		add(bmod);
		
		linfo3=new JLabel("3. View  Doctors  Information");
		linfo3.setBounds(200,350,210,20);
		add(linfo3);

		bview=new JButton("View Data",new ImageIcon("images/search.png"));
		bview.setBounds(350,380,180,30);
		add(bview);
		
		bback=new JButton("BACK",new ImageIcon("images/restore.png"));
		bback.setBounds(503,545,100,30);
		add(bback);
		
		//bexit=new JButton("EXIT");
		//bexit.setBounds(730,515,100,30);
		//add(bexit);
		
		badd.addActionListener(new add());
		bmod.addActionListener(new mod());
		bview.addActionListener(new view());
		//bexit.addActionListener(new exit());
		bback.addActionListener(new back());
				
	}

	public void actionPerformed(ActionEvent ae)
		{}

	class back implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			new  start();
			setVisible(false);
		}
	}



	class add implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new	DoctorInfoAdd();
					setVisible(false);
				}
		}

	class mod implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new DoctorInfomodify();
					setVisible(false);
				}
		}

	class view implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					new DoctorInfoView();
					setVisible(false);
				}
		}

/*
	class exit implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
				{
					System.exit(0);
				}
		}
*/
	public static void main(String[] args) 
	{
		new docStart();
	}
}

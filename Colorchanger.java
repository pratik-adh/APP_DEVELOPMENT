package NewProject;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
public class Colorchanger
{
	JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9;
	Colorchanger()
	{
		JFrame jfrm=new JFrame("COLORS");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jfrm.setSize(500,520);
		jfrm.setResizable(true);
		jfrm.setLayout(null);
		
		JLabel jbl=new JLabel("CHOOSE ANY COLOR THAT YOU WANT FROM THE BELOW BOXES!!");
		jfrm.getContentPane().add(jbl);
		jbl.setBounds(20,15,400,20);
		
		jbtn1=new JButton("RED");
		jbtn1.setBounds(20,40,100,100);
		jfrm.getContentPane().add(jbtn1);
		jbtn1.setBackground(Color.RED);
		jbtn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jfrm.getContentPane().setBackground(Color.RED);
				jbtn1.setBackground(Color.WHITE);
				jbtn2.setBackground(Color.YELLOW);
				jbtn3.setBackground(Color.GRAY);
				jbtn4.setBackground(Color.MAGENTA);
				jbtn6.setBackground(Color.GREEN);
				jbtn7.setBackground(Color.BLUE);
				jbtn8.setBackground(Color.CYAN);
				jbtn9.setBackground(Color.PINK);
			}
		});
		jbtn2=new JButton("YELLOW");
		jbtn2.setBounds(20,170,100,100);
		jfrm.getContentPane().add(jbtn2);
		jbtn2.setBackground(Color.YELLOW);
		jbtn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jfrm.getContentPane().setBackground(Color.YELLOW);
				jbtn2.setBackground(Color.WHITE);
				jbtn1.setBackground(Color.RED);
				jbtn5.setBackground(Color.ORANGE);
				jbtn3.setBackground(Color.GRAY);
				jbtn4.setBackground(Color.MAGENTA);
				jbtn6.setBackground(Color.GREEN);
				jbtn7.setBackground(Color.BLUE);
				jbtn8.setBackground(Color.CYAN);
				jbtn9.setBackground(Color.PINK);
			}
		});
		jbtn3=new JButton("GRAY");
		jbtn3.setBounds(160,40,100,100);
		jfrm.getContentPane().add(jbtn3);
		jbtn3.setBackground(Color.GRAY);
		jbtn3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.GRAY);
						jbtn3.setBackground(Color.WHITE);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn6.setBackground(Color.GREEN);
						jbtn7.setBackground(Color.BLUE);
						jbtn8.setBackground(Color.CYAN);
						jbtn9.setBackground(Color.PINK);
						
					}
				});
		jbtn4=new JButton("MAGENTA");
		jbtn4.setBounds(300,40,100,100);
		jfrm.getContentPane().add(jbtn4);
		jbtn4.setBackground(Color.MAGENTA);
		jbtn4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.MAGENTA);
						jbtn4.setBackground(Color.WHITE);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
						jbtn6.setBackground(Color.GREEN);
						jbtn7.setBackground(Color.BLUE);
						jbtn8.setBackground(Color.CYAN);
						jbtn9.setBackground(Color.PINK);
					}
				});
		jbtn5=new JButton("ORANGE");
		jbtn5.setBounds(20,320,100,100);
		jbtn5.setBackground(Color.ORANGE);
		jfrm.getContentPane().add(jbtn5);
		jbtn5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.ORANGE);
						jbtn5.setBackground(Color.WHITE);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
						jbtn6.setBackground(Color.GREEN);
						jbtn7.setBackground(Color.BLUE);
						jbtn8.setBackground(Color.CYAN);
						jbtn9.setBackground(Color.PINK);
					}
				});
		jbtn6=new JButton("GREEN");
		jbtn6.setBounds(160,170,100,100);
		jbtn6.setBackground(Color.GREEN);
		jfrm.getContentPane().add(jbtn6);
		jbtn6.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.GREEN);
						jbtn6.setBackground(Color.WHITE);
						jbtn5.setBackground(Color.ORANGE);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
						jbtn7.setBackground(Color.BLUE);
						jbtn8.setBackground(Color.CYAN);
						jbtn9.setBackground(Color.PINK);
					}
				});
		jbtn7=new JButton("BLUE");
		jbtn7.setBounds(300,170,100,100);
		jbtn7.setBackground(Color.BLUE);
		jfrm.getContentPane().add(jbtn7);
		jbtn7.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.BLUE);
						jbtn7.setBackground(Color.WHITE);
						jbtn6.setBackground(Color.GREEN);
						jbtn5.setBackground(Color.ORANGE);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
						jbtn8.setBackground(Color.CYAN);
						jbtn9.setBackground(Color.PINK);
					}
				});
		jbtn8=new JButton("CYAN");
		jbtn8.setBounds(160,320,100,100);
		jbtn8.setBackground(Color.CYAN);
		jfrm.getContentPane().add(jbtn8);
		jbtn8.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.CYAN);
						jbtn8.setBackground(Color.WHITE);
						jbtn7.setBackground(Color.BLUE);
						jbtn6.setBackground(Color.GREEN);
						jbtn5.setBackground(Color.ORANGE);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
						jbtn9.setBackground(Color.PINK);
					}
				});
		jbtn9=new JButton("PINK");
		jbtn9.setBounds(300,320,100,100);
		jfrm.getContentPane().add(jbtn9);
		jbtn9.setBackground(Color.PINK);
		jbtn9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						jfrm.getContentPane().setBackground(Color.PINK);
						jbtn9.setBackground(Color.WHITE);
						jbtn8.setBackground(Color.CYAN);
						jbtn7.setBackground(Color.BLUE);
						jbtn6.setBackground(Color.GREEN);
						jbtn5.setBackground(Color.ORANGE);
						jbtn4.setBackground(Color.MAGENTA);
						jbtn1.setBackground(Color.RED);
						jbtn2.setBackground(Color.YELLOW);
						jbtn3.setBackground(Color.GRAY);
					}
				});
		jfrm.setVisible(true);
		jfrm.setLocation(300,120);
		JLabel jlb=new JLabel("BY: PRATIK ADHIKARI");
		jlb.setBounds(300,430,200,20);
		jfrm.getContentPane().add(jlb);
		JLabel jlb1=new JLabel("15L31A05M2");
		jlb1.setBounds(300,450,200,20);
		jfrm.getContentPane().add(jlb1);
		
	}	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Colorchanger();
			}
		});
	}
}

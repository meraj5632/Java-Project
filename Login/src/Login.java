import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPass;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public Login() 
	{
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 280, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(11, 33, 53));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel varName = new JLabel("Username");
		varName.setForeground(new Color(140, 213, 251));
		varName.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		varName.setBounds(69, 81, 96, 35);
		contentPane.add(varName);
		
		JLabel varPass = new JLabel("Password");
		varPass.setForeground(new Color(140, 213, 251));
		varPass.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		varPass.setBounds(69, 143, 96, 35);
		contentPane.add(varPass);
		
		JTextArea txtName = new JTextArea();
		txtName.setBackground(new Color(194, 217, 254));
		txtName.setBounds(175, 81, 150, 35);
		contentPane.add(txtName);
		
		txtPass = new JPasswordField();
		txtPass.setBackground(new Color(194, 217, 254));
		txtPass.setBounds(175, 138, 150, 35);
		contentPane.add(txtPass);
		
		JLabel Info = new JLabel("Meraj Co.");
		Info.setForeground(new Color(255, 255, 255));
		Info.setFont(new Font("Rockwell", Font.BOLD, 20));
		Info.setBounds(168, 10, 127, 40);
		contentPane.add(Info);
		
		JButton login = new JButton("Login");
		login.setForeground(new Color(0, 0, 64));
		login.setBackground(new Color(255, 127, 80));
		login.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		login.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{															// MD. Merajul Alam Meraj
				String userName = txtName.getText();					// 221-15-5632
				String pass = txtPass.getText();						// Section 61_U
				
				if (userName.contains("Miraj") && pass.contains("siiuuu") )
				{
					JOptionPane.showMessageDialog(null, "Login Successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Username or Password", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		
		});
		login.setBounds(135, 198, 85, 25);
		contentPane.add(login);
	}
}

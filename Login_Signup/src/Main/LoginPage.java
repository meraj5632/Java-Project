package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(217, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(186, 79, 84));
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("En Passant");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Jokerman", Font.PLAIN, 45));
		lblNewLabel.setBounds(57, 192, 243, 40);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Connect Share Play Repeat");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(451, 146, 220, 40);
		contentPane_1.add(lblNewLabel_2);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		loginBtn.setBackground(new Color(74, 31, 61));
		loginBtn.setBounds(451, 202, 85, 30);
		contentPane_1.add(loginBtn);
		
		JButton singupBtn = new JButton("Sign up");
		singupBtn.setForeground(Color.WHITE);
		singupBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		singupBtn.setBackground(new Color(74, 31, 61));
		singupBtn.setBounds(586, 202, 85, 30);
		contentPane_1.add(singupBtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(174, 106, 85, 85);
		contentPane_1.add(lblNewLabel_1);
		
		JPanel passwordTxt = new JPanel();
		passwordTxt.setLayout(null);
		passwordTxt.setBorder(new EmptyBorder(5, 5, 5, 5));
		passwordTxt.setBackground(new Color(186, 79, 84));
		passwordTxt.setBounds(0, 0, 736, 413);
		contentPane.add(passwordTxt);
		
		JLabel logoLbl = new JLabel("");
		logoLbl.setIcon(new ImageIcon("C:\\Users\\Use5r\\Downloads\\chess (1).png"));
		logoLbl.setBounds(175, 10, 85, 85);
		passwordTxt.add(logoLbl);
		
		JLabel companyLbl = new JLabel("En Passant");
		companyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		companyLbl.setForeground(Color.BLACK);
		companyLbl.setFont(new Font("Jokerman", Font.PLAIN, 45));
		companyLbl.setBounds(270, 40, 243, 40);
		passwordTxt.add(companyLbl);
		
		JLabel loginLbl = new JLabel("Login Here!");
		loginLbl.setHorizontalAlignment(SwingConstants.CENTER);
		loginLbl.setForeground(Color.BLACK);
		loginLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		loginLbl.setBounds(269, 105, 220, 40);
		passwordTxt.add(loginLbl);
		
		JButton loginHereBtn = new JButton("Login");			// Merajul Alam Meraj
		loginHereBtn.addActionListener(new ActionListener() {   // 221-15-5632 (U)
			public void actionPerformed(ActionEvent e) 
			{
				String username = usernameTxt.getText();
				String password = passTxt.getText();
				
				if (username.contains("Meraj") && password.contains("HalaMadrid"))
				{
					JOptionPane.showMessageDialog(null, "Login Successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid input", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		loginHereBtn.setForeground(Color.WHITE);
		loginHereBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		loginHereBtn.setBackground(new Color(74, 31, 61));
		loginHereBtn.setBounds(329, 255, 85, 30);
		passwordTxt.add(loginHereBtn);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(205, 155, 85, 25);
		passwordTxt.add(lblNewLabel_3);
		
		usernameTxt = new JTextField();
		usernameTxt.setBackground(new Color(206, 138, 186));
		usernameTxt.setBounds(302, 157, 180, 25);
		passwordTxt.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel passwordBtn = new JLabel("Password");
		passwordBtn.setForeground(new Color(0, 0, 0));
		passwordBtn.setHorizontalAlignment(SwingConstants.CENTER);
		passwordBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordBtn.setBounds(205, 203, 85, 25);
		passwordTxt.add(passwordBtn);
		
		passTxt = new JPasswordField();
		passTxt.setBackground(new Color(206, 138, 186));
		passTxt.setBounds(302, 205, 180, 25);
		passwordTxt.add(passTxt);
		
		JButton signupBtn = new JButton("Sign up");
		signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignupPage.main(null);
			
			}
			
		});
		signupBtn.setForeground(Color.WHITE);
		signupBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
		signupBtn.setBackground(new Color(74, 31, 61));
		signupBtn.setBounds(551, 336, 80, 20);
		passwordTxt.add(signupBtn);
		
		JLabel lblNewLabel_4 = new JLabel("Create New Account");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(530, 312, 125, 15);
		passwordTxt.add(lblNewLabel_4);
	}
}

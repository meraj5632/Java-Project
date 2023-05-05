package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupPage extends JFrame {

	private JPanel contentPane;
	private JTextField FNTxt;
	private JPasswordField PassTxt;
	private JTextField LNTxt;
	private JTextField EmailTxt;
	private JTextField UNTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
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
	public SignupPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBackground(new Color(186, 79, 84));
		contentPane_2.setBounds(0, 0, 736, 413);
		contentPane.add(contentPane_2);
		
		JLabel companyLbl = new JLabel("En Passant");
		companyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		companyLbl.setForeground(Color.BLACK);
		companyLbl.setFont(new Font("Jokerman", Font.PLAIN, 45));
		companyLbl.setBounds(28, 178, 243, 40);
		contentPane_2.add(companyLbl);
		
		JLabel signupLbl = new JLabel("Signup Here!");
		signupLbl.setHorizontalAlignment(SwingConstants.CENTER);
		signupLbl.setForeground(Color.BLACK);
		signupLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		signupLbl.setBounds(401, 21, 220, 40);
		contentPane_2.add(signupLbl);
		
		JButton signupHereBtn = new JButton("Sign up");
		signupHereBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstName = FNTxt.getText();
				String lastName = LNTxt.getText();						// Merajul Alam Meraj
				String email = EmailTxt.getText();						// 221-15-5632 (U)
				String username = UNTxt.getText();
				String password = PassTxt.getText();
			
				System.out.println("First name is " + firstName);
				System.out.println("Last name is " + lastName);
				System.out.println("Email address is " +email);
				System.out.println("Username is " + username);
				System.out.println("Password is " + password);
			}
		});
		signupHereBtn.setForeground(Color.WHITE);
		signupHereBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		signupHereBtn.setBackground(new Color(74, 31, 61));
		signupHereBtn.setBounds(480, 301, 85, 30);
		contentPane_2.add(signupHereBtn);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(382, 83, 85, 25);
		contentPane_2.add(lblNewLabel_3);
		
		FNTxt = new JTextField();
		FNTxt.setColumns(10);
		FNTxt.setBackground(new Color(206, 138, 186));
		FNTxt.setBounds(480, 85, 180, 25);
		contentPane_2.add(FNTxt);
		
		JLabel passwordBtn = new JLabel("Password");
		passwordBtn.setForeground(Color.BLACK);
		passwordBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordBtn.setBounds(382, 248, 85, 25);
		contentPane_2.add(passwordBtn);
		
		PassTxt = new JPasswordField();
		PassTxt.setBackground(new Color(206, 138, 186));
		PassTxt.setBounds(480, 250, 180, 25);
		contentPane_2.add(PassTxt);
		
		JLabel logoLbl = new JLabel("");
		logoLbl.setIcon(new ImageIcon("C:\\Users\\Use5r\\Downloads\\chess (1).png"));
		logoLbl.setBounds(108, 83, 85, 85);
		contentPane_2.add(logoLbl);
		
		LNTxt = new JTextField();
		LNTxt.setColumns(10);
		LNTxt.setBackground(new Color(206, 138, 186));
		LNTxt.setBounds(480, 130, 180, 25);
		contentPane_2.add(LNTxt);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(382, 128, 85, 25);
		contentPane_2.add(lblNewLabel_3_1);
		
		EmailTxt = new JTextField();
		EmailTxt.setColumns(10);
		EmailTxt.setBackground(new Color(206, 138, 186));
		EmailTxt.setBounds(480, 169, 180, 25);
		contentPane_2.add(EmailTxt);
		
		JLabel lblNewLabel_3_2 = new JLabel("Email");
		lblNewLabel_3_2.setForeground(Color.BLACK);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(382, 167, 85, 25);
		contentPane_2.add(lblNewLabel_3_2);
		
		UNTxt = new JTextField();
		UNTxt.setColumns(10);
		UNTxt.setBackground(new Color(206, 138, 186));
		UNTxt.setBounds(480, 209, 180, 25);
		contentPane_2.add(UNTxt);
		
		JLabel lblNewLabel_3_3 = new JLabel("Username");
		lblNewLabel_3_3.setForeground(Color.BLACK);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(382, 207, 85, 25);
		contentPane_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("Already Have an Account?");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(63, 284, 165, 13);
		contentPane_2.add(lblNewLabel_4);
		
		JButton loginBtn = new JButton("Log in");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LoginPage.main(null);
			}
		});
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
		loginBtn.setBackground(new Color(74, 31, 61));
		loginBtn.setBounds(101, 307, 65, 23);
		contentPane_2.add(loginBtn);
	}
}

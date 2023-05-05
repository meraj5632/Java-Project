package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPage extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 79, 84));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel companyLbl = new JLabel("En Passant");
		companyLbl.setForeground(new Color(0, 0, 0));
		companyLbl.setFont(new Font("Jokerman", Font.PLAIN, 45));
		companyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		companyLbl.setBounds(57, 192, 243, 40);
		contentPane.add(companyLbl);
		
		JLabel mottoLbl = new JLabel("Connect Share Play Repeat");
		mottoLbl.setForeground(new Color(0, 0, 0));
		mottoLbl.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		mottoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mottoLbl.setBounds(451, 146, 220, 40);
		contentPane.add(mottoLbl);
		
		JButton loginBtn = new JButton("Login");					// Merajul Alam Meraj
		loginBtn.addActionListener(new ActionListener() {			// 221-15-5632 (U)
			public void actionPerformed(ActionEvent e) 
			{
				LoginPage.main(null);
			}
		});
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setBackground(new Color(74, 31, 61));
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		loginBtn.setBounds(451, 202, 85, 30);
		contentPane.add(loginBtn);
		
		JButton singupBtn = new JButton("Sign up");
		singupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignupPage.main(null);
			}
		});
		singupBtn.setForeground(Color.WHITE);
		singupBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		singupBtn.setBackground(new Color(74, 31, 61));
		singupBtn.setBounds(586, 202, 85, 30);
		contentPane.add(singupBtn);
		
		JLabel logoLbl = new JLabel("");
		logoLbl.setIcon(new ImageIcon("C:\\Users\\Use5r\\Downloads\\chess (1).png"));
		logoLbl.setBounds(174, 106, 85, 85);
		contentPane.add(logoLbl);
	}
}

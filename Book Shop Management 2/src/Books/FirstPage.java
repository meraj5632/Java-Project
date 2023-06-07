package Books;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class FirstPage {

	private JFrame frame;
	private JPasswordField ps;
	private JTextField us;
	private final JLabel lblNewLabel_1 = new JLabel("");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FirstPage() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(217, 177, 134));
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 199, 513);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Use5r\\Desktop\\Book Shop Management 2\\Logo\\pattern.jpg"));
		lblNewLabel_1.setBounds(0, 0, 199, 513);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Light House");
		lblNewLabel.setForeground(new Color(86, 50, 50));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 65));
		lblNewLabel.setBounds(321, 34, 377, 90);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel userid = new JPanel();
		userid.setToolTipText("");
		userid.setBackground(new Color(86, 50, 50));
		userid.setBorder(new EmptyBorder(0, 0, 0, 0));
		userid.setBounds(252, 147, 484, 299);
		frame.getContentPane().add(userid);
		userid.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(217, 177, 134));
		lblNewLabel_2.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		lblNewLabel_2.setBounds(69, 71, 95, 36);
		userid.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password ");
		lblNewLabel_2_1.setForeground(new Color(217, 177, 134));
		lblNewLabel_2_1.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(68, 135, 79, 36);
		userid.add(lblNewLabel_2_1);
		
		ps = new JPasswordField();
		ps.setFont(new Font("Tahoma", Font.BOLD, 15));
		ps.setBackground(new Color(217, 177, 134));
		ps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ps.setBounds(175, 141, 243, 29);
		userid.add(ps);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(86, 50, 50));
		btnNewButton.setBackground(new Color(217, 177, 134));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user=us.getText();
				String pass=ps.getText();
				
				if(user.contains("Meraj") && pass.contains("5632"))
				{
					SecondPage.main();
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Login invalid");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(202, 214, 85, 29);
		userid.add(btnNewButton);
		
		us = new JTextField();
		us.setFont(new Font("Tahoma", Font.BOLD, 15));
		us.setBackground(new Color(217, 177, 134));
		us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		us.setBounds(174, 77, 243, 29);
		userid.add(us);
		us.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(231, 12, 100, 100);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Use5r\\Desktop\\Book Shop Management 2\\Logo\\Main Logo.png"));
	}
}

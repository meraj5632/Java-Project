package Fahrenheit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainPage.FirstPage;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FahrenheitToKelvin extends JFrame {

	private JPanel contentPane;
	private JTextField FtK_in;
	private JTextField FtK_out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitToKelvin frame = new FahrenheitToKelvin();
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
	public FahrenheitToKelvin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 686, 663);
		contentPane.add(contentPane_1);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBackground(new Color(140, 140, 255));
		contentPane_1_1.setBounds(0, 0, 686, 663);
		contentPane_1.add(contentPane_1_1);
		
		JLabel lblNewLabel = new JLabel("Meraj's");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 35));
		lblNewLabel.setBounds(195, 60, 150, 50);
		contentPane_1_1.add(lblNewLabel);
		
		JLabel lblTemperatureConverter = new JLabel("Temperature Converter");
		lblTemperatureConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter.setForeground(Color.BLACK);
		lblTemperatureConverter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblTemperatureConverter.setBounds(274, 95, 200, 40);
		contentPane_1_1.add(lblTemperatureConverter);
		
		JLabel lblNewLabel_1 = new JLabel("Fahrenheit");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(127, 299, 150, 33);
		contentPane_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fahrenheit to Kelvin");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(142, 208, 292, 65);
		contentPane_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kelvin");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(127, 364, 150, 33);
		contentPane_1_1.add(lblNewLabel_1_1);
		
		FtK_in = new JTextField();
		FtK_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FtK_in.setColumns(10);
		FtK_in.setBackground(new Color(174, 226, 247));
		FtK_in.setBounds(287, 304, 200, 30);
		contentPane_1_1.add(FtK_in);
		
		FtK_out = new JTextField();
		FtK_out.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FtK_out.setColumns(10);
		FtK_out.setBackground(new Color(174, 226, 247));
		FtK_out.setBounds(287, 369, 200, 30);
		contentPane_1_1.add(FtK_out);
		
		JButton btnFtK = new JButton("Calculate");
		btnFtK.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String Fstr = FtK_in.getText();
				double F = Double.parseDouble(Fstr);
				
				double K = (F+459.67) * 0.5556;
				String Kstr = Double.toString(K);
				FtK_out.setText(Kstr);
				
						
			}
		});
		btnFtK.setForeground(Color.WHITE);
		btnFtK.setBackground(new Color(0, 0, 64));
		btnFtK.setBounds(248, 429, 100, 25);
		contentPane_1_1.add(btnFtK);
		
		JButton MainFtK = new JButton("Main Menu");
		MainFtK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FirstPage.main(null);
			}
		});
		MainFtK.setForeground(Color.WHITE);
		MainFtK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainFtK.setBackground(new Color(176, 98, 19));
		MainFtK.setBounds(446, 558, 150, 21);
		contentPane_1_1.add(MainFtK);
	}

}

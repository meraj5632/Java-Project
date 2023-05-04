package Kelvin;

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

public class KelvinToFahrenheit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField KtF_in;
	private JTextField KtF_out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KelvinToFahrenheit frame = new KelvinToFahrenheit();
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
	public KelvinToFahrenheit() {
		setTitle("Kelvin to Fahrenheit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(342, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBounds(0, 0, 686, 663);
		contentPane_1.add(contentPane_1_1);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1_1.setBounds(0, 0, 686, 663);
		contentPane_1_1.add(contentPane_1_1_1);
		
		JPanel contentPane_1_1_1_1 = new JPanel();
		contentPane_1_1_1_1.setLayout(null);
		contentPane_1_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1_1_1.setBackground(new Color(140, 140, 255));
		contentPane_1_1_1_1.setBounds(0, 0, 686, 663);
		contentPane_1_1_1.add(contentPane_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Meraj's");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 35));
		lblNewLabel.setBounds(195, 60, 150, 50);
		contentPane_1_1_1_1.add(lblNewLabel);
		
		JLabel lblTemperatureConverter = new JLabel("Temperature Converter");
		lblTemperatureConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter.setForeground(Color.BLACK);
		lblTemperatureConverter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblTemperatureConverter.setBounds(274, 95, 200, 40);
		contentPane_1_1_1_1.add(lblTemperatureConverter);
		
		JLabel lblNewLabel_1 = new JLabel("Kelvin");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(127, 299, 150, 33);
		contentPane_1_1_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kelvin to Celcius");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(142, 208, 292, 65);
		contentPane_1_1_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Celcius");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(127, 364, 150, 33);
		contentPane_1_1_1_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(new Color(174, 226, 247));
		textField.setBounds(287, 304, 200, 30);
		contentPane_1_1_1_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(174, 226, 247));
		textField_1.setBounds(287, 369, 200, 30);
		contentPane_1_1_1_1.add(textField_1);
		
		JButton btnKtC = new JButton("Calculate");
		btnKtC.setForeground(Color.WHITE);
		btnKtC.setBackground(new Color(0, 0, 64));
		btnKtC.setBounds(248, 429, 100, 25);
		contentPane_1_1_1_1.add(btnKtC);
		
		JButton MainKtC = new JButton("Main Menu");
		MainKtC.setForeground(Color.WHITE);
		MainKtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainKtC.setBackground(new Color(176, 98, 19));
		MainKtC.setBounds(446, 558, 150, 21);
		contentPane_1_1_1_1.add(MainKtC);
		
		JPanel contentPane_1_1_1_2 = new JPanel();
		contentPane_1_1_1_2.setBounds(0, 0, 686, 663);
		contentPane.add(contentPane_1_1_1_2);
		contentPane_1_1_1_2.setLayout(null);
		contentPane_1_1_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1_1_2.setBackground(new Color(140, 140, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Meraj's");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Forte", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(195, 60, 150, 50);
		contentPane_1_1_1_2.add(lblNewLabel_3);
		
		JLabel lblTemperatureConverter_1 = new JLabel("Temperature Converter");
		lblTemperatureConverter_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter_1.setForeground(Color.BLACK);
		lblTemperatureConverter_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblTemperatureConverter_1.setBounds(274, 95, 200, 40);
		contentPane_1_1_1_2.add(lblTemperatureConverter_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Kelvin");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(127, 299, 150, 33);
		contentPane_1_1_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kelvin to Fahrenheit");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(142, 208, 292, 65);
		contentPane_1_1_1_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fahrenheit");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(127, 364, 150, 33);
		contentPane_1_1_1_2.add(lblNewLabel_1_1_1);
		
		KtF_in = new JTextField();
		KtF_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		KtF_in.setColumns(10);
		KtF_in.setBackground(new Color(174, 226, 247));
		KtF_in.setBounds(287, 304, 200, 30);
		contentPane_1_1_1_2.add(KtF_in);
		
		KtF_out = new JTextField();
		KtF_out.setFont(new Font("Tahoma", Font.PLAIN, 18));
		KtF_out.setColumns(10);
		KtF_out.setBackground(new Color(174, 226, 247));
		KtF_out.setBounds(287, 369, 200, 30);
		contentPane_1_1_1_2.add(KtF_out);
		
		JButton btnKtF = new JButton("Calculate");
		btnKtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Kstr = KtF_in.getText();
				double K = Double.parseDouble(Kstr);
				
				double F = (K*1.8) - 459.67;
				
				String Fstr = Double.toString(F);
				KtF_out.setText(Fstr);
				
			}
		});
		btnKtF.setForeground(Color.WHITE);
		btnKtF.setBackground(new Color(0, 0, 64));
		btnKtF.setBounds(248, 429, 100, 25);
		contentPane_1_1_1_2.add(btnKtF);
		
		JButton MainKtF = new JButton("Main Menu");
		MainKtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FirstPage.main(null);
			}
		});
		MainKtF.setForeground(Color.WHITE);
		MainKtF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainKtF.setBackground(new Color(176, 98, 19));
		MainKtF.setBounds(446, 558, 150, 21);
		contentPane_1_1_1_2.add(MainKtF);
	}

}

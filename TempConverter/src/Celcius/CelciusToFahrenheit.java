package Celcius;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainPage.FirstPage;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelciusToFahrenheit extends JFrame {

	private JPanel contentPane;
	private JTextField CtF_in;
	private JTextField CtF_out;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelciusToFahrenheit frame = new CelciusToFahrenheit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CelciusToFahrenheit() {
		setTitle("Celcius to Fahrenheit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(140, 140, 255));
		contentPane_1.setBounds(0, 0, 686, 663);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Meraj's");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 35));
		lblNewLabel.setBounds(195, 60, 150, 50);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblTemperatureConverter = new JLabel("Temperature Converter");
		lblTemperatureConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter.setForeground(Color.BLACK);
		lblTemperatureConverter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblTemperatureConverter.setBounds(274, 95, 200, 40);
		contentPane_1.add(lblTemperatureConverter);
		
		JLabel lblNewLabel_1 = new JLabel("Celcius");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(127, 299, 150, 33);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Celcius to Fahrenheit");
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(142, 208, 292, 65);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fahrenheit");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(127, 364, 150, 33);
		contentPane_1.add(lblNewLabel_1_1);
		
		
		CtF_in = new JTextField();
		CtF_in.setBackground(new Color(174, 226, 247));
		CtF_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CtF_in.setBounds(287, 304, 200, 30);
		contentPane_1.add(CtF_in);
		CtF_in.setColumns(10);
		
		CtF_out = new JTextField();
		CtF_out.setBackground(new Color(174, 226, 247));
		CtF_out.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CtF_out.setColumns(10);
		CtF_out.setBounds(287, 369, 200, 30);
		contentPane_1.add(CtF_out);
		
		JButton btnCtF = new JButton("Calculate");
		btnCtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cstr = CtF_in.getText();
				double C = Double.parseDouble(Cstr);
				double F = (C*1.8)+32;
				
				String Fstr = Double.toString(F);
				CtF_out.setText(Fstr);
			}
		});
		btnCtF.setBackground(new Color(0, 0, 64));
		btnCtF.setForeground(new Color(255, 255, 255));
		btnCtF.setBounds(248, 429, 100, 25);
		contentPane_1.add(btnCtF);
		
		
		JButton MainCtF = new JButton("Main Menu");
		MainCtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FirstPage.main(null);
			}
		});
		MainCtF.setBackground(new Color(176, 98, 19));
		MainCtF.setForeground(new Color(255, 255, 255));
		MainCtF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainCtF.setBounds(446, 558, 150, 21);
		contentPane_1.add(MainCtF);
		
		
	}
}

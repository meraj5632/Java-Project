package MainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Celcius.CelciusToFahrenheit;
import Celcius.CelciusToKelvin;
import Fahrenheit.FahrenheitToCelcius;
import Fahrenheit.FahrenheitToKelvin;
import Kelvin.KelvinToCelcius;
import Kelvin.KelvinToFahrenheit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

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
		setTitle("Meraj's Converter");
		setForeground(new Color(0, 0, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(140, 140, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meraj's");
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(195, 60, 150, 50);
		contentPane.add(lblNewLabel);
		
	
		JLabel lblTemperatureConverter = new JLabel("Temperature Converter");
		lblTemperatureConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter.setForeground(new Color(0, 0, 64));
		lblTemperatureConverter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblTemperatureConverter.setBounds(274, 95, 226, 40);
		contentPane.add(lblTemperatureConverter);
		
		JButton CtF = new JButton("Celcius to Fahrenheit");
		CtF.setBackground(new Color(0, 0, 64));
		CtF.setForeground(new Color(255, 255, 255));
		CtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CelciusToFahrenheit.main(null);
			}
		});
		CtF.setBounds(90, 229, 200, 30);
		contentPane.add(CtF);
		
		
		JButton FtC = new JButton("Fahrenheit to Celcius ");
		FtC.setForeground(new Color(255, 255, 255));
		FtC.setBackground(new Color(0, 0, 64));
		FtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FahrenheitToCelcius.main(null);
			}
		});
		FtC.setBounds(90, 331, 200, 30);
		contentPane.add(FtC);
		
		JButton CtK = new JButton("Celcius to Kelvin");
		CtK.setForeground(new Color(255, 255, 255));
		CtK.setBackground(new Color(0, 0, 64));
		CtK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CelciusToKelvin.main(null);
			}
		});
		CtK.setBounds(372, 229, 200, 30);
		contentPane.add(CtK);
		
		JButton FtK = new JButton("Fahrenheit to Kelvin");
		FtK.setForeground(new Color(255, 255, 255));
		FtK.setBackground(new Color(0, 0, 64));
		FtK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FahrenheitToKelvin.main(null);
			}
		});
		FtK.setBounds(372, 331, 200, 30);
		contentPane.add(FtK);
		
		JButton KtC = new JButton("Kelvin to Celcius");
		KtC.setForeground(new Color(255, 255, 255));
		KtC.setBackground(new Color(0, 0, 64));
		KtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				KelvinToCelcius.main(null);
			}
		});
		KtC.setBounds(90, 435, 200, 30);
		contentPane.add(KtC);
		
		JButton KtF = new JButton("Kelvin to Fahrenheit");
		KtF.setForeground(new Color(255, 255, 255));
		KtF.setBackground(new Color(0, 0, 64));
		KtF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				KelvinToFahrenheit.main( );
			}
			
		});
		KtF.setBounds(372, 435, 200, 30);
		contentPane.add(KtF);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Use5r\\Downloads\\thermometer-icon-png-11 (1).jpg"));
		lblNewLabel_1.setBounds(125, 50, 60, 60);
		contentPane.add(lblNewLabel_1);
	}
}

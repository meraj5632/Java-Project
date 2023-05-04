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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelciusToKelvin extends JFrame {

	private JPanel contentPane;
	private JTextField CtK_in;
	private JTextField CtK_out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelciusToKelvin frame = new CelciusToKelvin();
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
	public CelciusToKelvin() {
		setTitle("Celcius to Kelvin");
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
		
		JLabel lblNewLabel_2 = new JLabel("Celcius to Kelvin");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(142, 208, 292, 65);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kelvin");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(127, 364, 150, 33);
		contentPane_1.add(lblNewLabel_1_1);
		
		CtK_in = new JTextField();
		CtK_in.setBackground(new Color(174, 226, 247));
		CtK_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CtK_in.setColumns(10);
		CtK_in.setBounds(287, 304, 200, 30);
		contentPane_1.add(CtK_in);
		
		CtK_out = new JTextField();
		CtK_out.setBackground(new Color(174, 226, 247));
		CtK_out.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CtK_out.setColumns(10);
		CtK_out.setBounds(287, 369, 200, 30);
		contentPane_1.add(CtK_out);
		
		JButton btnCtK = new JButton("Calculate");
		btnCtK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cstr = CtK_in.getText();
				double C = Double.parseDouble(Cstr);
				
				double K = C+273.15;
				String Kstr = Double.toString(K);
				
				CtK_out.setText(Kstr);
			}
		});
		btnCtK.setForeground(Color.WHITE);
		btnCtK.setBackground(new Color(0, 0, 64));
		btnCtK.setBounds(248, 429, 100, 25);
		contentPane_1.add(btnCtK);
		
		JButton MainCtK = new JButton("Main Menu");
		MainCtK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FirstPage.main(null);
			}
		});
		MainCtK.setForeground(Color.WHITE);
		MainCtK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainCtK.setBackground(new Color(176, 98, 19));
		MainCtK.setBounds(446, 558, 150, 21);
		contentPane_1.add(MainCtK);
	}

}

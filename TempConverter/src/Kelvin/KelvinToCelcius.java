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

public class KelvinToCelcius extends JFrame {

	private JPanel contentPane;
	private JTextField KtC_in;
	private JTextField KtC_out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KelvinToCelcius frame = new KelvinToCelcius();
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
	public KelvinToCelcius() {
		setTitle("Kelvin to Celcius");
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
		contentPane_1_1.setBounds(0, 0, 686, 663);
		contentPane_1.add(contentPane_1_1);
		
		JPanel contentPane_1_1_1 = new JPanel();
		contentPane_1_1_1.setLayout(null);
		contentPane_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1_1.setBackground(new Color(140, 140, 255));
		contentPane_1_1_1.setBounds(0, 0, 686, 663);
		contentPane_1_1.add(contentPane_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Meraj's");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 35));
		lblNewLabel.setBounds(195, 60, 150, 50);
		contentPane_1_1_1.add(lblNewLabel);
		
		JLabel lblTemperatureConverter = new JLabel("Temperature Converter");
		lblTemperatureConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConverter.setForeground(Color.BLACK);
		lblTemperatureConverter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblTemperatureConverter.setBounds(274, 95, 200, 40);
		contentPane_1_1_1.add(lblTemperatureConverter);
		
		JLabel lblNewLabel_1 = new JLabel("Kelvin");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(127, 299, 150, 33);
		contentPane_1_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kelvin to Celcius");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(142, 208, 292, 65);
		contentPane_1_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Celcius");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(127, 364, 150, 33);
		contentPane_1_1_1.add(lblNewLabel_1_1);
		
		KtC_in = new JTextField();
		KtC_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		KtC_in.setColumns(10);
		KtC_in.setBackground(new Color(174, 226, 247));
		KtC_in.setBounds(287, 304, 200, 30);
		contentPane_1_1_1.add(KtC_in);
		
		KtC_out = new JTextField();
		KtC_out.setFont(new Font("Tahoma", Font.PLAIN, 18));
		KtC_out.setColumns(10);
		KtC_out.setBackground(new Color(174, 226, 247));
		KtC_out.setBounds(287, 369, 200, 30);
		contentPane_1_1_1.add(KtC_out);
		
		JButton btnKtC = new JButton("Calculate");
		btnKtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Kstr = KtC_in.getText();
				double K = Double.parseDouble(Kstr);
				
				double C = K-273.15;
				String Cstr = Double.toString(C);
				
				KtC_out.setText(Cstr);
			}
		});
		btnKtC.setForeground(Color.WHITE);
		btnKtC.setBackground(new Color(0, 0, 64));
		btnKtC.setBounds(248, 429, 100, 25);
		contentPane_1_1_1.add(btnKtC);
		
		JButton MainKtC = new JButton("Main Menu");
		MainKtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FirstPage.main(null);
			}
		});
		MainKtC.setForeground(Color.WHITE);
		MainKtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainKtC.setBackground(new Color(176, 98, 19));
		MainKtC.setBounds(446, 558, 150, 21);
		contentPane_1_1_1.add(MainKtC);
	}
}

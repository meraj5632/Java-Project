package Books;

import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class SecondPage {

	private JFrame frame;
	private JTextField txtBookName;
	private JTextField txtEdition;
	private JTextField txtPrice;
	private JTextField search;



	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage window = new SecondPage();
					window.frame.setVisible(true);
				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public SecondPage() {
		initialize();
		Connect();
		table_load();
	}
	

	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	private JTable table;
	
	public void Connect()
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_db","root", "");
		    System.out.println("Connected");
		}
	
		catch (ClassNotFoundException e){
			
			System.out.println(e);
		}
		
		catch (SQLException e2){
			
			System.out.println(e2);
		}
	}
	
	
	  public void table_load()
	    {
	    	try {
	    		
			    pst = con.prepareStatement("select * from book");
			    rs = pst.executeQuery();
			    table.setModel(DbUtils.resultSetToTableModel(rs));
	    	} 
	    	
	    	catch (SQLException e){
	    		
	    		System.out.println(e);
		  } 
	    }
	

	
	
	
	private void initialize() {	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(217, 177, 134));
		frame.setBounds(100, 100, 1192, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(86, 50, 50));
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(66, 122, 511, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtBookName = new JTextField();
		txtBookName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtBookName.setBackground(new Color(217, 177, 134));
		txtBookName.setBounds(172, 33, 270, 26);
		panel.add(txtBookName);
		txtBookName.setColumns(10);
		
		txtEdition = new JTextField();
		txtEdition.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEdition.setBackground(new Color(217, 177, 134));
		txtEdition.setColumns(10);
		txtEdition.setBounds(172, 95, 270, 26);
		panel.add(txtEdition);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPrice.setBackground(new Color(217, 177, 134));
		txtPrice.setColumns(10);
		txtPrice.setBounds(172, 158, 270, 26);
		panel.add(txtPrice);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name ");
		lblNewLabel_1.setForeground(new Color(217, 177, 134));
		lblNewLabel_1.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		lblNewLabel_1.setBounds(66, 34, 96, 20);
		panel.add(lblNewLabel_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(217, 177, 134));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bName = txtBookName.getText();
				String bEdition = txtEdition.getText();
				String bPrice = txtPrice.getText();
				
				
				try {
					
					pst = con.prepareStatement("INSERT INTO book (Name,Edition,Price)VALUES(?,?,?)");
					pst.setString(1, bName);
					pst.setString(2, bEdition);
					pst.setString(3, bPrice);
					
					pst.executeUpdate();
					
					
					JOptionPane.showMessageDialog(null, "Rerord Added!");
					
					table_load();
					          
					txtBookName.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					
					txtBookName.requestFocus();
					
				} catch (Exception e2) {
						
					System.out.println(e2);
				
				}
				
			}
		});
				
			
		btnSave.setFont(new Font("Arial", Font.BOLD, 15));
		btnSave.setBounds(32, 214, 87, 30);
		panel.add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(217, 177, 134));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
					
					String bname,edition,price,bid;
					
					
					bname = txtBookName.getText();
					edition = txtEdition.getText();
					price = txtPrice.getText();
					bid  = search.getText();
					
					 try {
							pst = con.prepareStatement("update book set Name= ?, Edition=?, Price=? where ID =?");
							pst.setString(1, bname);
				            pst.setString(2, edition);
				            pst.setString(3, price);
				            pst.setString(4, bid);
				           
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Updated!");
				            table_load();
				           
				            txtBookName.setText("");
				            txtEdition.setText("");
				            txtPrice.setText("");
				            search.requestFocus();
						}

			            catch (SQLException e1) {
							
							System.out.println(e1);
						}
				
				
			}
		});
		btnUpdate.setFont(new Font("Arial", Font.BOLD, 15));
		btnUpdate.setBounds(147, 214, 87, 30);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(217, 177, 134));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String bid;
				
				bid  = search.getText();
				
				 try {
						pst = con.prepareStatement("delete from book where id =?");
						
			            pst.setString(1, bid);
			            pst.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Record Deleted!");
			            table_load();
			           
			            txtBookName.setText("");
			            txtEdition.setText("");
			            txtPrice.setText("");
			            search.requestFocus();
					}

		            catch (SQLException e1) {
						
						e1.printStackTrace();
					}
			
				
			}
		});
		btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		btnDelete.setBounds(269, 214, 87, 30);
		panel.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(217, 177, 134));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				 	txtBookName.setText("");
		            txtEdition.setText("");
		            txtPrice.setText("");
			
			
			}
		});
		btnClear.setFont(new Font("Arial", Font.BOLD, 15));
		btnClear.setBounds(382, 214, 87, 30);
		panel.add(btnClear);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setForeground(new Color(217, 177, 134));
		lblNewLabel_1_1.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(66, 96, 96, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setForeground(new Color(217, 177, 134));
		lblNewLabel_1_1_1.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(66, 159, 96, 20);
		panel.add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(86, 50, 50));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(217, 177, 134)));
		panel_1.setBounds(66, 432, 414, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Book ID");
		lblNewLabel_1_3.setForeground(new Color(217, 177, 134));
		lblNewLabel_1_3.setBounds(24, 13, 87, 38);
		lblNewLabel_1_3.setFont(new Font("Dubai Medium", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_3);
		
		search = new JTextField();
		search.setFont(new Font("Tahoma", Font.BOLD, 16));
		search.setBackground(new Color(217, 177, 134));
		
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
					
					 try {
				          
				            String id = search.getText();

				            pst = con.prepareStatement("select Name, Edition, Price from book where ID = ?");
				            pst.setString(1, id);
				            ResultSet rs = pst.executeQuery();

				            if(rs.next()==true)
				            {
				              
				                String name = rs.getString(1);
				                String edition = rs.getString(2);
				                String price = rs.getString(3);
				                
				                txtBookName.setText(name);
				                txtEdition.setText(edition);
				                txtPrice.setText(price);
				                
				                
				            }
				            
				            else
				            {
				            	txtBookName.setText("");
				            	txtEdition.setText("");
				            	txtPrice.setText("");
				                 
				            }
				            
					 } 
					
					 catch (SQLException ex){
				           System.out.println(ex);
				        }					
				}
		});
		
		search.setBounds(121, 13, 253, 34);
		panel_1.add(search);
		search.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setForeground(new Color(217, 177, 134));
		btnNewButton_1.setBackground(new Color(86, 50, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(511, 459, 80, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JScrollPane Table = new JScrollPane();
		Table.setBounds(634, 55, 500, 410);
		frame.getContentPane().add(Table);
		
		table = new JTable();
		Table.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Light House");
		lblNewLabel.setForeground(new Color(86, 50, 50));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 65));
		lblNewLabel.setBounds(156, 22, 377, 90);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Use5r\\Desktop\\Book Shop Management 2\\Logo\\Main Logo.png"));
		lblNewLabel_3.setBounds(62, 10, 100, 100);
		frame.getContentPane().add(lblNewLabel_3);
	}
}

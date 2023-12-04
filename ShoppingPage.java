package FinalProject;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;



public class ShoppingPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField cashTextField;
	JLabel label1;
	JLabel label2;
	JLabel totalLabel;
	JButton button1;
	JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton payButton;
    JButton printButton;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JButton deleteButton;
 
    
    
	
	
	
	
	//private final Action action = new SwingAction();

	

	public static void main(String[] args) {
		

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDandPassword iDandPassword = new IDandPassword();
					ShoppingPage shop = new ShoppingPage(iDandPassword.getLoginInfo());
					shop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
	
	IDandPassword iDandPassword = new IDandPassword();
	 HashMap<String,String> logininfo = new  HashMap<String,String>();
	 
	public ShoppingPage(HashMap<String,String> loginInfoOriginal) {
		 logininfo = loginInfoOriginal;
		setTitle("Shop Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100 , 1464, 747);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 0, 710, 710);
		contentPane.add(panel);
		panel.setLayout(null);
		
		button1 = new JButton("");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(label1.getText());
				i++;
				label1.setText(String.valueOf(i));
				addTable(1,"ZMW combo", i,2.99);
			    calTotal();
			}
		});
		//button1.setAction(action);
		button1.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\1.jpg"));
		button1.setFocusable(false);
		button1.setBounds(10, 10, 196, 160);
		panel.add(button1);
		
		 button2 = new JButton("");
		 button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = Integer.valueOf(label2.getText());
					i++;
					label2.setText(String.valueOf(i));
					addTable(2,"1pc Combo", i,2.59);
				    calTotal();
				}
			});
		
		button2.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\2 (1).jpg"));
		button2.setBounds(254, 10, 196, 160);
		button2.setFocusable(false);
		panel.add(button2);
		
		button3 = new JButton("");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i = Integer.valueOf(label3.getText());
					i++;
					label3.setText(String.valueOf(i));
					addTable(3,"2pc Combo", i,3.99);
				    calTotal();
			}
		});
	
		button3.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\3.jpg"));
		button3.setBounds(502, 10, 196, 160);
		panel.add(button3);
		
		button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i = Integer.valueOf(label4.getText());
					i++;
					label4.setText(String.valueOf(i));
					addTable(4,"Dinner Set", i,6.99);
				    calTotal();
			}
		});
		
		button4.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\4.jpg"));
		button4.setBounds(10, 233, 196, 160);
		panel.add(button4);
		
		button5 = new JButton("");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i = Integer.valueOf(label5.getText());
					i++;
					label5.setText(String.valueOf(i));
					addTable(5,"Mini Set  ", i,4.99);
				    calTotal();
			}
		});
		
		button5.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\5.jpg"));
		button5.setBounds(254, 233, 196, 160);
		panel.add(button5);
		
		button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i = Integer.valueOf(label6.getText());
					i++;
					label6.setText(String.valueOf(i));
					addTable(6,"Colonel Burger", i,3.99);
				    calTotal();
			}
		});
		
		button6.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\6.jpg"));
		button6.setBounds(502, 233, 196, 160);
		panel.add(button6);
		
		button7 = new JButton("");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(label7.getText());
					i++;
					label7.setText(String.valueOf(i));
					addTable(7,"Zinger Burger", i,2.99);
				    calTotal();
			}
		});
		
		button7.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\7.jpg"));
		button7.setBounds(10, 460, 196, 160);
		panel.add(button7);
		
		button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(label8.getText());
				i++;
				label8.setText(String.valueOf(i));
				addTable(8,"Zinger Combo", i,5.59);
			    calTotal();
			}
		});
		
		button8.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\8.jpg"));
		button8.setBounds(254, 460, 196, 160);
		panel.add(button8);
		
		button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.valueOf(label9.getText());
				i++;
				label9.setText(String.valueOf(i));
				addTable(9,"1pc Rice Set", i,4.59);
			    calTotal();
			}
		});
		
		button9.setIcon(new ImageIcon("C:\\Users\\Windows\\Downloads\\10.jpg"));
		button9.setBounds(502, 460, 196, 160);
		panel.add(button9);
		
	    label1 = new JLabel("0");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setBounds(20, 171, 167, 35);
		panel.add(label1);
		
	    label2 = new JLabel("0");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label2.setBounds(278, 171, 167, 35);
		panel.add(label2);
		
	    label3 = new JLabel("0");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label3.setBounds(512, 171, 167, 35);
		panel.add(label3);
		
		label4 = new JLabel("0");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label4.setBounds(20, 403, 167, 35);
		panel.add(label4);
		
		label5 = new JLabel("0");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label5.setBounds(283, 403, 167, 35);
		panel.add(label5);
		
		label6 = new JLabel("0");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label6.setBounds(512, 403, 167, 35);
		panel.add(label6);
		
		label7 = new JLabel("0");
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label7.setBounds(20, 645, 167, 35);
		panel.add(label7);
		
		label8 = new JLabel("0");
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setFont(new Font("Tahoma", Font.BOLD, 20));
		label8.setBounds(283, 645, 167, 35);
		panel.add(label8);
		
		label9 = new JLabel("0");
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label9.setBounds(512, 645, 167, 35);
		panel.add(label9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(717, 10, 723, 495);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "ITEM", "QTY", "PRICE"},
			},
			new String[] {
				"", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, 10, 431, 425);
		panel_1.add(table);
		
	    deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //remove the whole row.
           	 DefaultTableModel dt = ( DefaultTableModel)table.getModel();
           	 
           	 String r = dt.getValueAt(table.getSelectedRow(),0).toString();
           	 
           	 int rw = table.getSelectedRow();
           	 dt.removeRow(rw);
           	 calTotal();
           	 
           	 
           	
           	 switch (r){
           	 case "1" : 
           		 label1.setText("0");
           		 break;
           	 case "2" : 
           		 label2.setText("0");
           		 break;
           	 case "3" : 
           		 label3.setText("0");
           		 break;
           	 case "4" : 
           		 label4.setText("0");
           		 break;
           	 case "5" : 
           		 label5.setText("0");
           		 break;
           	 case "6" : 
           		 label6.setText("0");
           		 break;
           	 case "7" : 
           		 label7.setText("0");
           		 break;
           	 case "8" : 
           		 label8.setText("0");
           		 break;
           	 case "9" : 
           		 label9.setText("0");
           		 break;
           		 
           		 default : 
           			 System.out.println("Over");
           		 } 
           	   }
				
			
			
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		deleteButton.setFocusable(false);
		
		deleteButton.setBounds(310, 441, 120, 32);
		panel_1.add(deleteButton);
		
		TextArea receipt = new TextArea();
		receipt.setBounds(448, 10, 265, 463);
		panel_1.add(receipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(730, 515, 686, 185);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
	 
		JLabel finalPrice = new JLabel("Total:");
		finalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		finalPrice.setFont(new Font("Tahoma", Font.BOLD, 25));
		finalPrice.setBounds(10, 10, 140, 44);
		panel_3.add(finalPrice);
		
		JLabel lblNewLabel_7_1 = new JLabel("Cash:");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7_1.setBounds(10, 72, 140, 44);
		panel_3.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Balance:");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7_2.setBounds(10, 126, 140, 44);
		panel_3.add(lblNewLabel_7_2);
		
	    totalLabel = new JLabel("0.00");
		totalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		totalLabel.setBounds(170, 10, 109, 44);
		panel_3.add(totalLabel);
		
		JLabel balanceLabel = new JLabel("0.00");
		balanceLabel.setHorizontalAlignment(SwingConstants.LEFT);
		balanceLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		balanceLabel.setBounds(170, 126, 109, 44);
		panel_3.add(balanceLabel);
		
		cashTextField = new JTextField();
		cashTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		cashTextField.setBounds(162, 72, 117, 33);
		panel_3.add(cashTextField);
		cashTextField.setColumns(10);
		
		payButton = new JButton("PAY");
		payButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				 
				
				double tot = Double.valueOf(totalLabel.getText());
				double paid = Double.valueOf(cashTextField.getText());
				double balance = paid- tot;
				
				DecimalFormat df = new DecimalFormat("#.##");
				balanceLabel.setText(String.valueOf(df.format(balance)));
				
				
				
				
				
			}
			
		});
		payButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		payButton.setBounds(310, 10, 165, 161);
		payButton.setFocusable(false);
		panel_3.add(payButton);
		
		 printButton = new JButton("PRINT");
		printButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			       
				try {
				 receipt.setText("          American University of Phnom Penh\n");
				 receipt.setText(receipt.getText() +"                         Java Final Project\n");
				 receipt.setText(receipt.getText() +"                         www.aupp.edu.kh\n");
				 receipt.setText(receipt.getText() +"                             Cambodia\n");
				 receipt.setText(receipt.getText() +"-------------------------------------------------------------\n");
				 receipt.setText(receipt.getText() +"  Item \t\tQty \tPrice" + "\n"); 
				 receipt.setText(receipt.getText() +"-------------------------------------------------------------\n");
				 DefaultTableModel df = (DefaultTableModel)table.getModel();
				 
				 for(int i=1; i<table.getRowCount(); i++) {
					 
					 String Name = df.getValueAt(i,1).toString();
					 String Qty = df.getValueAt(i,2).toString();
					 String Price = df.getValueAt(i,3).toString();
					 
					 receipt.setText(receipt.getText()+ "  " + Name + "\t"+ Qty +"\t"+ Price + "\n");
					 
				 }
				 receipt.setText(receipt.getText()+ "-------------------------------------------------------------\n");
				 receipt.setText(receipt.getText()+ "  Sub Total: $" + totalLabel.getText()+ "\n");
				 receipt.setText(receipt.getText()+ "  Cash     : $" + cashTextField.getText()+ "\n");
				 receipt.setText(receipt.getText()+ "  Balance  : $" + balanceLabel.getText()+ "\n");
				 receipt.setText(receipt.getText()+ "-------------------------------------------------------------\n");
				 receipt.setText(receipt.getText()+ "  Thank you for shopping with us " + "\n");
				 receipt.setText(receipt.getText()+ "-------------------------------------------------------------\n");
				 receipt.setText(receipt.getText()+ "  Software by Visal\n");
				 
				 receipt.print(getGraphics());
				 
				} catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
			
		});
		printButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		printButton.setFocusable(false);
		printButton.setBounds(500, 10, 165, 161);
		panel_3.add(printButton);
	}
	
	
	public void calTotal( ){
		
		int numOfRow = table.getRowCount();
		double tot= 0.0;
		for(int i=0; i<numOfRow; i++) {
			Object cellValue = table.getValueAt(i, 3);
			if(cellValue != null) {
				try {
					double value = Double.parseDouble(cellValue.toString());
		            tot += value;
				} catch (NumberFormatException e){}
					
				
			}
			
		}
		
		
		
		
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		totalLabel.setText(df.format(tot));
		
	}
	
	


public void addTable(int ID, String ITEM, int QTY, Double PRICE ) {
	
	  DefaultTableModel dt = ( DefaultTableModel) table.getModel();
	  
	  
	DecimalFormat df = new DecimalFormat("00.00");
	Double totalPrice = PRICE*Double.valueOf(QTY);
	String TotalPrice = df.format(totalPrice);
	
	  for(int  row=0; row<table.getRowCount(); row++) {
		  if(ITEM.equals(table.getValueAt(row,1))) {
			  dt.removeRow(table.convertRowIndexToModel(row));
			  break;
		  }
	  }
	  
	  Vector v = new Vector();
	  
	  v.add(ID);
	  v.add(ITEM);
	  v.add(QTY);
	  v.add(TotalPrice);
	  
	  dt.addRow(v);
	  
	 
	  
    }
	}



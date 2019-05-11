import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Restaurents {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=572,-1
	 */
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField vegbrg;
	private JTextField cheesebrg;
	private JTextField brgmeal;
	private JTextField drink;
	private JTextField ccfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurents window = new Restaurents();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurents() {
		initialize();
	}

//=============================Initialize the contents of the frame.===============================
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1372, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel.setBounds(31, 94, 561, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Veggie Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 25, 213, 29);
		panel.add(lblNewLabel_1);
		
		vegbrg = new JTextField();
		vegbrg.setHorizontalAlignment(SwingConstants.TRAILING);
		vegbrg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vegbrg.setBounds(314, 25, 190, 29);
		panel.add(vegbrg);
		vegbrg.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cheese Burger");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(43, 76, 213, 29);
		panel.add(lblNewLabel_2);
		
		cheesebrg = new JTextField();
		cheesebrg.setHorizontalAlignment(SwingConstants.TRAILING);
		cheesebrg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cheesebrg.setBounds(314, 76, 190, 29);
		panel.add(cheesebrg);
		cheesebrg.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Veggie Burger Meal");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(43, 127, 213, 29);
		panel.add(lblNewLabel_3);
		
		brgmeal = new JTextField();
		brgmeal.setHorizontalAlignment(SwingConstants.TRAILING);
		brgmeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		brgmeal.setBounds(314, 127, 190, 29);
		panel.add(brgmeal);
		brgmeal.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Drink");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(43, 170, 213, 29);
		panel.add(lblNewLabel_7);
		
		JCheckBox home = new JCheckBox("Home Delivery");
		home.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.setBounds(38, 246, 218, 32);
		panel.add(home);
		
		JCheckBox tax = new JCheckBox("Tax");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tax.setBounds(314, 251, 190, 27);
		panel.add(tax);
		
		JLabel lblNewLabel_8 = new JLabel("QTY");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(316, 170, 188, 29);
		panel.add(lblNewLabel_8);
		
		drink = new JTextField();
		drink.setText(" ");
		drink.setHorizontalAlignment(SwingConstants.TRAILING);
		drink.setFont(new Font("Tahoma", Font.PLAIN, 20));
		drink.setColumns(10);
		drink.setBounds(314, 210, 190, 29);
		panel.add(drink);
		
		JComboBox selectdrink = new JComboBox();
		selectdrink.setForeground(Color.BLACK);
		selectdrink.setFont(new Font("Tahoma", Font.PLAIN, 14));
		selectdrink.setBackground(SystemColor.controlHighlight);
		selectdrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange Juice"}));
		selectdrink.setBounds(43, 210, 213, 29);
		panel.add(selectdrink);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 167, 541, 6);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_1.setBounds(31, 394, 561, 173);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Cost Of Drinks ");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(43, 22, 213, 29);
		panel_1.add(label);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfMeal.setBounds(43, 72, 213, 29);
		panel_1.add(lblCostOfMeal);
		
		JLabel label_2 = new JLabel("Cost Of Delivery");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(43, 122, 213, 29);
		panel_1.add(label_2);
		
		JLabel costdrink = new JLabel(" ");
		costdrink.setHorizontalAlignment(SwingConstants.RIGHT);
		costdrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		costdrink.setBounds(314, 22, 187, 29);
		costdrink.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel_1.add(costdrink);
		
		JLabel costmeal = new JLabel(" ");
		costmeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		costmeal.setHorizontalAlignment(SwingConstants.RIGHT);
		costmeal.setBackground(Color.YELLOW);
		costmeal.setBounds(314, 72, 187, 29);
		costmeal.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel_1.add(costmeal);
		
		JLabel costdelivery = new JLabel(" ");
		costdelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		costdelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		costdelivery.setBounds(314, 122, 187, 29);
		costdelivery.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel_1.add(costdelivery);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_2.setBounds(602, 94, 361, 291);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox ccbox = new JComboBox();
		ccbox.setModel(new DefaultComboBoxModel(new String[] {"Choose One ....", "USA", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "Philippine"}));
		ccbox.setForeground(Color.BLACK);
		ccbox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ccbox.setBackground(SystemColor.controlHighlight);
		ccbox.setBounds(46, 78, 252, 29);
		panel_2.add(ccbox);
		
		ccfield = new JTextField();
		ccfield.setHorizontalAlignment(SwingConstants.TRAILING);
		ccfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ccfield.setColumns(10);
		ccfield.setBounds(46, 128, 252, 31);
		panel_2.add(ccfield);
		
		JLabel cclabel = new JLabel(" ");
		cclabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cclabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		cclabel.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		cclabel.setBounds(46, 176, 252, 29);
		panel_2.add(cclabel);
		
//=============================== CURRENCY CONVERSION =======================================================================	
		
		JButton btnconvert = new JButton("Convert");
		btnconvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double currency = Double.parseDouble(ccfield.getText());
				double us = 0.015*currency;
				double canada = 0.019*currency;
				double brazil = 0.03*currency;
				double nigeria = 5.34*currency;
				double pp = 0.79*currency;
				double indo = 206.63*currency;
				double kenya = 1.5*currency;
				
				if(ccbox.getSelectedItem().equals("USA"))
				{
					String cc1 = String.format("$ %.2f", us);
					cclabel.setText(cc1);;
				}
				if(ccbox.getSelectedItem().equals("Nigeria"))
				{
					String cc2 = String.format("N %.2f", nigeria);
					cclabel.setText(cc2);;
				}
				if(ccbox.getSelectedItem().equals("Kenya"))
				{
					String cc3 = String.format("KS %.2f", kenya);
					cclabel.setText(cc3);;
				}
				if(ccbox.getSelectedItem().equals("Canada"))
				{
					String cc4 = String.format("C$ %.2f", canada);
					cclabel.setText(cc4);;
				}
				if(ccbox.getSelectedItem().equals("Brazil"))
				{
					String cc6 = String.format("BRA %.2f", brazil);
					cclabel.setText(cc6);;
				}
				if(ccbox.getSelectedItem().equals("Indonesia"))
				{
					String cc7 = String.format("IDR %.2f", indo);
					cclabel.setText(cc7);;
				}
				if(ccbox.getSelectedItem().equals("Philippine"))
				{
					String cc8 = String.format("PHP %.2f", pp);
					cclabel.setText(cc8);;
				}
			}
		});
		btnconvert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnconvert.setBounds(46, 233, 114, 29);
		panel_2.add(btnconvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cclabel.setText(null);
				ccbox.setSelectedItem("Choose One ....");
				ccfield.setText(null);
				
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClose.setBounds(195, 233, 103, 29);
		panel_2.add(btnClose);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurrencyConverter.setBounds(46, 26, 252, 41);
		panel_2.add(lblCurrencyConverter);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_3.setBounds(602, 394, 361, 173);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_1 = new JLabel("Tax ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(22, 21, 125, 29);
		panel_3.add(label_1);
		
		JLabel label_3 = new JLabel("Sub Total");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(22, 71, 125, 29);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Total");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(22, 121, 125, 29);
		panel_3.add(label_4);
		
		JLabel lbtax = new JLabel(" ");
		lbtax.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtax.setHorizontalAlignment(SwingConstants.RIGHT);
		lbtax.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lbtax.setBounds(184, 21, 155, 29);
		panel_3.add(lbtax);
		
		JLabel lbsubtotal = new JLabel(" ");
		lbsubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbsubtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbsubtotal.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lbsubtotal.setBounds(184, 71, 155, 29);
		panel_3.add(lbsubtotal);
		
		JLabel lbtotal = new JLabel(" ");
		lbtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbtotal.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lbtotal.setBounds(184, 121, 155, 29);
		panel_3.add(lbtotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(799, 94, 10, 10);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_5.setBounds(973, 92, 353, 475);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 29, 326, 435);
		panel_5.add(tabbedPane_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 203, -13);
		panel_7.add(textPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		textArea.setBounds(10, 11, 301, 385);
		panel_7.add(textArea);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_6.setBounds(30, 578, 1297, 102);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent arg0) {
				  
//====================== GET INPUT OF FOOD ITEMS ================================================================				  
				
				double veggie = Double.parseDouble(vegbrg.getText());
				double iveggie = 30.50;
				double burger;
				burger = (veggie * iveggie);
				String pmeal = String.format("%.2f", burger);
				costmeal.setText(pmeal);
				
				double veggie1 = Double.parseDouble(cheesebrg.getText());
				double iveggie1 = 40.50;
				double cheeseburger;
				cheeseburger = (veggie1 * iveggie1);
				String cmeal = String.format("%.2f", cheeseburger + burger);
				costmeal.setText(cmeal);
				
				double veggie2 = Double.parseDouble(brgmeal.getText());
				double iveggie2 = 99.90;
				double burgermeal ;
				burgermeal = (veggie2 * iveggie2);
				String mmeal = String.format("%.2f", burgermeal + cheeseburger + burger );
				costmeal.setText(mmeal);
//---------------------------------------------- Home Delivery ------------------------------------------------------------	
				double idelivery = 30;
				if(home.isSelected())
				{
					String pdelivery = String.format("%.2f", idelivery);
					costdelivery.setText(pdelivery);
				}
				else
				{
					costdelivery.setText("0");
				}
//---------------------------------------------- Drinks -------------------------------------------------------------------
				
				double drinks = Double.parseDouble(drink.getText());
				double tea = 25*drinks;
				double icetea = 40*drinks;
				double coffe = 25*drinks;
				double icecoffe = 40*drinks;
				double cola = 35*drinks;
				double coke = 35*drinks;
				double orange = 40*drinks;
				double aplejuice = 40*drinks;
				
						if(selectdrink.getSelectedItem().equals("Apple Juice"))
						{
							String capple = String.format("%.2f", aplejuice);
							costdrink.setText(capple);;
						}
						
						if(selectdrink.getSelectedItem().equals("Tea"))
						{
							String c1 = String.format("%.2f", tea);
							costdrink.setText(c1);
						}
						
						if(selectdrink.getSelectedItem().equals("Ice Tea"))
						{
							String c2 = String.format("%.2f", icetea);
							costdrink.setText(c2);
						}
						
						if(selectdrink.getSelectedItem().equals("Coffee"))
						{
							String c3 = String.format("%.2f", coffe);
							costdrink.setText(c3);
						}
						
						if(selectdrink.getSelectedItem().equals("Ice Coffee"))
						{
							String c4 = String.format("%.2f", icecoffe);
							costdrink.setText(c4);
						}
						
						if(selectdrink.getSelectedItem().equals("Cola"))
						{
							String c5 = String.format("%.2f", cola);
							costdrink.setText(c5);
						}
						
						if(selectdrink.getSelectedItem().equals("Coke"))
						{
							String c6 = String.format("%.2f", coke);
							costdrink.setText(c6);
						}
						
						if(selectdrink.getSelectedItem().equals("Orange Juive"))
						{
							String c7 = String.format("%.2f", orange);
							costdrink.setText(c7);
						}
						if(selectdrink.getSelectedItem().equals("Select a Drink"))
						{
							costdrink.setText("0");
						}
					
//---------------------------------------------- Tax -------------------------------------------------------------------
						
						double ctotal1 = Double.parseDouble(costdrink.getText());
						double ctotal2 = Double.parseDouble(costmeal.getText());
						double ctotal3 = Double.parseDouble(costdelivery.getText());
						double alltotal = (ctotal1 + ctotal2 + ctotal3)/100;
						
						if(tax.isSelected())
						{
							String itotal = String.format("%.2f", alltotal);
							lbtax.setText(itotal);
						}
						else
						{
							lbtax.setText("0");
						}
					
//---------------------------------------------- Total -------------------------------------------------------------------
				
						double ctotal4 = Double.parseDouble(lbtax.getText());
						
						double subtotal = (ctotal1 + ctotal2 + ctotal3);
						String isubtotal = String.format("Rs. %.2f", subtotal);
						lbsubtotal.setText(isubtotal);
						
						double alltotal1 = (ctotal1 + ctotal2 + ctotal3 + ctotal4);
						String itotal = String.format("Rs. %.2f", alltotal1);
						lbtotal.setText(itotal);
						
						String itaxtotal = String.format("Rs. %.2f", ctotal4);
						lbtax.setText(itaxtotal);
						
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(240, 32, 133, 37);
		panel_6.add(btnTotal);
		
//---------------------------------------------- RECEIPT -------------------------------------------------------------------		
		
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double qty1 = Double.parseDouble(vegbrg.getText());
				double qty2 = Double.parseDouble(cheesebrg.getText());
				double qty3 = Double.parseDouble(brgmeal.getText());
				double qty4 = Double.parseDouble(drink.getText());
						      
	textArea.append("\t\n BURGER HUT RECEIPT \n\n" +
	"========================================================"
		+	"\t\nITEMS  	  " +" Qty\n" + 
			"\nVeggie Burger    : "+ qty1  + 
			"\nCheese Burger    : "+ qty2  + 
			"\nBurger meal       : "+ qty3  + 
			"\nDrinks                 : "+ qty4  + "\n\n" +
			
	"========================================================"+
	
	"\n\nTHANKS FOR YOUR KIND VISIT !");
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReceipt.setBounds(466, 32, 133, 37);
		panel_6.add(btnReceipt);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vegbrg.setText(null);
				cheesebrg.setText(null);
				brgmeal.setText(null);
				drink.setText(null);
				selectdrink.setSelectedItem("Select a Drink");
				costdrink.setText(null);
				costmeal.setText(null);
				costdelivery.setText(null);
				ccbox.setSelectedItem("Choose One ....");
				ccfield.setText(null);
				cclabel.setText(null);
				lbtax.setText(null);
				lbsubtotal.setText(null);
				lbtotal.setText(null);
				textArea.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(705, 32, 133, 37);
		panel_6.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(943, 32, 133, 37);
		panel_6.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("BURGER HUT MANAGEMENT SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 60));
		lblNewLabel.setBounds(21, 29, 1314, 52);
		frame.getContentPane().add(lblNewLabel);
	}
}

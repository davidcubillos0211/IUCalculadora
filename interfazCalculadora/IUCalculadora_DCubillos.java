package interfazCalculadora;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class IUCalculadora_DCubillos {

	private JFrame frame;
	private JTextField textField;
	boolean suma= false , 
			resta = false, 
			division= false,
			erase= false,
			multiplicacion = false;
	
	Calculadora calc = new Calculadora ();
	double primero , segundo ; 
	public void setFalse () {
				suma= false ; 
				resta = false; 			
				division= false;
				multiplicacion = false;
				
	}
	public boolean libre () {// dice si la calculadora tiene ya una operacion pendiente
		return !(suma || resta || division || multiplicacion) ;
}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUCalculadora_DCubillos window = new IUCalculadora_DCubillos();
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
	public IUCalculadora_DCubillos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(100, 100, 307, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textField.setForeground(new Color(230, 230, 250));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(26, 6, 264, 73);
		textField.setBackground(new Color(119, 136, 153));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setBounds(26, 152, 53, 49);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = textField.getText()+ btnNewButton.getText();
				if (erase) { textField.setText(null);
							 erase= false;}
				textField.setText(numero);
				}
			
			});
	
		
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(95, 152, 53, 49);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_1.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setBounds(160, 152, 53, 49);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_2.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(105, 105, 105));
		btnNewButton_3.setBounds(26, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_3.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(105, 105, 105));
		btnNewButton_4.setBounds(95, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_4.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(new Color(105, 105, 105));
		btnNewButton_5.setBounds(160, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_5.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBackground(new Color(105, 105, 105));
		btnNewButton_6.setBounds(26, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_6.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBackground(new Color(105, 105, 105));
		btnNewButton_7.setBounds(95, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_7.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBackground(new Color(105, 105, 105));
		btnNewButton_8.setBounds(160, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_8.getText();
				textField.setText(numero);}
			});
		
		
		JButton btnNewButton_6_1 = new JButton(".");
		btnNewButton_6_1.setBackground(new Color(105, 105, 105));
		btnNewButton_6_1.setBounds(26, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_6_1);
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = textField.getText()+ btnNewButton_6_1.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_7_1 = new JButton("0");
		btnNewButton_7_1.setBackground(new Color(105, 105, 105));
		btnNewButton_7_1.setBounds(95, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_7_1);
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_7_1.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_8_1 = new JButton("=");
		btnNewButton_8_1.setBackground(new Color(105, 105, 105));
		btnNewButton_8_1.setBounds(160, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_8_1);
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				try {
				segundo= Double.parseDouble(textField.getText());
				} catch (NumberFormatException exc) {
					textField.setText(null);
					setFalse();
					
				} String dev="";
				double lolo=0;
			
				try {
					if (suma) {
						lolo=calc.suma(segundo, primero);
						
					}if (multiplicacion) {
						lolo=calc.mult(primero, segundo);
	
						
					}if (resta) {
						lolo=calc.resta(primero, segundo);
						
					}if (division) {
						lolo=calc.divide(primero, segundo);
						
					}
					
				}catch (ArithmeticException aae) {
					dev= aae.getMessage();
					erase = true ; 
				}
				setFalse();
				if (lolo!=0) {
					
					dev= ""+lolo;
				}
				if (dev.length()>0)textField.setText(dev);
			
				;}
			});
		
		
		
		JButton btnNewButton_12 = new JButton("←");
		btnNewButton_12.setBackground(new Color(0, 0, 0));
		btnNewButton_12.setBounds(26, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				 int largo = textField.getText().length()-1;
		if (largo>=0 ){
		textField.setText(textField.getText().substring(0,largo));
				}
		}
			});
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1_1.setBounds(95, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = textField.getText()+ btnNewButton_1_1.getText();
				textField.setText(null);}
			});
		
		JButton btnNewButton_2_1 = new JButton("00");
		btnNewButton_2_1.setBackground(new Color(105, 105, 105));
		btnNewButton_2_1.setBounds(160, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (erase) { textField.setText(null);
				 erase= false;}
				String numero = textField.getText()+ btnNewButton_2_1.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_9_1 = new JButton("+");
		btnNewButton_9_1.setBackground(new Color(105, 105, 105));
		btnNewButton_9_1.setBounds(227, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_9_1);
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicionBooll= true; 
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					suma=true;
					primero= Double.parseDouble(textField.getText());
					
					textField.setText(null);
				}
				;}
			});
		JButton btnNewButton_11_1 = new JButton("Fact");
		btnNewButton_11_1.setBackground(new Color(105, 105, 105));
		btnNewButton_11_1.setBounds(225, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_11_1);
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				boolean condicionBooll= true; 
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre() && condicionBooll ) {
					
					
					primero= Double.parseDouble(textField.getText());
					String numero = textField.getText()+ btnNewButton_7_1.getText();

					try {
						primero= calc.fact((int)primero);
						numero= ""+primero;
						
					}catch (ArithmeticException lo) {
						numero = lo.getMessage();
						erase=true;
					}
					
					textField.setText(numero);
				};}
			});
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setBackground(new Color(105, 105, 105));
		btnNewButton_9.setBounds(227, 152, 53, 49);
		frame.getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicionBooll= true; 
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					resta=true;
					primero= Double.parseDouble(textField.getText());
					
					textField.setText(null);
				};}
			});
		
		JButton btnNewButton_10 = new JButton("X");
		btnNewButton_10.setBackground(new Color(105, 105, 105));
		btnNewButton_10.setBounds(225, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicionBooll= true; 
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre() && condicionBooll ) {
					multiplicacion=true;
					primero= Double.parseDouble(textField.getText());
					
					textField.setText(null);
				};}
			});
		
		JButton btnNewButton_11 = new JButton("÷");
		btnNewButton_11.setBackground(new Color(105, 105, 105));
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_11.setBounds(225, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicionBooll= true; 
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					division=true;
					primero= Double.parseDouble(textField.getText());
					
					textField.setText(null);
				};}
			});
	}
}

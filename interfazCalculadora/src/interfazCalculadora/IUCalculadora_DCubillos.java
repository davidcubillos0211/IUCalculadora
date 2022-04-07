package interfazCalculadora;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class IUCalculadora_DCubillos {

	private JFrame frame;
	
	private JTextField textField;
	boolean suma= false , 
			resta = false, 
			division= false,
			erase= false,
			multiplicacion = false;
	
	
	Calculadora calc = new Calculadora (); 
	
	double primero , segundo , resultmultilplic=-1; 
	
	public void setFalse () {
		
				suma= false ; 
				resta = false; 			
				division= false;
				multiplicacion = false;
				
	}
	
	public boolean libre () {// dice si la calculadora tiene ya una operacion pendiente
		return !(suma || resta || division || multiplicacion) ;//si hay uno activo, dara que no esta libre (false)
	}
	public void borrando() {
		if (erase) { textField.setText(null);
		 erase= false;}
	}
	
	public String devuelveSinDec(String cadena) {
		// vamos a comprobar que el numero tiene al final de su cadena ".00000[..]000"
		
		
		String gettext=textField.getText(),
				muchotexto="", 
				auxuiliar="",
				dev="";
		
		
		if (gettext.indexOf(".")!=-1) {
			muchotexto=gettext.substring(gettext.indexOf("."));
			
		} 
		
		
		for (int j = 0 ; j<muchotexto.length();j+=1 ) {
			auxuiliar+="0";
		}
		
		
		boolean condicionBooll= true
				, condiciona= gettext.charAt(gettext.length()-1)== (".".charAt(0))
				// que temga en la ultima posicion el punto
				,condicinob=   muchotexto ==auxuiliar;
				// que tenga puento y
		if (condiciona&& gettext.length()>1) {
			// DEVEULEVE 
			
		} if (condicinob &&   gettext.length()>1) {
			
			dev= gettext.substring(0, (gettext.length()-muchotexto.length()-2) );

		}
		return dev;
				
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
	
	private void funcionOperar() {
		
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
				if (resultmultilplic==0) {
					lolo=0;
					resultmultilplic=-1;
				}
				
				
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
			
			dev=""+lolo;
		}
		if (dev.length()>0)textField.setText(dev);
	
		
		
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				//frame.getContentPane().add(progressBar);
		
		
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(100, 100, 372, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textField.setForeground(new Color(230, 230, 250));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 360, 73);
		textField.setBackground(new Color(119, 136, 153));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setBounds(26, 152, 53, 49);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();
				String numero = textField.getText()+ btnNewButton.getText();
				
				textField.setText(numero);
				}
			
			});
	
		JRadioButton sumabttn = new JRadioButton("Suma");
		sumabttn.setBackground(Color.DARK_GRAY);
		sumabttn.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		sumabttn.setForeground(new Color(255, 255, 255));
		sumabttn.setBounds(292, 102, 112, 23);
		frame.getContentPane().add(sumabttn);
		
	
		JRadioButton restabttn = new JRadioButton("Resta ");
		restabttn.setBackground(Color.DARK_GRAY);
		restabttn.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		restabttn.setForeground(new Color(255, 255, 255));
		restabttn.setBounds(292, 163, 141, 23);
		frame.getContentPane().add(restabttn);
		
		JRadioButton multiplicacionbttn = new JRadioButton("Mult");
		multiplicacionbttn.setBackground(Color.DARK_GRAY);
		multiplicacionbttn.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		multiplicacionbttn.setForeground(new Color(255, 255, 255));
		multiplicacionbttn.setBounds(290, 224, 141, 23);
		frame.getContentPane().add(multiplicacionbttn);
		
		JRadioButton divisionbttn = new JRadioButton("Div");
		divisionbttn.setBackground(Color.DARK_GRAY);
		divisionbttn.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		divisionbttn.setForeground(new Color(255, 255, 255));
		divisionbttn.setBounds(290, 285, 141, 23);
		frame.getContentPane().add(divisionbttn);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(95, 152, 53, 49);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_1.getText();
				textField.setText(numero);}
			});
		
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setBounds(160, 152, 53, 49);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_2.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(105, 105, 105));
		btnNewButton_3.setBounds(26, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_3.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(105, 105, 105));
		btnNewButton_4.setBounds(95, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_4.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(new Color(105, 105, 105));
		btnNewButton_5.setBounds(160, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_5.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBackground(new Color(105, 105, 105));
		btnNewButton_6.setBounds(26, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_6.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBackground(new Color(105, 105, 105));
		btnNewButton_7.setBounds(95, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_7.getText();
				textField.setText(numero);}
			});
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBackground(new Color(105, 105, 105));
		btnNewButton_8.setBounds(160, 274, 53, 49);
		frame.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_8.getText();
				textField.setText(numero);}
			});
		
		
		JButton btnNewButton_6_1 = new JButton(".");
		btnNewButton_6_1.setBackground(new Color(105, 105, 105));
		btnNewButton_6_1.setBounds(26, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_6_1);
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				// no se puede pulsar mas de una vez sin un action listener activado entre medias
				String numero = textField.getText();
				if (!numero.contains(".")){
				 numero = textField.getText()+ btnNewButton_6_1.getText();
				textField.setText(numero);
				
				}
			}
			});
		
		JButton btnNewButton_7_1 = new JButton("0");
		btnNewButton_7_1.setBackground(new Color(105, 105, 105));
		btnNewButton_7_1.setBounds(95, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_7_1);
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				String numero = textField.getText()+ btnNewButton_7_1.getText();
				textField.setText(numero);}
			});
		
		
		JButton btnNewButton_8_1 = new JButton("=");
		btnNewButton_8_1.setBackground(new Color(105, 105, 105));
		btnNewButton_8_1.setBounds(77, 396, 153, 49);
		frame.getContentPane().add(btnNewButton_8_1);
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (!libre()&& !textField.getText().isEmpty()){
				funcionOperar();
				
				sumabttn.setSelected(suma);
				restabttn.setSelected(resta);
				multiplicacionbttn.setSelected(multiplicacion);
				divisionbttn.setSelected(division);
				
			}
	}
			});
		
		
		
		JButton btnNewButton_12 = new JButton("←");
		btnNewButton_12.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_12.setForeground(new Color(139, 0, 0));
		btnNewButton_12.setBackground(Color.GRAY);
		btnNewButton_12.setBounds(26, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

				 int largo = textField.getText().length()-1;
		if (largo>=0 ){
			
		textField.setText(textField.getText().substring(0,largo));
		
				}
		}
			});
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setBounds(95, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = textField.getText()+ btnNewButton_1_1.getText();
				textField.setText(null);
				}
			});
		
		JButton btnNewButton_2_1 = new JButton("00");
		btnNewButton_2_1.setBackground(new Color(105, 105, 105));
		btnNewButton_2_1.setBounds(160, 91, 53, 49);
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrando();

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
				funcionOperar();
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					suma=true;
					sumabttn.setSelected(suma);
					primero= Double.parseDouble(textField.getText());
					
					textField.setText(null);
				}
				;}
			});
		JButton btnNewButton_11_1 = new JButton("Fact");
		btnNewButton_11_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnNewButton_11_1.setBackground(new Color(105, 105, 105));
		btnNewButton_11_1.setBounds(225, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_11_1);
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				funcionOperar();
				boolean condicionBooll= true; 
				double doble= 0.1;
				
				try {
					doble=Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
					
					
				}
				
				if(doble!=Math.round(doble)) {// no es entero
					// si no es entero, no se opera
					textField.setText("El numero debe ser entero");
					condicionBooll=false;
					erase=true;
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
			if (textField.getText().isEmpty()) {
				textField.setText("-");
			}
				else {
					funcionOperar();
			
				boolean condicionBooll= true; 
				if (textField.getText()==null) {
					textField.setText("-");
					
				}
				else {
					
				
				
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					resta=true;
					restabttn.setSelected(resta);
					primero= Double.parseDouble(textField.getText());
					textField.setText(null);
				};}
				
			}
			}});
		
		JButton btnNewButton_10 = new JButton("X");
		btnNewButton_10.setBackground(new Color(105, 105, 105));
		btnNewButton_10.setBounds(225, 213, 53, 49);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean condicionBooll= true; 
				funcionOperar();
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre() && condicionBooll ) {
					multiplicacion=true;
					multiplicacionbttn.setSelected(multiplicacion)  ;
					primero= Double.parseDouble(textField.getText());
					if (primero==0) {
						primero = 0 ; 
						resultmultilplic=0;
					}
					
					
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
				funcionOperar();
				try {
					Double.parseDouble(textField.getText());
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					
				}
				
				if (libre()&& condicionBooll ) {
					division=true;
					divisionbttn.setSelected(division);
					primero= Double.parseDouble(textField.getText());
					textField.setText(null);
				};}
			});
		

		JButton btnNewButton_8_2 = new JButton("primo");
		btnNewButton_8_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton_8_2.setBackground(new Color(105, 105, 105));
		btnNewButton_8_2.setBounds(160, 335, 53, 49);
		frame.getContentPane().add(btnNewButton_8_2);
		
		

		
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					
				if (libre()&& !textField.getText().isEmpty()) {
					funcionOperar();
					sumabttn.setSelected(suma);
					restabttn.setSelected(resta);
					multiplicacionbttn.setSelected(multiplicacion);
					divisionbttn.setSelected(division);
					
				String gettext=textField.getText(),
						
						part1="" , 
						part2="";
				boolean condicionBooll= true //condiciones que permiten el curse de esprimo()
						, condiciona=false
						// que ytemga en la ultima posicion el punto- para ello deben haber al menos dos caracteres. (length mayor que uno)
						,condicinob=false; 
						// que sean todo ceros  en la parte decimas
				if (gettext.length()>1) {// par
					condiciona=gettext.charAt(gettext.length()-1)== '.';
				}
				
				
				// hacer un paerse a doouble y si es igual a su redondeo usalo 
				
				
				Double doble = Double.parseDouble(textField.getText());
				// parsea a souble 
				
				int entero= (int) Math.round(doble);
				
				// ropun 
				if (entero==doble) {
					// entonces  si son iguales continuamos 
					
					//else, el numero no nos vale 
					// en tal caso sigue para alante con el p
				
					condicinob=true;
					if (gettext.contains(".")) {
					part1= gettext.substring(0,gettext.indexOf("."));
					}else {
						part1= gettext;
					}
				}
				// comparacion 
				try {
						Integer.parseInt(part1);
						
					
				}catch (NumberFormatException exc) {
					condicionBooll= false;
					textField.setText("no se puede convertir a entero");
				}
				boolean esprimo;
				if (libre() && condicionBooll &&  condicinob) {// la parte decimal es cero (part2)
					
					
						 esprimo=calc.esPrimo(Integer.parseInt(part1));
					
					if (esprimo) {textField.setText("Es primo");}
					else {textField.setText("No es primo");}
					
				}
				erase= true;
					}
			
			}
			
		}
				
			);
		
		
	
	
}
}

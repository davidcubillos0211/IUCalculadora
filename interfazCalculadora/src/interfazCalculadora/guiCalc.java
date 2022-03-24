package interfazCalculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JSplitPane;
import javax.swing.JButton;

public class guiCalc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiCalc window = new guiCalc();
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
	public guiCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 339, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(32, 98, 53, 49);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn5 = new JButton("0");
		btn5.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent arg0) {
		String number=textField.getText()+btn5.getText();
		textField.setText(number);
			}
		});
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(101, 98, 53, 49);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(176, 98, 53, 49);
		frame.getContentPane().add(btn9);
		
		JButton btnNewButton_11 = new JButton("c");
		btnNewButton_11.setBounds(241, 98, 53, 49);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_6_1 = new JButton("4");
		btnNewButton_6_1.setBounds(32, 173, 53, 49);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_7_1 = new JButton("5");
		btnNewButton_7_1.setBounds(101, 173, 53, 49);
		frame.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("6");
		btnNewButton_8_1.setBounds(176, 173, 53, 49);
		frame.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_11_1 = new JButton("-");
		btnNewButton_11_1.setBounds(241, 173, 53, 49);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_6_2 = new JButton("1");
		btnNewButton_6_2.setBounds(32, 244, 53, 49);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_7_2 = new JButton("2");
		btnNewButton_7_2.setBounds(101, 244, 53, 49);
		frame.getContentPane().add(btnNewButton_7_2);
		
		JButton btnNewButton_8_2 = new JButton("3");
		btnNewButton_8_2.setBounds(176, 244, 53, 49);
		frame.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_11_2 = new JButton("+");
		btnNewButton_11_2.setBounds(241, 244, 53, 49);
		frame.getContentPane().add(btnNewButton_11_2);
		
		JButton btnNewButton_6_3 = new JButton(",");
		btnNewButton_6_3.setBounds(32, 313, 53, 49);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JButton btnNewButton_7_3 = new JButton("0");
		btnNewButton_7_3.setBounds(101, 313, 53, 49);
		frame.getContentPane().add(btnNewButton_7_3);
		
		JButton btnNewButton_8_3 = new JButton("1");
		btnNewButton_8_3.setBounds(176, 313, 53, 49);
		frame.getContentPane().add(btnNewButton_8_3);
		
		JButton btnNewButton_11_3 = new JButton("=");
		btnNewButton_11_3.setBounds(241, 313, 53, 49);
		frame.getContentPane().add(btnNewButton_11_3);
		
		textField = new JTextField();
		textField.setBounds(42, 37, 234, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 64, 128));
		frmCalculadora.setFont(new Font("Algerian", Font.BOLD, 12));
		frmCalculadora.setTitle("Calculadora do Denis 1.0");
		frmCalculadora.setBounds(100, 100, 392, 414);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JTextField txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 20));
		txtField.setBounds(10, 11, 356, 42);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Arial", Font.BOLD, 20));
		btnC.setBounds(303, 60, 63, 49);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="+";
			}
		});
		btnSoma.setForeground(new Color(255, 0, 0));
		btnSoma.setFont(new Font("Arial", Font.BOLD, 20));
		btnSoma.setBounds(303, 120, 63, 49);
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="-";
			}
		});
		btnSub.setForeground(new Color(255, 0, 0));
		btnSub.setFont(new Font("Arial", Font.BOLD, 20));
		btnSub.setBounds(303, 180, 63, 49);
		frmCalculadora.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
			txtField.setText("");
			operacao="*";
			}
		});
		btnMult.setForeground(new Color(255, 0, 0));
		btnMult.setFont(new Font("Arial", Font.BOLD, 20));
		btnMult.setBounds(303, 240, 63, 49);
		frmCalculadora.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="/";
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 20));
		btnDiv.setBounds(303, 300, 63, 49);
		frmCalculadora.getContentPane().add(btnDiv);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2= Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 20));
		btnIgual.setBounds(208, 300, 63, 49);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(110, 300, 63, 49);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btnPonto.getText());
			}
		});
		btnPonto.setForeground(new Color(255, 0, 0));
		btnPonto.setFont(new Font("Arial", Font.BOLD, 20));
		btnPonto.setBounds(10, 300, 63, 49);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(208, 240, 63, 49);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(208, 180, 63, 49);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(208, 120, 63, 49);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(110, 240, 63, 49);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(110, 180, 63, 49);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(110, 120, 63, 49);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(10, 120, 63, 49);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(10, 180, 63, 49);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(10, 240, 63, 49);
		frmCalculadora.getContentPane().add(btn1);
	}
}

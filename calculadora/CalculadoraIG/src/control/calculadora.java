package control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {
	public float num1;
	public float num2;
	public String operar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel PNorte = new JPanel();
		PNorte.setBackground(new Color(255, 240, 245));
		contentPane.add(PNorte, BorderLayout.NORTH);
		PNorte.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Mi Calculadora");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PNorte.add(lblNewLabel);
		
		JFormattedTextField txtWindow = new JFormattedTextField();
		txtWindow.setForeground(new Color(205, 92, 92));
		txtWindow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtWindow.setColumns(20);
		PNorte.add(txtWindow);
		
		JPanel PIzq = new JPanel();
		PIzq.setBackground(new Color(255, 240, 245));
		contentPane.add(PIzq, BorderLayout.WEST);
		
		JPanel PDer = new JPanel();
		PDer.setBackground(new Color(255, 240, 245));
		contentPane.add(PDer, BorderLayout.EAST);
		PDer.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(" ");
			}
		});
		btnAC.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnAC.setForeground(new Color(112, 128, 144));
		btnAC.setBackground(new Color(230, 230, 250));
		PDer.add(btnAC);
		
		JButton btnBorrar = new JButton("DEL");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText("Enseñame a borrar un nº");
			}
		});
		btnBorrar.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnBorrar.setForeground(new Color(112, 128, 144));
		btnBorrar.setBackground(new Color(230, 230, 250));
		PDer.add(btnBorrar);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"+");
				num1=Float.parseFloat(txtWindow.getText());
				operar="+";
				txtWindow.setText(" ");				
			}
		});
		btnSum.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnSum.setForeground(new Color(112, 128, 144));
		btnSum.setBackground(new Color(230, 230, 250));
		PDer.add(btnSum);
		
		JButton btnRes = new JButton("-");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"-");
				num1=Float.parseFloat(txtWindow.getText());
				operar="-";
				txtWindow.setText(" ");
			}
		});
		btnRes.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnRes.setForeground(new Color(112, 128, 144));
		btnRes.setBackground(new Color(230, 230, 250));
		PDer.add(btnRes);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"/");
				num1=Float.parseFloat(txtWindow.getText());
				operar="/";
				txtWindow.setText(" ");
			}
		});
		btnDiv.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnDiv.setForeground(new Color(112, 128, 144));
		btnDiv.setBackground(new Color(230, 230, 250));
		PDer.add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"*");
				num1=Float.parseFloat(txtWindow.getText());
				operar="*";
				txtWindow.setText(" ");
			}
		});
		btnMul.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnMul.setForeground(new Color(112, 128, 144));
		btnMul.setBackground(new Color(230, 230, 250));
		PDer.add(btnMul);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Float.parseFloat(txtWindow.getText());
				switch(operar) {
					case"+":txtWindow.setText(Float.toString(num1+num2));break;
					case"-":txtWindow.setText(Float.toString(num1-num2));break;
					case"*":txtWindow.setText(Float.toString(num1*num2));break;
					case"/":txtWindow.setText(Float.toString(num1/num2));break;
				}
			}
		});
		btnResultado.setFont(new Font("Source Serif Pro Black", Font.BOLD, 15));
		btnResultado.setForeground(new Color(112, 128, 144));
		btnResultado.setBackground(new Color(230, 230, 250));
		PDer.add(btnResultado);
		
		JPanel PSur = new JPanel();
		PSur.setBackground(new Color(255, 240, 245));
		contentPane.add(PSur, BorderLayout.SOUTH);
		
		JPanel PCentro = new JPanel();
		PCentro.setBackground(new Color(255, 192, 203));
		contentPane.add(PCentro, BorderLayout.CENTER);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"1");
			}
		});
		btn1.setForeground(new Color(112, 128, 144));
		btn1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn1.setBackground(new Color(230, 230, 250));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"2");
			}
		});
		btn2.setForeground(new Color(112, 128, 144));
		btn2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn2.setBackground(new Color(230, 230, 250));
		
		JButton btn3 = new JButton(txtWindow.getText()+"3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"3");
			}
		});
		btn3.setForeground(new Color(112, 128, 144));
		btn3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn3.setBackground(new Color(230, 230, 250));
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"4");
			}
		});
		btn4.setForeground(new Color(112, 128, 144));
		btn4.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn4.setBackground(new Color(230, 230, 250));
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"5");
			}
		});
		btn5.setForeground(new Color(112, 128, 144));
		btn5.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn5.setBackground(new Color(230, 230, 250));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"6");
			}
		});
		btn6.setForeground(new Color(112, 128, 144));
		btn6.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn6.setBackground(new Color(230, 230, 250));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"7");
			}
		});
		btn7.setForeground(new Color(112, 128, 144));
		btn7.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn7.setBackground(new Color(230, 230, 250));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"8");
			}
		});
		btn8.setForeground(new Color(112, 128, 144));
		btn8.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn8.setBackground(new Color(230, 230, 250));
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"9");
			}
		});
		btn9.setForeground(new Color(112, 128, 144));
		btn9.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn9.setBackground(new Color(230, 230, 250));
		PCentro.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		PCentro.add(lblNewLabel_1);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(txtWindow.getText().contains("."))) {
				txtWindow.setText(txtWindow.getText()+".");
				}
			}
		});
		btnPoint.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btnPoint.setForeground(new Color(112, 128, 144));
		btnPoint.setBackground(new Color(230, 230, 250));
		PCentro.add(btnPoint);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWindow.setText(txtWindow.getText()+"0");
			}
		});
		btn0.setForeground(new Color(112, 128, 144));
		btn0.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 24));
		btn0.setBackground(new Color(230, 230, 250));
		PCentro.add(btn0);
		PCentro.add(btn1);
		PCentro.add(btn2);
		PCentro.add(btn3);
		PCentro.add(btn4);
		PCentro.add(btn5);
		PCentro.add(btn6);
		PCentro.add(btn7);
		PCentro.add(btn8);
		PCentro.add(btn9);
	}

}

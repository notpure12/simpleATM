package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Rectangle;
import javax.swing.border.CompoundBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Login extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		super("Bank System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 540);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(2, 2, 2, 2));
		contentPane.setBackground(new Color(20, 202, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BANK");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("TH NiramitIT๙", Font.BOLD, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(240, 53, 291, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ACCOUNT NO. :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("TH NiramitIT๙", Font.BOLD, 39));
		lblNewLabel_1.setBounds(90, 180, 207, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("TH NiramitIT๙", Font.BOLD, 39));
		lblNewLabel_2.setBounds(90, 270, 236, 70);
		contentPane.add(lblNewLabel_2);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();//ฟีลด์เลขบัญชี
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedTextField.setBounds(new Rectangle(2, 2, 2, 2));
		formattedTextField.setBounds(319, 203, 291, 32);
		contentPane.add(formattedTextField);
		
		passwordField = new JPasswordField();//ฟีลด์รหัสบัญชี
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(new Rectangle(10, 10, 10, 10));
		passwordField.setBounds(319, 296, 291, 32);
		contentPane.add(passwordField);
		
		Button button = new Button("SIGN IN");//ปุ่มเข้าระบบ
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("TH NiramitIT๙", Font.BOLD, 20));
		button.setActionCommand("SIGN IN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource  ()== null) {
				}else if (e.getSource()==button) {
					formattedTextField.setText("");
					passwordField.setText("");
				}
			}
		});
		button.setBounds(240, 385, 140, 50);
		contentPane.add(button);
		
		Button button_1 = new Button("SIGN UP");//ปุ่มสมัคร
		button_1.setFont(new Font("TH NiramitIT๙ ", Font.BOLD, 20));
		button_1.setBounds(391, 385, 140, 50);
		button.setActionCommand("SIGN UP");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(button_1);
		
		Button button_2 = new Button("Clear");//ปุ่มลบ
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource  ()== null) {
				}else if (e.getSource()==button_2) {
					formattedTextField.setText("");
					passwordField.setText("");
				}
			}
		});
		button_2.setBounds(461, 354, 70, 22);
		contentPane.add(button_2);
	}
}

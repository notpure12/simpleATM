	package main;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import java.awt.Canvas;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SignUp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Random rand = new Random();
	long randnum =(rand.nextLong()%9000L)+1000L;
	String Applynum = ""+Math.abs(randnum);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private AbstractButton rdbtnMale;
	private AbstractButton rdbtnFemale;
	private JLabel dateChooser;
	/**
	 * Create the frame.
	 */
	public SignUp() {
		
		super("SIGN UP FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 202, 211));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM NO."+Applynum);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("TH Niramit AS", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(250, 40, 275, 58);
		contentPane.add(lblNewLabel);
		String Accnum = Applynum;
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(60, 126, 89, 26);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(366, 126, 89, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();//ฟีลด์ชื่อจริง
		textField.setBounds(165, 130, 191, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		
		textField_1 = new JTextField();//ฟีลด์นามสกุล
		textField_1.setColumns(10);
		textField_1.setBounds(476, 130, 191, 20);
		contentPane.add(textField_1);

		
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(new Color(255, 255, 255));
		rdbtnMale.setBackground(new Color(20, 202, 211));
		rdbtnMale.setActionCommand("Male");
		rdbtnMale.setBounds(476, 193, 64, 23);
		contentPane.add(rdbtnMale);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gender :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(366, 190, 89, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(new Color(255, 255, 255));
		rdbtnFemale.setBackground(new Color(20, 202, 211));
		rdbtnFemale.setActionCommand("Male");
		rdbtnFemale.setBounds(603, 193, 64, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup ButtGroup = new ButtonGroup();
		ButtGroup.add(rdbtnFemale);
		ButtGroup.add(rdbtnMale);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Email :");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(60, 190, 89, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();//email
		textField_2.setColumns(10);
		textField_2.setBounds(165, 194, 191, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Password :");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1_2_1_1.setBounds(60, 244, 89, 26);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		textField_3 = new JTextField();//pass
		textField_3.setColumns(10);
		textField_3.setBounds(165, 248, 191, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("City :");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1.setFont(new Font("TH Niramit AS", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1.setBounds(60, 298, 89, 26);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		textField_4 = new JTextField();//City
		textField_4.setColumns(10);
		textField_4.setBounds(165, 302, 502, 20);
		contentPane.add(textField_4);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("TH Niramit AS", Font.BOLD, 21));
		btnNext.setBounds(568, 403, 99, 35);
		contentPane.add(btnNext);
		btnNext.addActionListener(this);
		
		JDateChooser dateChooser = new JDateChooser();//chooser
		dateChooser.setBounds(476, 244, 191, 20);
		contentPane.add(dateChooser);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Accnum= Applynum;
		String Fname = textField.getText();
		String Lname = textField_1.getText();
		String Email = textField_2.getText();
		String AccPass = textField_3.getText();
		String City = textField_4.getText();
		
		String Gender = null;
		if(rdbtnMale.isSelected()) {
			Gender = "Male";
		}else if (rdbtnFemale.isSelected()) {
			Gender = "Female";
		}
		String dob = (dateChooser.getText());
		
		try {
			if(textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			}
		}catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

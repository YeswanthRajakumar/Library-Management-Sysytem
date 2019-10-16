package library_project_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;

import javafx.scene.layout.Pane;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin {

	private JFrame frmAccountlogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.frmAccountlogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccountlogin = new JFrame();
		frmAccountlogin.setVisible(true);
		frmAccountlogin.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frmAccountlogin.setTitle("ACCOUNT_LOGIN");
		frmAccountlogin.setBounds(100, 100, 450, 300);
		frmAccountlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAccountlogin.getContentPane().setLayout(null);
		
		JLabel lblH = new JLabel("USERNAME");
		lblH.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblH.setBounds(26, 54, 93, 30);
		frmAccountlogin.getContentPane().add(lblH);
		
		textField = new JTextField();
		textField.setBounds(149, 60, 127, 20);
		frmAccountlogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(26, 107, 93, 30);
		frmAccountlogin.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 114, 127, 20);
		frmAccountlogin.getContentPane().add(passwordField);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{   
				String user = textField.getText();
				String obj = new String(passwordField.getPassword());
				String pass=obj;
				
				if(textField.getText()=="" && pass !=null)
				{
				if(pass.equals(user))
				{
				
					new Librarian(); 
				}
				else
				{
					JOptionPane.showMessageDialog(frmAccountlogin, "Invalid Username or Password", "ERROR",JOptionPane.ERROR_MESSAGE);
				}}
				
				else
				{
				
				JOptionPane.showMessageDialog(frmAccountlogin, "Userfield or password  is empty", "ERROR",JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNext.setBounds(335, 228, 89, 23);
		frmAccountlogin.getContentPane().add(btnNext);
		
		JButton btnCreateNewAccount = new JButton("Create New Account");
		btnCreateNewAccount.setBounds(10, 228, 152, 23);
		frmAccountlogin.getContentPane().add(btnCreateNewAccount);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{   
				
				frmAccountlogin.setVisible(false);
				LoginPage l=new LoginPage();
				
			}
		});
		btnNewButton.setBounds(236, 228, 89, 23);
		frmAccountlogin.getContentPane().add(btnNewButton);
		
		JLabel lblunderWork = new JLabel("//under work");
		lblunderWork.setBounds(335, 213, 89, 14);
		frmAccountlogin.getContentPane().add(lblunderWork);
	}
}

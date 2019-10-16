package library_project_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Librarian {

	private JFrame frmLibrarian;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarian window = new Librarian();
					window.frmLibrarian.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Librarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibrarian = new JFrame();
		frmLibrarian.setVisible(true);
		frmLibrarian.setTitle("LIBRARIAN");
		frmLibrarian.setBounds(100, 100, 450, 300);
		frmLibrarian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarian.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD BOOKS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(26, 36, 79, 28);
		frmLibrarian.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("REMOVE BOOKS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 76, 110, 28);
		frmLibrarian.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VIEW BOOKS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(26, 116, 89, 28);
		frmLibrarian.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENTS INFO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(26, 165, 110, 28);
		frmLibrarian.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				new AddBooks();
			}
		});
		btnNewButton.setBounds(163, 41, 89, 23);
		frmLibrarian.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GO");
		btnNewButton_1.setBounds(163, 80, 89, 23);
		frmLibrarian.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GO");
		btnNewButton_2.setBounds(163, 126, 89, 23);
		frmLibrarian.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("GO");
		btnNewButton_3.setBounds(163, 169, 89, 23);
		frmLibrarian.getContentPane().add(btnNewButton_3);
	}

}

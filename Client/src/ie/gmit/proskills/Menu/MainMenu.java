package ie.gmit.proskills.Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 350, 660, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		DefaultTableModel dtm = new DefaultTableModel(0, 0);

		// add header of the table
		String header[] = new String[] { "Item Name", "Price", "Postage", "Store"};

		// add header in table model
		dtm.setColumnIdentifiers(header);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 624, 325);
		contentPane.add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
				// set model into the table object
				table.setModel(dtm);
				
				JLabel lblSearch = new JLabel("Store Search:");
				lblSearch.setBounds(10, 56, 125, 14);
				contentPane.add(lblSearch);
				
				textField = new JTextField();
				textField.setBounds(10, 71, 125, 20);
				contentPane.add(textField);
				textField.setColumns(10);
				
				JButton btnNewButton = new JButton("Search");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
					}
				});
				btnNewButton.setBounds(10, 92, 125, 23);
				contentPane.add(btnNewButton);
		
		//contentPane.add(new JScrollPane(table));

		// add row dynamically into the table
		for (int count = 1; count <= 30; count++) {
			dtm.addRow(new Object[] { "Call Of Duty", "�5.00", "�2.50", "Ebay" });
		}

	}
}
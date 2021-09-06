
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class c5 {

	private JFrame frmPaymentPortal;
	private JTextField txtYouHaveTo;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					c5 window = new c5();
					window.frmPaymentPortal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public c5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaymentPortal = new JFrame();
		frmPaymentPortal.setTitle("Payment portal");
		frmPaymentPortal.setBounds(100, 100, 450, 300);
		frmPaymentPortal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaymentPortal.getContentPane().setLayout(null);
		
		txtYouHaveTo = new JTextField();
		txtYouHaveTo.setEditable(false);
		txtYouHaveTo.setText("You have to pay:");
		txtYouHaveTo.setBounds(46, 30, 102, 20);
		frmPaymentPortal.getContentPane().add(txtYouHaveTo);
		txtYouHaveTo.setColumns(10);
		
		String temp=Integer.toString(c4.fare);
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText(temp);
		textField.setBounds(182, 30, 110, 20);
		frmPaymentPortal.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Pay ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(115, 107, 125, 43);
		frmPaymentPortal.getContentPane().add(btnNewButton);
	}

}

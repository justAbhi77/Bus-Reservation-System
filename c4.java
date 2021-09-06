import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class c4 {
    public static int i;
	public int j=0;static boolean ar[]=new boolean[32];
	static int fare;
	private JFrame frame;
	private JTextField txtEnterTheAge;
	private JTextField txtPleaseEnterThe;
	private JTextField textField;
	private JButton btnButton;
	private JLabel label;
	private JLabel label_1;

	static void in(int[] a)
	{ for(i=0;i<32;i++)
		ar[a[i]]=true;
	
	}
	static void in_new()
	{ for(i=0;i<32;i++)
		ar[i]=false;
	for(i=0;i<32;i++)
		System.out.print(ar[i]+" ");
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					c4 window = new c4();
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
	public c4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBookMoreSeats = new JButton("Book More Seats");
		btnBookMoreSeats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fare=0;
				c3.main(null);
			}
		});
		btnBookMoreSeats.setBounds(10, 215, 151, 35);
		frame.getContentPane().add(btnBookMoreSeats);
		
		JButton btnProceedToPay = new JButton("Proceed to Pay");
		btnProceedToPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c5.main(null);
			}
		});
		btnProceedToPay.setBounds(304, 215, 120, 35);
		frame.getContentPane().add(btnProceedToPay);
		
				
		txtEnterTheAge = new JTextField();
		txtEnterTheAge.setEditable(false);
		txtEnterTheAge.setText("Enter the age of the passenger(s):");
		txtEnterTheAge.setBounds(10, 73, 197, 20);
		frame.getContentPane().add(txtEnterTheAge);
		txtEnterTheAge.setColumns(10);
		
		txtPleaseEnterThe = new JTextField();
		txtPleaseEnterThe.setEditable(false);
		txtPleaseEnterThe.setText("Please Enter the information of the passenger(s):");
		txtPleaseEnterThe.setBounds(59, 11, 274, 20);
		frame.getContentPane().add(txtPleaseEnterThe);
		txtPleaseEnterThe.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(242, 73, 103, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnButton = new JButton("Next Passenger's");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText("");
				if(j<c3.f-1)
				{
					if(age_input())
				{j++;
				 i=Integer.parseInt(textField.getText());
				  if(i<=2)	
					  fare+=0;
				  else if(i<=4)	
					  fare+=200;
				  else if(i<=8)	
					  fare+=400;
				  else if(i<=60)	
					  fare+=600;
				  else if(i>60)	
					  fare+=450;
				}
				else
					label.setText("Please re-enter the age correctly ");
				}	
				else 
					textField.setEditable(false);					
				textField.setText("");
			}
		});
		btnButton.setBounds(146, 117, 137, 47);
		frame.getContentPane().add(btnButton);
		
		label = new JLabel("");
		label.setForeground(Color.RED);
		label.setBounds(229, 92, 151, 14);
		frame.getContentPane().add(label);
		
		String temp1="Enter ages of "+ c3.f+" people";
		label_1 = new JLabel("");
		label_1.setBounds(216, 56, 187, 14);
		label_1.setText(temp1);
		frame.getContentPane().add(label_1);
				
	}
	boolean age_input()
	{
		int temp=Integer.parseInt(textField.getText());
		if(temp>=0 && temp<=130)
		return true;
		else
			return false;
	}
}
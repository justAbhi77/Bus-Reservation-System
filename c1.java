import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class c1 {

	private JFrame frmIntroduction;
	private JTextField txtTheMembersOf;
	private JTextField txtName;
	private JTextField txtAadarshGaneshGoenka;
	private JTextField txtAayushTibrewal;
	private JTextField txtNavinGupta;
	private JTextField txtAbhinavOjha;
	private JTextField txtClass;
	private JTextField txta;
	private JTextField txta_1;
	private JTextField txta_2;
	private JTextField txta_3;
	private JTextField txtRollNo;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtAkshatJain;
	private JTextField textField_16;
	private JTextField txtb;

	public static void main(String[] args) {
		try {
			c1 window = new c1();
			window.frmIntroduction.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public c1() {
		initialize();
	}

	private void initialize() {

		frmIntroduction = new JFrame();
		frmIntroduction.setTitle("Introduction");
		frmIntroduction.setBounds(100, 100, 450, 340);
		frmIntroduction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIntroduction.getContentPane().setLayout(null);

		txtTheMembersOf = new JTextField();
		txtTheMembersOf.setEditable(false);
		txtTheMembersOf.setText("The members of the group are as follows:");
		txtTheMembersOf.setBounds(81, 11, 240, 20);
		frmIntroduction.getContentPane().add(txtTheMembersOf);
		txtTheMembersOf.setColumns(10);

		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setText("Name:-");
		txtName.setEditable(false);
		txtName.setBounds(10, 42, 86, 20);
		frmIntroduction.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtAadarshGaneshGoenka = new JTextField();
		txtAadarshGaneshGoenka.setText("Aadarsh Ganesh Goenka");
		txtAadarshGaneshGoenka.setHorizontalAlignment(SwingConstants.CENTER);
		txtAadarshGaneshGoenka.setEditable(false);
		txtAadarshGaneshGoenka.setBounds(10, 73, 144, 20);
		frmIntroduction.getContentPane().add(txtAadarshGaneshGoenka);
		txtAadarshGaneshGoenka.setColumns(10);

		txtAayushTibrewal = new JTextField();
		txtAayushTibrewal.setText("Aayush Tibrewal");
		txtAayushTibrewal.setHorizontalAlignment(SwingConstants.CENTER);
		txtAayushTibrewal.setEditable(false);
		txtAayushTibrewal.setBounds(10, 104, 98, 20);
		frmIntroduction.getContentPane().add(txtAayushTibrewal);
		txtAayushTibrewal.setColumns(10);

		txtNavinGupta = new JTextField();
		txtNavinGupta.setText("Navin Gupta");
		txtNavinGupta.setHorizontalAlignment(SwingConstants.CENTER);
		txtNavinGupta.setEditable(false);
		txtNavinGupta.setBounds(10, 135, 86, 20);
		frmIntroduction.getContentPane().add(txtNavinGupta);
		txtNavinGupta.setColumns(10);

		txtAbhinavOjha = new JTextField();
		txtAbhinavOjha.setText("Abhinav Ojha");
		txtAbhinavOjha.setHorizontalAlignment(SwingConstants.CENTER);
		txtAbhinavOjha.setEditable(false);
		txtAbhinavOjha.setBounds(10, 166, 86, 20);
		frmIntroduction.getContentPane().add(txtAbhinavOjha);
		txtAbhinavOjha.setColumns(10);

		txtClass = new JTextField();
		txtClass.setText("Class");
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setEditable(false);
		txtClass.setBounds(321, 42, 86, 20);
		frmIntroduction.getContentPane().add(txtClass);
		txtClass.setColumns(10);

		txta = new JTextField();
		txta.setText("11-A");
		txta.setHorizontalAlignment(SwingConstants.CENTER);
		txta.setEditable(false);
		txta.setBounds(321, 73, 86, 20);
		frmIntroduction.getContentPane().add(txta);
		txta.setColumns(10);

		txta_1 = new JTextField();
		txta_1.setText("11-A");
		txta_1.setHorizontalAlignment(SwingConstants.CENTER);
		txta_1.setEditable(false);
		txta_1.setBounds(321, 104, 86, 20);
		frmIntroduction.getContentPane().add(txta_1);
		txta_1.setColumns(10);

		txta_2 = new JTextField();
		txta_2.setText("11-A");
		txta_2.setHorizontalAlignment(SwingConstants.CENTER);
		txta_2.setEditable(false);
		txta_2.setBounds(321, 135, 86, 20);
		frmIntroduction.getContentPane().add(txta_2);
		txta_2.setColumns(10);

		txta_3 = new JTextField();
		txta_3.setText("11-A");
		txta_3.setHorizontalAlignment(SwingConstants.CENTER);
		txta_3.setEditable(false);
		txta_3.setBounds(321, 166, 86, 20);
		frmIntroduction.getContentPane().add(txta_3);
		txta_3.setColumns(10);

		txtRollNo = new JTextField();
		txtRollNo.setText("Roll No.:-");
		txtRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollNo.setEditable(false);
		txtRollNo.setBounds(164, 42, 86, 20);
		frmIntroduction.getContentPane().add(txtRollNo);
		txtRollNo.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setText("2432");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setEditable(false);
		textField_11.setBounds(164, 73, 86, 20);
		frmIntroduction.getContentPane().add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setText("3974");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setBounds(164, 104, 86, 20);
		frmIntroduction.getContentPane().add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setText("3156");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setEditable(false);
		textField_13.setBounds(164, 135, 86, 20);
		frmIntroduction.getContentPane().add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setText("5177");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setEditable(false);
		textField_14.setBounds(164, 166, 86, 20);
		frmIntroduction.getContentPane().add(textField_14);
		textField_14.setColumns(10);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmIntroduction.dispose();
				c2.main(null);
			}
		});
		btnNewButton.setBounds(148, 244, 115, 46);
		frmIntroduction.getContentPane().add(btnNewButton);

		txtAkshatJain = new JTextField();
		txtAkshatJain.setText("Akshat Jain");
		txtAkshatJain.setHorizontalAlignment(SwingConstants.CENTER);
		txtAkshatJain.setEditable(false);
		txtAkshatJain.setBounds(10, 197, 86, 20);
		frmIntroduction.getContentPane().add(txtAkshatJain);
		txtAkshatJain.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setText("2821");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setEditable(false);
		textField_16.setBounds(164, 197, 86, 20);
		frmIntroduction.getContentPane().add(textField_16);
		textField_16.setColumns(10);

		txtb = new JTextField();
		txtb.setText("11-B");
		txtb.setHorizontalAlignment(SwingConstants.CENTER);
		txtb.setEditable(false);
		txtb.setBounds(321, 197, 86, 20);
		frmIntroduction.getContentPane().add(txtb);
		txtb.setColumns(10);
	}
}
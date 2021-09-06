import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class c3 {

	private JFrame frmSelectSeats;
	private JTextField txtPleaseSelectThe;
	private JTextField txtVacantSeats;
	private JLabel label_1;
	private JTextField txtBookedSeats;
	private JTextField txtTheArrangementOf;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JButton btnNewButton;
	static int f = 0, c = 0;

	boolean check(int c) {
		boolean rtn = c4.ar[c];
		return rtn;
	}

	public static void main(String[] args) {

		try {
			c3 window = new c3();
			window.frmSelectSeats.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public c3() {
		initialize();
	}

	private void initialize() {
		int a[] = new int[32];
		frmSelectSeats = new JFrame();
		frmSelectSeats.setTitle("Select Seats");
		frmSelectSeats.setBounds(100, 100, 534, 750);
		frmSelectSeats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectSeats.getContentPane().setLayout(null);

		txtPleaseSelectThe = new JTextField();
		txtPleaseSelectThe.setEditable(false);
		txtPleaseSelectThe.setText("Please Select the seats You want to book for the journey");
		txtPleaseSelectThe.setBounds(77, 11, 312, 20);
		frmSelectSeats.getContentPane().add(txtPleaseSelectThe);
		txtPleaseSelectThe.setColumns(10);

		JLabel label = new JLabel("");
		label.setToolTipText("Vacant Seats");
		label.setBounds(30, 50, 50, 50);
		Image img = new ImageIcon(this.getClass().getResource("/img/seat.gif")).getImage();
		label.setIcon(new ImageIcon(img));
		frmSelectSeats.getContentPane().add(label);

		txtVacantSeats = new JTextField();
		txtVacantSeats.setEditable(false);
		txtVacantSeats.setText("Vacant Seats");
		txtVacantSeats.setBounds(90, 66, 86, 20);
		frmSelectSeats.getContentPane().add(txtVacantSeats);
		txtVacantSeats.setColumns(10);

		label_1 = new JLabel("");
		label_1.setToolTipText("Booked Seats");
		label_1.setBounds(403, 50, 50, 50);
		Image img1 = new ImageIcon(this.getClass().getResource("/img/seat-booked.gif")).getImage();
		label_1.setIcon(new ImageIcon(img1));
		frmSelectSeats.getContentPane().add(label_1);

		txtBookedSeats = new JTextField();
		txtBookedSeats.setEditable(false);
		txtBookedSeats.setText("Booked Seats");
		txtBookedSeats.setBounds(307, 66, 86, 20);
		frmSelectSeats.getContentPane().add(txtBookedSeats);
		txtBookedSeats.setColumns(10);

		txtTheArrangementOf = new JTextField();
		txtTheArrangementOf.setEditable(false);
		txtTheArrangementOf.setText("The arrangement of the seats of the bus is as:");
		txtTheArrangementOf.setBounds(90, 108, 257, 20);
		frmSelectSeats.getContentPane().add(txtTheArrangementOf);
		txtTheArrangementOf.setColumns(10);

		label_2 = new JLabel("");
		label_2.setBounds(266, 157, 50, 50);
		frmSelectSeats.getContentPane().add(label_2);
		if (check(1))
			label_2.setIcon(new ImageIcon(img1));
		else {
			label_2.setIcon(new ImageIcon(img));
			label_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_2.setIcon(new ImageIcon(img1));
					c++;
					a[f++] = 1;
				}
			});
		}

		label_3 = new JLabel("");
		label_3.setBounds(90, 222, 50, 50);
		frmSelectSeats.getContentPane().add(label_3);
		if (check(3))
			label_3.setIcon(new ImageIcon(img1));
		else {
			label_3.setIcon(new ImageIcon(img));
			label_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_3.setIcon(new ImageIcon(img1));
					a[f++] = 3;
					c++;
				}
			});
		}

		label_4 = new JLabel("");
		label_4.setBounds(339, 157, 50, 50);
		frmSelectSeats.getContentPane().add(label_4);
		if (check(2))
			label_4.setIcon(new ImageIcon(img1));
		else {
			label_4.setIcon(new ImageIcon(img));
			label_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_4.setIcon(new ImageIcon(img1));
					a[f++] = 2;
					c++;
				}
			});
		}
		label_5 = new JLabel("");
		label_5.setBounds(90, 469, 50, 50);
		frmSelectSeats.getContentPane().add(label_5);
		if (check(19))
			label_5.setIcon(new ImageIcon(img1));
		else {
			label_5.setIcon(new ImageIcon(img));
			label_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_5.setIcon(new ImageIcon(img1));
					a[f++] = 19;
					c++;
				}
			});
		}

		label_6 = new JLabel("");
		label_6.setBounds(156, 222, 50, 50);
		frmSelectSeats.getContentPane().add(label_6);
		if (check(4))
			label_6.setIcon(new ImageIcon(img1));
		else {
			label_6.setIcon(new ImageIcon(img));
			label_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_6.setIcon(new ImageIcon(img1));
					a[f++] = 4;
					c++;
				}
			});

		}

		label_7 = new JLabel("");
		label_7.setBounds(266, 218, 50, 50);
		frmSelectSeats.getContentPane().add(label_7);
		if (check(5))
			label_7.setIcon(new ImageIcon(img1));
		else {
			label_7.setIcon(new ImageIcon(img));
			label_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_7.setIcon(new ImageIcon(img1));
					a[f++] = 5;
					c++;
				}
			});
		}

		label_8 = new JLabel("");
		label_8.setBounds(339, 222, 50, 50);
		frmSelectSeats.getContentPane().add(label_8);
		if (check(6))
			label_8.setIcon(new ImageIcon(img1));
		else {
			label_8.setIcon(new ImageIcon(img));
			label_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_8.setIcon(new ImageIcon(img1));
					a[f++] = 6;
					c++;
				}
			});
		}

		label_9 = new JLabel("");
		label_9.setBounds(90, 599, 50, 50);
		frmSelectSeats.getContentPane().add(label_9);
		if (check(27))
			label_9.setIcon(new ImageIcon(img1));
		else {
			label_9.setIcon(new ImageIcon(img));
			label_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_9.setIcon(new ImageIcon(img1));
					a[f++] = 27;
					c++;
				}
			});
		}

		label_10 = new JLabel("");
		label_10.setBounds(90, 538, 50, 50);
		frmSelectSeats.getContentPane().add(label_10);
		if (check(23))
			label_10.setIcon(new ImageIcon(img1));
		else {
			label_10.setIcon(new ImageIcon(img));
			label_10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_10.setIcon(new ImageIcon(img1));
					a[f++] = 23;
					c++;
				}
			});
		}

		label_11 = new JLabel("");

		label_11.setBounds(90, 283, 50, 50);
		label_11.setIcon(new ImageIcon(img));
		frmSelectSeats.getContentPane().add(label_11);
		if (check(7))
			label_11.setIcon(new ImageIcon(img1));
		else {
			label_11.setIcon(new ImageIcon(img));
			label_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_11.setIcon(new ImageIcon(img1));
					a[f++] = 7;
					c++;
				}
			});
		}

		label_12 = new JLabel("");
		label_12.setBounds(266, 283, 50, 50);
		frmSelectSeats.getContentPane().add(label_12);
		if (check(9))
			label_12.setIcon(new ImageIcon(img1));
		else {
			label_12.setIcon(new ImageIcon(img));
			label_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_12.setIcon(new ImageIcon(img1));
					a[f++] = 9;
					c++;
				}
			});
		}

		label_13 = new JLabel("");

		label_13.setBounds(339, 283, 50, 50);

		frmSelectSeats.getContentPane().add(label_13);
		if (check(10))
			label_13.setIcon(new ImageIcon(img1));
		else {
			label_13.setIcon(new ImageIcon(img));
			label_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_13.setIcon(new ImageIcon(img1));
					a[f++] = 10;
					c++;
				}
			});
		}
		label_14 = new JLabel("");
		label_14.setBounds(266, 599, 50, 50);
		frmSelectSeats.getContentPane().add(label_14);
		if (check(30))
			label_14.setIcon(new ImageIcon(img1));
		else {
			label_14.setIcon(new ImageIcon(img));
			label_14.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_14.setIcon(new ImageIcon(img1));
					a[f++] = 30;
					c++;
				}
			});
		}

		label_15 = new JLabel("");
		label_15.setBounds(266, 469, 50, 50);
		frmSelectSeats.getContentPane().add(label_15);
		if (check(21))
			label_15.setIcon(new ImageIcon(img1));
		else {
			label_15.setIcon(new ImageIcon(img));
			label_15.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_15.setIcon(new ImageIcon(img1));
					a[f++] = 21;
					c++;
				}
			});
		}

		label_16 = new JLabel("");

		frmSelectSeats.getContentPane().add(label_16);
		if (check(12))
			label_16.setIcon(new ImageIcon(img1));
		else {
			label_16.setIcon(new ImageIcon(img));
			label_16.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_16.setIcon(new ImageIcon(img1));
					a[f++] = 12;
					c++;
				}
			});
			label_16.setBounds(156, 342, 50, 50);
		}
		label_17 = new JLabel("");
		label_17.setBounds(266, 342, 50, 50);
		frmSelectSeats.getContentPane().add(label_17);
		if (check(13))
			label_17.setIcon(new ImageIcon(img1));
		else {
			label_17.setIcon(new ImageIcon(img));
			label_17.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_17.setIcon(new ImageIcon(img1));
					a[f++] = 13;
					c++;
				}
			});
		}
		label_18 = new JLabel("");
		label_18.setBounds(339, 344, 50, 50);
		frmSelectSeats.getContentPane().add(label_18);
		if (check(14))
			label_18.setIcon(new ImageIcon(img1));
		else {
			label_18.setIcon(new ImageIcon(img));
			label_18.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_18.setIcon(new ImageIcon(img1));
					a[f++] = 14;
					c++;
				}
			});
		}
		label_19 = new JLabel("");
		label_19.setBounds(339, 538, 50, 50);
		frmSelectSeats.getContentPane().add(label_19);
		if (check(26))
			label_19.setIcon(new ImageIcon(img1));
		else {
			label_19.setIcon(new ImageIcon(img));
			label_19.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_19.setIcon(new ImageIcon(img1));
					a[f++] = 26;
					c++;
				}
			});
		}
		label_20 = new JLabel("");
		label_20.setBounds(156, 599, 50, 50);

		frmSelectSeats.getContentPane().add(label_20);
		if (check(28))
			label_20.setIcon(new ImageIcon(img1));
		else {
			label_20.setIcon(new ImageIcon(img));
			label_20.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_20.setIcon(new ImageIcon(img1));
					a[f++] = 28;
					c++;
				}
			});
		}
		label_21 = new JLabel("");
		label_21.setBounds(90, 408, 50, 50);
		frmSelectSeats.getContentPane().add(label_21);
		if (check(15))
			label_21.setIcon(new ImageIcon(img1));
		else {
			label_21.setIcon(new ImageIcon(img));
			label_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_21.setIcon(new ImageIcon(img1));
					a[f++] = 15;
					c++;
				}
			});
		}
		label_22 = new JLabel("");
		label_22.setBounds(90, 344, 50, 50);
		frmSelectSeats.getContentPane().add(label_22);
		if (check(11))
			label_22.setIcon(new ImageIcon(img1));
		else {
			label_22.setIcon(new ImageIcon(img));
			label_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_22.setIcon(new ImageIcon(img1));
					a[f++] = 11;
					c++;
				}
			});
		}
		label_23 = new JLabel("");
		label_23.setBounds(266, 408, 50, 50);
		frmSelectSeats.getContentPane().add(label_23);
		if (check(17))
			label_23.setIcon(new ImageIcon(img1));
		else {

			label_23.setIcon(new ImageIcon(img));
			label_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_23.setIcon(new ImageIcon(img1));
					a[f++] = 17;
					c++;
				}
			});
		}
		label_24 = new JLabel("");
		label_24.setBounds(339, 408, 50, 50);

		frmSelectSeats.getContentPane().add(label_24);
		if (check(18))
			label_24.setIcon(new ImageIcon(img1));
		else {
			label_24.setIcon(new ImageIcon(img));
			label_24.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_24.setIcon(new ImageIcon(img1));
					a[f++] = 18;
					c++;
				}
			});
		}
		label_25 = new JLabel("");
		label_25.setBounds(156, 538, 50, 50);
		frmSelectSeats.getContentPane().add(label_25);
		if (check(24))
			label_25.setIcon(new ImageIcon(img1));
		else {
			label_25.setIcon(new ImageIcon(img));
			label_25.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_25.setIcon(new ImageIcon(img1));
					a[f++] = 24;
					c++;
				}
			});
		}
		label_26 = new JLabel("");
		label_26.setBounds(156, 469, 50, 50);
		frmSelectSeats.getContentPane().add(label_26);
		if (check(20))
			label_26.setIcon(new ImageIcon(img1));
		else {
			label_26.setIcon(new ImageIcon(img));
			label_26.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_26.setIcon(new ImageIcon(img1));
					a[f++] = 20;
					c++;
				}
			});
		}
		label_27 = new JLabel("");
		label_27.setBounds(156, 408, 50, 50);
		frmSelectSeats.getContentPane().add(label_27);
		if (check(16))
			label_27.setIcon(new ImageIcon(img1));
		else {
			label_27.setIcon(new ImageIcon(img));
			label_27.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_27.setIcon(new ImageIcon(img1));
					a[f++] = 16;
					c++;
				}
			});
		}

		label_28 = new JLabel("");
		frmSelectSeats.getContentPane().add(label_28);
		label_28.setBounds(156, 283, 50, 50);
		if (check(8))
			label_28.setIcon(new ImageIcon(img1));
		else {
			label_28.setIcon(new ImageIcon(img));
			label_28.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_28.setIcon(new ImageIcon(img1));
					a[f++] = 8;
					c++;
				}
			});

		}

		label_29 = new JLabel("");
		label_29.setBounds(339, 469, 50, 50);
		frmSelectSeats.getContentPane().add(label_29);
		if (check(22))
			label_29.setIcon(new ImageIcon(img1));
		else {
			label_29.setIcon(new ImageIcon(img));
			label_29.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_29.setIcon(new ImageIcon(img1));
					a[f++] = 22;
					c++;
				}
			});
		}
		label_30 = new JLabel("");
		label_30.setBounds(266, 538, 50, 50);

		frmSelectSeats.getContentPane().add(label_30);
		if (check(25))
			label_30.setIcon(new ImageIcon(img1));
		else {
			label_30.setIcon(new ImageIcon(img));
			label_30.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_30.setIcon(new ImageIcon(img1));
					a[f++] = 25;
					c++;
				}
			});
		}
		label_31 = new JLabel("");
		label_31.setBounds(339, 599, 50, 50);
		frmSelectSeats.getContentPane().add(label_31);
		if (check(31))
			label_31.setIcon(new ImageIcon(img1));
		else {
			label_31.setIcon(new ImageIcon(img));
			label_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_31.setIcon(new ImageIcon(img1));
					a[f++] = 31;
					c++;
				}
			});
		}
		label_32 = new JLabel("");
		label_32.setBounds(216, 599, 50, 50);

		frmSelectSeats.getContentPane().add(label_32);
		if (check(29))
			label_32.setIcon(new ImageIcon(img1));
		else {
			label_32.setIcon(new ImageIcon(img));
			label_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					label_32.setIcon(new ImageIcon(img1));
					a[f++] = 29;
					c++;
				}
			});
		}
		btnNewButton = new JButton("Get Availability");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp1 = "The total number of seats booked are " + f + ".You booked: " + c;
				JOptionPane.showMessageDialog(null, temp1);
				frmSelectSeats.dispose();
				c4.in(a);
				c4.main(null);
				c = 0;
			}
		});
		btnNewButton.setBounds(180, 666, 130, 34);
		frmSelectSeats.getContentPane().add(btnNewButton);

	}

}

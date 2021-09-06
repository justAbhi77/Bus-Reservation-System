import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class c2 {

    private JFrame frmBusReservationSystem;
    private JTextField txtBusReservationSystem;

    public static void main(String[] args) {
        try {
            c2 window = new c2();
            window.frmBusReservationSystem.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public c2() {
        initialize();
    }

    private void initialize() {
        frmBusReservationSystem = new JFrame();
        frmBusReservationSystem.setTitle("Bus Reservation System");
        frmBusReservationSystem.setBounds(100, 100, 450, 300);
        frmBusReservationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmBusReservationSystem.getContentPane().setLayout(null);

        txtBusReservationSystem = new JTextField();
        txtBusReservationSystem.setEditable(false);
        txtBusReservationSystem.setText("Bus Reservation System");
        txtBusReservationSystem.setBounds(127, 11, 144, 20);
        frmBusReservationSystem.getContentPane().add(txtBusReservationSystem);
        txtBusReservationSystem.setColumns(10);

        JTextPane txtpnAComputerReservation = new JTextPane();
        txtpnAComputerReservation.setEditable(false);
        txtpnAComputerReservation.setText(
                "A computer reservation system or central reservation system (CRS) is a computerized system used to store and retrieve information and conduct transactions related to air travel, hotels, car rental, or other activities. Originally designed and operated by airlines, CRSs were later extended for the use of travel agencies. Global distribution systems (GDS) book and sell tickets for multiple airlines. Most airlines have outsourced their CRSs to GDS companies, which also enable consumer access through Internet gateways. Modern GDS's typically allow users to book hotel rooms, rental cars, airline tickets as well as other activities and tours. ");
        txtpnAComputerReservation.setBounds(10, 42, 414, 150);
        frmBusReservationSystem.getContentPane().add(txtpnAComputerReservation);

        JButton btnNewButton = new JButton("Next");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                c3.main(null);
            }
        });
        btnNewButton.setBounds(127, 213, 120, 37);
        frmBusReservationSystem.getContentPane().add(btnNewButton);
    }
}
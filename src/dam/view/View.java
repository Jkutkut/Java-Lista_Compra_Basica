package dam.view;

import dam.control.Controller;
import dam.model.UnidadesProducto;

import javax.swing.*;

public class View extends JFrame {
    private JPanel menu;
    private JPanel panelControl;
    private JLabel lvlProducto;
    private JLabel lvlCantidad;
    private JLabel lvlUnidad;
    private JLabel lblTitle;

    private JTextField txtFProducto;
    private JSpinner spCantidad;
    private JComboBox cmbUnidad;
    private JButton añadirButton;
    private JButton eliminarButton;
    private JList listProductos;


    public View() {
        setContentPane(menu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        // Units
        cmbUnidad.setModel(new DefaultComboBoxModel(UnidadesProducto.getUnidades()));
    }

    public void setControlador(Controller controller) {
//        .addActionListener(controller);
    }

    // GETTERS

}

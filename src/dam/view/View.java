package dam.view;

import dam.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private JPanel menu;
    private JLabel lblTitle;
    private JTextField txtFProducto;
    private JSpinner spCantidad;
    private JComboBox cmbUnidad;
    private JButton eliminarButton;
    private JButton añadirButton;
    private JList listProductos;
    private JLabel lvlProducto;
    private JLabel lvlCantidad;
    private JLabel lvlUnidad;
    private JPanel panelControl;

    public View() {
        setContentPane(menu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {

    }

    public void setControlador(Controller controller) {
//        .addActionListener(controller);
    }

    // GETTERS

}

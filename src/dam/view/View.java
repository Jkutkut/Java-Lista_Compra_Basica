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
    private JButton btnAdd;
    private JButton btnDel;
    private JList listProductos;
    private JLabel lblError;


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
        btnAdd.addActionListener(controller);
        btnDel.addActionListener(controller);
    }

    // GETTERS
    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnDel() {
        return btnDel;
    }

    public JTextField getTxtFProducto() {
        return txtFProducto;
    }

    public JSpinner getSpCantidad() {
        return spCantidad;
    }

    public JComboBox getCmbUnidad() {
        return cmbUnidad;
    }
}

package dam.view;

import dam.control.Controller;
import dam.model.Producto;
import dam.model.UnidadesProducto;

import javax.swing.*;
import java.util.ArrayList;

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

    private ArrayList<Producto> productos;

    public View() {
        setContentPane(menu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();

        productos = new ArrayList<Producto>();
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

    // SETTERS

    /**
     * Muestra un mensaje de error en la la interfaz.
     *
     * @param error Mensaje de error.
     */
    public void setError(String error) {
        if (error == null || error.isEmpty())
            lblError.setText("");
        else
            lblError.setText("Error: " + error);
    }

    /**
     * Elimina la label de error.
     */
    public void clearError() {
        setError("");
    }

    /**
     * Añade un producto a la lista de productos si no existe ya.
     *
     * @param name Nombre del producto
     * @param cant Cantidad del producto
     * @param unidad Unidad del producto
     * @return true si se ha añadido el producto, false en caso contrario.
     */
    public boolean addNewProduct(String name, int cant, String unidad) {
        Producto p = new Producto(name, cant, unidad);
        if (productos.contains(p)) {
            setError("El producto ya existe");
            return false;
        }
        productos.add(p);
        listProductos.setListData(productos.toArray());
        return true;
    }
}

package dam.control;

import dam.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View window;

    public Controller(View window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton btn = (JButton) e.getSource();
            if (btn == window.getBtnAdd()) {
                addProduct();
            }
            else if (btn == window.getBtnDel()) {
                removeProduct();
            }
        }
    }

    private void addProduct() {
        String name = window.getTxtFProducto().getText();
        if (name.isEmpty()) {
            window.setError("Debe ingresar un nombre");
            return ;
        }
        int cant = (int) window.getSpCantidad().getValue();
        if (cant <= 0) {
            window.setError("Debe ingresar una cantidad válida");
            return ;
        }
        String unidad = window.getCmbUnidad().getSelectedItem().toString();
        if (window.addNewProduct(name, cant, unidad))
            window.clearError();
    }

    private void removeProduct() {
    }

}

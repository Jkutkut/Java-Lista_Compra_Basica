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
                window.addProduct();
            } else if (btn == window.getBtnDel()) {
                window.removeProduct();
            }
        }
    }
}

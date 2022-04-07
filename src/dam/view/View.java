package dam.view;

import dam.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private JPanel menu;

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

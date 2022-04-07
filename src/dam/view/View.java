package dam.view;

import dam.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private JPanel menu;
    private JLabel lblTitle;
    private JTextField textField1;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private JButton eliminarButton;
    private JButton añadirButton;
    private JList list1;

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

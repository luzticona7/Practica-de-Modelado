import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public PanelPrincipal() {

        setLayout(null);

        JLabel lblTitulo = new JLabel("PRÁCTICA 5");
        lblTitulo.setBounds(0, 0, 1000, 45);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 25));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        add(lblTitulo);

        //setBackground(Color.decode("#2B4F60"));
        setSize(1000, 670);

        JButton btnEj1 = new JButton("ej1");
        btnEj1.setBounds(47, 111, 200, 120);
        add(btnEj1);

        JButton btnEj2 = new JButton("ej2");
        btnEj2.setBounds(407, 111, 200, 120);
        add(btnEj2);

        JButton btnEj3 = new JButton("ej3");
        btnEj3.setBounds(745, 111, 200, 120);
        add(btnEj3);

        JButton btnEj4 = new JButton("ej4");
        btnEj4.setBounds(47, 292, 200, 120);
        add(btnEj4);

        JButton btnEj5 = new JButton("ej5");
        btnEj5.setBounds(407, 292, 200, 120);
        add(btnEj5);

        JButton btnEj6 = new JButton("ej6");
        btnEj6.setBounds(745, 292, 200, 120);
        add(btnEj6);

        JButton btnEj7 = new JButton("ej7");
        btnEj7.setBounds(215, 491, 200, 120);
        add(btnEj7);

        JButton btnEj8 = new JButton("ej8");
        btnEj8.setBounds(571, 491, 200, 120);
        add(btnEj8);

    }
}

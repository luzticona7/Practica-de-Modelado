package moldee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Dado extends JFrame {
    private JTextField textFieldNSIM, textFieldNJUE, textFieldCJUE, textFieldGJUG;
    private JButton btnSimular, btnLimpiar;
    private JTable tablaResultados;
    private DefaultTableModel modeloTabla;
    private JTextField textFieldPromedioGN;
    private JTextField textFieldPromedioNJUEC;
    private JTextField textFieldPromedioPJUEC;

    public Dado() {
        getContentPane().setBackground(new Color(176, 206, 225));
        setTitle("Simulación de Juego de Dados");
        setSize(819, 511);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);

        JLabel lblDatosDeLa = new JLabel("DATOS DE LA SIMULACION");
        lblDatosDeLa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDatosDeLa.setBounds(56, 85, 264, 27);
        getContentPane().add(lblDatosDeLa);

        JLabel lblNumeroDeSimulaciones = new JLabel("Numero de Simulaciones:");
        lblNumeroDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeSimulaciones.setBounds(21, 153, 173, 13);
        getContentPane().add(lblNumeroDeSimulaciones);

        textFieldNSIM = new JTextField();
        textFieldNSIM.setBounds(224, 147, 96, 19);
        getContentPane().add(textFieldNSIM);
        textFieldNSIM.setColumns(10);

        JLabel lblNumeroDeJuegos = new JLabel("Numero de Juegos:");
        lblNumeroDeJuegos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeJuegos.setBounds(21, 200, 173, 13);
        getContentPane().add(lblNumeroDeJuegos);

        textFieldNJUE = new JTextField();
        textFieldNJUE.setColumns(10);
        textFieldNJUE.setBounds(224, 194, 96, 19);
        getContentPane().add(textFieldNJUE);

        JLabel lblCostoDelJuego = new JLabel("Costo del Juego (Bs):");
        lblCostoDelJuego.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCostoDelJuego.setBounds(21, 245, 173, 13);
        getContentPane().add(lblCostoDelJuego);

        textFieldCJUE = new JTextField();
        textFieldCJUE.setColumns(10);
        textFieldCJUE.setBounds(224, 243, 96, 19);
        getContentPane().add(textFieldCJUE);

        JLabel lblGananciaDelJugador = new JLabel("Ganancia del Jugador (Bs):");
        lblGananciaDelJugador.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblGananciaDelJugador.setBounds(21, 285, 197, 13);
        getContentPane().add(lblGananciaDelJugador);

        textFieldGJUG = new JTextField();
        textFieldGJUG.setColumns(10);
        textFieldGJUG.setBounds(224, 283, 96, 19);
        getContentPane().add(textFieldGJUG);

        JLabel lblResultadosDeSimulaciones = new JLabel("Resultados de Simulaciones");
        lblResultadosDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblResultadosDeSimulaciones.setBounds(432, 20, 264, 27);
        getContentPane().add(lblResultadosDeSimulaciones);

        
        modeloTabla = new DefaultTableModel(new Object[]{"NSIM", "GN(Bs)", "NJUEC", "PJUEC(%)"}, 0);
        tablaResultados = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaResultados);
        scrollPane.setBounds(381, 58, 402, 200);
        getContentPane().add(scrollPane);

        btnSimular = new JButton("SIMULAR");

        btnSimular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simular();
            }
        });
        btnSimular.setBounds(381, 282, 85, 21);
        getContentPane().add(btnSimular);

        btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        btnLimpiar.setBounds(476, 282, 85, 21);
        getContentPane().add(btnLimpiar);

        JLabel lblPromedioDeResultados = new JLabel("Promedio de Resultados");
        lblPromedioDeResultados.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblPromedioDeResultados.setBounds(381, 331, 315, 27);
        getContentPane().add(lblPromedioDeResultados);

        JLabel lblGananciaNeta = new JLabel("GN: Ganancia Neta (Casa)=");
        lblGananciaNeta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblGananciaNeta.setBounds(381, 368, 173, 13);
        getContentPane().add(lblGananciaNeta);

        textFieldPromedioGN = new JTextField();
        textFieldPromedioGN.setColumns(10);
        textFieldPromedioGN.setBounds(662, 368, 96, 19);
        getContentPane().add(textFieldPromedioGN);

        JLabel lblNumJuegosGanados = new JLabel("NJUEC: Num. de Juegos Ganados (Casa)=");
        lblNumJuegosGanados.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumJuegosGanados.setBounds(381, 399, 271, 13);
        getContentPane().add(lblNumJuegosGanados);

        textFieldPromedioNJUEC = new JTextField();
        textFieldPromedioNJUEC.setColumns(10);
        textFieldPromedioNJUEC.setBounds(662, 397, 96, 19);
        getContentPane().add(textFieldPromedioNJUEC);

        JLabel lblPorcentajeJuegosGanados = new JLabel("PJUEC: Porcentaje Juegos Ganados (Casa)=");
        lblPorcentajeJuegosGanados.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblPorcentajeJuegosGanados.setBounds(381, 428, 273, 13);
        getContentPane().add(lblPorcentajeJuegosGanados);

        textFieldPromedioPJUEC = new JTextField();
        textFieldPromedioPJUEC.setColumns(10);
        textFieldPromedioPJUEC.setBounds(662, 426, 96, 19);
        getContentPane().add(textFieldPromedioPJUEC);

        setVisible(true);
    }

    private void simular() {
        
        modeloTabla.setRowCount(0);

        
        int numSimulaciones = Integer.parseInt(textFieldNSIM.getText());
        int numJuegos = Integer.parseInt(textFieldNJUE.getText());
        int costoJuego = Integer.parseInt(textFieldCJUE.getText());
        int gananciaJugador = Integer.parseInt(textFieldGJUG.getText());

        Random random = new Random();
        int gananciaNetaTotal = 0;
        int juegosGanadosTotal = 0;

        
        for (int i = 1; i <= numSimulaciones; i++) {
            int juegosGanadosSimulacion = simularJuegos(random, numJuegos);
            int gananciaNetaSimulacion = (juegosGanadosSimulacion * gananciaJugador) - (numJuegos * costoJuego);
            double porcentajeGanadosCasa = (double) juegosGanadosSimulacion / numJuegos * 100;

            gananciaNetaTotal += gananciaNetaSimulacion;
            juegosGanadosTotal += juegosGanadosSimulacion;

            modeloTabla.addRow(new Object[]{i, gananciaNetaSimulacion, juegosGanadosSimulacion, porcentajeGanadosCasa});
        }

        double promedioGananciaNeta = (double) gananciaNetaTotal / numSimulaciones;
        int promedioJuegosGanados = juegosGanadosTotal / numSimulaciones;
        double promedioPorcentajeGanados = (double) juegosGanadosTotal / (numSimulaciones * numJuegos) * 100;

        
        textFieldPromedioGN.setText(String.format("%.2f", promedioGananciaNeta));
        textFieldPromedioNJUEC.setText(String.valueOf(promedioJuegosGanados));
        textFieldPromedioPJUEC.setText(String.format("%.2f", promedioPorcentajeGanados));
    }

    private void limpiar() {
        textFieldNSIM.setText("");
        textFieldNJUE.setText("");
        textFieldCJUE.setText("");
        textFieldGJUG.setText("");
        modeloTabla.setRowCount(0);
        textFieldPromedioGN.setText("");
        textFieldPromedioNJUEC.setText("");
        textFieldPromedioPJUEC.setText("");
    }

    public static int simularJuegos(Random random, int numJuegos) {
        int juegosGanados = 0;
        for (int i = 1; i <= numJuegos; i++) {
            int sumaDados = lanzarDados(random);
            if (sumaDados != 7) {
                juegosGanados++;
            }
        }
        return juegosGanados;
    }

    public static int lanzarDados(Random random) {
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        return dado1 + dado2;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Dado().setVisible(true));
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Vista principal implementada con Swing.
 */
public class VistaMenu extends JFrame {
    private ControllerMenu controller;
    private JButton btnCrear;
    private JButton btnListar;
    private JButton btnSalir;
    private JTextArea areaSalida;

    public VistaMenu() {
        super("Sistema de Investigaciones");
        initComponents();
    }

    public void setController(ControllerMenu controller) {
        this.controller = controller;
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        btnCrear = new JButton("Crear colaborador");
        btnListar = new JButton("Listar colaboradores");
        btnSalir = new JButton("Salir");

        areaSalida = new JTextArea();
        areaSalida.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaSalida);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBotones.add(btnCrear);
        panelBotones.add(btnListar);
        panelBotones.add(btnSalir);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelBotones, BorderLayout.NORTH);
        getContentPane().add(scroll, BorderLayout.CENTER);

        // Listeners que delegan al controlador
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller != null) controller.abrirCrear();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller != null) controller.listarColaboradores();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller != null) controller.salir();
            }
        });
    }

    public void mostrarMensaje(String mensaje) {
        areaSalida.append(mensaje + "\n");
    }

    public void actualizarLista(ArrayList<Colaborador> colaboradores) {
        areaSalida.setText("");
        if (colaboradores.isEmpty()) {
            areaSalida.setText("No hay colaboradores registrados.\n");
            return;
        }
        for (Colaborador c : colaboradores) {
            areaSalida.append(c.toString() + "\n");
        }
    }
}

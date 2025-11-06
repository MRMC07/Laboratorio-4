import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Diálogo para crear un nuevo colaborador.
 */
public class VistaCrear extends JDialog {
    private ControllerCrear controllerCrear;
    private ControllerMenu controllerMenu;

    private JTextField tfNombre;
    private JTextField tfApellido;
    private JTextField tfNacionalidad;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public VistaCrear(JFrame parent, ControllerCrear controllerCrear, ControllerMenu controllerMenu) {
        super(parent, "Crear colaborador", true);
        this.controllerCrear = controllerCrear;
        this.controllerMenu = controllerMenu;
        initComponents();
    }

    private void initComponents() {
        setSize(350, 220);
        setLocationRelativeTo(getParent());
        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(3, 2, 8, 8));
        form.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        form.add(new JLabel("Nombre:"));
        tfNombre = new JTextField();
        form.add(tfNombre);

        form.add(new JLabel("Apellido:"));
        tfApellido = new JTextField();
        form.add(tfApellido);

        form.add(new JLabel("Nacionalidad:"));
        tfNacionalidad = new JTextField();
        form.add(tfNacionalidad);

        add(form, BorderLayout.CENTER);

        JPanel botones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        botones.add(btnCancelar);
        botones.add(btnGuardar);
        add(botones, BorderLayout.SOUTH);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardar();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void guardar() {
        String nombre = tfNombre.getText().trim();
        String apellido = tfApellido.getText().trim();
        String nacionalidad = tfNacionalidad.getText().trim();

        if (nombre.isEmpty() || apellido.isEmpty() || nacionalidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        controllerCrear.crearColaborador(nombre, apellido, nacionalidad);
        JOptionPane.showMessageDialog(this, "Colaborador agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        dispose();

        // Actualizar la lista en la vista principal
        controllerMenu.listarColaboradores();
    }
}


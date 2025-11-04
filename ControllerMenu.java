import javax.swing.SwingUtilities;
import java.util.ArrayList;

/**
 * Controller principal adaptado a la interfaz Swing.
 */
public class ControllerMenu {
    private VistaMenu vistaMenu;
    private ArrayList<Colaborador> colaboradores;
    private ControllerCrear controllerCrear;

    public ControllerMenu(VistaMenu vistaMenu) {
        this.vistaMenu = vistaMenu;
        this.vistaMenu.setController(this);

        colaboradores = new ArrayList<>();
        controllerCrear = new ControllerCrear(colaboradores);

        // Mostrar la interfaz en el hilo de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vistaMenu.setVisible(true);
            }
        });
    }

    // Abre el diálogo para crear un colaborador
    public void abrirCrear() {
        VistaCrear dialog = new VistaCrear(vistaMenu, controllerCrear, this);
        dialog.setVisible(true);
    }

    // Actualiza la lista mostrada en la vista
    public void listarColaboradores() {
        vistaMenu.actualizarLista(colaboradores);
    }

    public void salir() {
        vistaMenu.mostrarMensaje("Saliendo del sistema...");
        System.exit(0);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerMenu {
    private VistaMenu vistaMenu;
    private ArrayList<Colaborador> colaboradores;
    private ArrayList<Investigacion> investigaciones; // se deja lista
    private ControllerCrear controllerCrear;

    public ControllerMenu(VistaMenu vistaMenu) {
        this.vistaMenu = vistaMenu;
        this.vistaMenu.setController(this);

        colaboradores = new ArrayList<>();
        investigaciones = new ArrayList<>();
        controllerCrear = new ControllerCrear(colaboradores);

        ejecutarMenu();
    }

    private void ejecutarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            vistaMenu.mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> controllerCrear.nuevaInvestigacion();
                case 2 -> listarColaboradores();
                case 3 -> vistaMenu.mostrarMensaje("Saliendo del sistema...");
                default -> vistaMenu.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 3);
    }

    private void listarColaboradores() {
        vistaMenu.mostrarMensaje("\n--- Lista de colaboradores ---");
        if (colaboradores.isEmpty()) {
            vistaMenu.mostrarMensaje("No hay colaboradores registrados.");
        } else {
            for (Colaborador c : colaboradores) {
                vistaMenu.mostrarMensaje(c.toString());
            }
        }
    }
}

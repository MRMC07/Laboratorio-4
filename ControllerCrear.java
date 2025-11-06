import java.util.ArrayList;

/**
 * Controller para crear colaboradores. Provee métodos que pueden ser usados
 * por la interfaz gráfica para agregar nuevos colaboradores a la lista.
 */
public class ControllerCrear {
    private ArrayList<Colaborador> colaboradores;

    public ControllerCrear(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    // Método usado por la GUI para crear un colaborador
    public void crearColaborador(String nombre, String apellido, String nacionalidad) {
        Colaborador nuevo = new Colaborador(nombre, apellido, nacionalidad);
        colaboradores.add(nuevo);
    }

    // Mantener método de consola por compatibilidad si alguien lo usa
    @Deprecated
    public void nuevaInvestigacion() {
        System.out.println("Use crearColaborador(nombre, apellido, nacionalidad) para la GUI.");
    }
}


public class Colaborador {
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Colaborador(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public void publicarInvestigacion() {
        System.out.println(nombre + " " + apellido + " ha publicado una nueva investigación.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + nacionalidad + ")";
    }
}
 

public class Lector extends Colaborador {
    private int id;

    public Lector(int id, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.id = id;
    }

    public void leerInvestigacion() {
        System.out.println("El lector " + getNombre() + " está leyendo una investigación.");
    }

    public void comentarTarjeta() {
        System.out.println("El lector " + getNombre() + " ha comentado una tarjeta.");
    }

    public void revisarTarjeta() {
        System.out.println("El lector " + getNombre() + " está revisando una tarjeta.");
    }
}


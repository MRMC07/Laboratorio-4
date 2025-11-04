import java.util.ArrayList;

public class Investigacion {

    private int id;
    private String autor;
    private int fecha;
    private ArrayList<Tarjetas> tarjetas;

    public Investigacion(int id, String nombre, int fecha){
        //Constructor
        this.id = id;
        this.autor = nombre;
        this.fecha = fecha;
    }

    public void  obtenerResumen(){

    }

    public void agregarEtiqueta(Etiquetas etiqueta){

    }


}

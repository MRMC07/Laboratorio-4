public class Etiquetas implements Etiquetador{

    private String titulo;
    private String descripcion;
    private String disciplina;

    public Etiquetas(String titulo, String descripcion, String disciplina){
        //Constructor
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.disciplina = disciplina;
    }

    public void describir(){

    }

    public void obtenerDescripcionesRelacionadas(){
        
    }

    @Override
    public void asignar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignar'");
    }

    @Override
    public void desagrupar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desagrupar'");
    }

    @Override
    public void usuarioCreador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'usuarioCreador'");
    }
    
}

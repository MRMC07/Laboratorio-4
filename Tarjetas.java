public class Tarjetas implements Etiquetador{

    private String titulo;
    private String tipo;
    private String imagen;
    private String audio;
    private String datos;

    public Tarjetas(String titulo, String tipo, String imagen, String audio, String datos){
        //Constructor
        this.tipo = titulo;
        this.tipo = tipo;
        this.imagen = imagen;
        this.audio = audio;
        this.datos = datos;
    }

    public void aparecer(){

    }

    public void interactuar(){

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

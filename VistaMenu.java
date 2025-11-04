public class VistaMenu {
    private ControllerMenu controller;

    public void setController(ControllerMenu controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Crear colaborador");
        System.out.println("2. Listar colaboradores");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

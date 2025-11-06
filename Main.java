public class Main {
    public static void main(String[] args) {
        // Iniciar la interfaz gráfica
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VistaMenu vistaMenu = new VistaMenu();
                ControllerMenu controller = new ControllerMenu(vistaMenu);
            }
        });
    }
}

package app;

import controlador.Controlador;

/**
 * Clase principal que arranca la aplicación.
 *
 * @author Sergio
 */
public class Main {
    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Controlador sim = new Controlador();
        sim.iniciar();
    }
}

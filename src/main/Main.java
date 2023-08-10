package main;

import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();  // Creamos la ventana
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura el cierre del programa cuando pulsamos la X
        window.setResizable(false);  // Bloquea la posibilidad de ajustar el tamaño de la pantalla
        window.setTitle("Viajando por Los Rosales");  // Settea el nombre de la pestaña

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();  // Empaqueta todo para que quepa en la ventana

        window.setLocationRelativeTo(null);  // Ubica en el centro de la pantalla la pestaña
        window.setVisible(true);  // Hace la pestaña visible

        gamePanel.startGameThread();  // Inicia el hilo de ejecución
    }
}

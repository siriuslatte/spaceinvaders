/* Package */
package logic.game.window;

/* Imports */
import logic.constants.Constants;
import javax.swing.*;
import java.awt.*;

/* Class */
public class Frame {
    /* Creates the new frame */

    public Frame() {
        JFrame window = new JFrame("Space-invaders");
        window.setSize(Constants.windowWidth, Constants.windowHeight);
        window.setLocationRelativeTo(null); // Center
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setAlwaysOnTop(true);

        System.out.println("Made frame!");

        Scenario scene = new Scenario();
        window.setContentPane(scene);

        System.out.println("Made panel!");

        window.setVisible(true);
    }

    static class Scenario extends JPanel {
        /* Initialises the current game scene with the enemies and much more! */

        // Doesn't need to be public as it is only gonna be accessed from this class itself!
        Scenario() {
            super();
        }

        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);

            /* Background scenario */
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, Constants.windowWidth, Constants.windowHeight);

            graphics.setColor(Color.BLACK);
            graphics.fillRect(30, 530, 535, 5);
        }
    }
}

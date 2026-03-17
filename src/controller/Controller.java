package controller;
<<<<<<< Updated upstream
import services.ServiceFoule;
=======

import java.util.ArrayList;

import models.Humain;

>>>>>>> Stashed changes
/**
 * Controller de l'application. Fait la lisaison entre les différents services et vues. 
 * @version 1.0.0
 * @author Aurélien Chanez
 * @since 17-03-2026
 */
public class Controller {
    private static Controller controller;
<<<<<<< Updated upstream
    private ServiceFoule serviceFoule;
=======
    private ArrayList<Humain> humains;
>>>>>>> Stashed changes

    private Controller() {
        
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public void start() {
        
    }

    public void afficherMessage() {

    }

    public void supprimerPersonne() {

    }

    public void ajouterPersonne() {

    }

    
}

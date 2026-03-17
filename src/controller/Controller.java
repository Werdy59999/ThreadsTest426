package controller;
import java.util.ArrayList;

import view.Ihm;
import models.Humain;
import services.ServiceFoule;
/**
 * Controller de l'application. Fait la lisaison entre les différents services et vues. 
 * @version 1.0.0
 * @author Aurélien Chanez
 * @since 17-03-2026
 */
public class Controller {
    private static Controller controller;
    private static Ihm view;

    private ArrayList<Humain> foules;

    private Controller() {
        foules = ServiceFoule.genererFoule(20);
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public void start() {
        
    }

    public void afficherMessage(String message) {
        view.afficher(message);
    }

    public void supprimerPersonne() {

    }

    public void ajouterPersonne() {

    }

    public ArrayList<Humain> getFoules() {
        return foules;
    }
}

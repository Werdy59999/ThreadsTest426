package services;

import java.util.ArrayList;

import models.Humain;

/**
 * @version 1.0.0
 * @author Dylan Cardoso
 * @since 17.03.2026
 */
public class ServiceFoule {
    
    public static ArrayList<Humain> genererFoule(int taille) {
        ArrayList<Humain> humains = new ArrayList<>();
        for (int i = 0; i < taille; i++) {
            humains.add(new Humain(( int ) ((Math.random() * (88 + 1)) - 16), "Humain [" + i + "]"));
        }
        return humains;
    }
}

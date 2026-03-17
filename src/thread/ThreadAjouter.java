package thread;

import java.util.ArrayList;

import controller.Controller;

import models.Humain;

public class ThreadAjouter extends Thread {

    public final int MAX = 100;
    public final int MIN = 10;

    public ThreadAjouter() {
        super();
    }

    @Override
    public void run() {
        while (true) {
            ArrayList<Humain> humain = Controller.getInstance().getFoules();
            int age = ( int ) ( Math.random() * ( MAX – MIN + 1 ) ) + MIN;
            //humain.add(new Humain(, getName()))
        }
    }
}

package view;

/**
 * @version 1.0.0
 * @author Christopher Colleran
 * @since 17.03.2026
 */ 
import controller.Controller;

public class Ihm {

    private Controller refCtrl;

    public Ihm() {
        this.refCtrl = null;
    }

    public void afficher(String message) {
        System.out.println("============================\n" + message + "\n============================");
    }

    public Controller getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl(Controller refCtrl) {
        this.refCtrl = refCtrl;
    }
}


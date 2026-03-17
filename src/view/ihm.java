package view;

public class Ihm {

    private Ctrl refCtrl;

    public Ihm() {
        this.refCtrl = null;
    }

    public void afficher(String message) {
        System.out.println("============================\n" + message + "\n============================");
    }

    public Ctrl getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl(Ctrl refCtrl) {
        this.refCtrl = refCtrl;
    }
}


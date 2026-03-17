package view;

public class Ihm {

    private Ctrl refCtrl;

    public Ihm() {
        this.refCtrl = null;
    }

    public void afficher(String message) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println(message);
            }
        });
    }

    public Ctrl getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl(Ctrl refCtrl) {
        this.refCtrl = refCtrl;
    }

}


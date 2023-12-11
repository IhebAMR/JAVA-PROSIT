package tn.esprit.gestionzoo.entities;

public class Penguin extends Terrestrial {
    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(int nbrLegs, float swimmingDepth) {
        this.nbrLegs = nbrLegs;
        this.swimmingDepth = swimmingDepth;
    }
}
package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Helicoptere extends Vehicule {

    public Helicoptere() {
        super();
        ref = "H-" + ++idIndex;
		this.roule = false;
		this.vole = true;
		this.navigue = false;
    }

    public void seDeplace(Point destination) {
    	seDeplace(destination,"helicoptere");
    }
}

package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Moto extends Vehicule {

    public Moto() {
    	super();
        ref = "M-" + ++idIndex;
		this.roule = true;
		this.vole = false;
		this.navigue = false;
    }

    public void seDeplace(Point destination) {
    	seDeplace(destination,"moto");
    }
}

package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Bateau extends Vehicule {

    public Bateau() {
    	super();
        ref = "B-" + ++idIndex;
		this.roule=false;
		this.vole = false;
		this.navigue = true;
    }

    public void seDeplace(Point destination) {
    	seDeplace(destination,"bateau");
    }
}

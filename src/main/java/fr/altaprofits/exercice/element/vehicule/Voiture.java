package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Voiture extends Vehicule  {

    public Voiture() {
    	super();
        ref = "V-" + ++idIndex;
		this.roule = true;
		this.vole = false;
		this.navigue = false;
    }

    public void seDeplace(Point destination) {
    	seDeplace(destination,"voiture");
    }
}

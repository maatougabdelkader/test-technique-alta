package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Hydravion extends Vehicule {
	
	public Hydravion() {
		super();
		ref = "HA-" + ++idIndex;
		this.roule = false;
		this.vole = true;
		this.navigue = true;
	}

    public void seDeplace(Point destination) {
    	seDeplace(destination,"hydravion");
    }
}

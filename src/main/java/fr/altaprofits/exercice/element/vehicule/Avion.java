package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class Avion extends Vehicule {
	
	public Avion() {
		super();
		ref = "A-" + ++idIndex;
		this.roule=false;
		this.vole = true;
		this.navigue = false;
	}

    public void seDeplace(Point destination) {
    	seDeplace(destination,"avion");
    }
}

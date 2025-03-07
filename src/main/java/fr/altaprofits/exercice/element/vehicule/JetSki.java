package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;

public class JetSki extends Vehicule {

    public JetSki() {
       super();
       ref = "J-" + ++idIndex;
		this.roule = false;
		this.vole = false;
		this.navigue = true;
    }

    public void seDeplace(Point destination) {
    	seDeplace(destination,"jet-ski");
    }
}

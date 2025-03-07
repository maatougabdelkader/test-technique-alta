package fr.altaprofits.exercice.structures;

import fr.altaprofits.exercice.element.Element;

public class Hangar extends InfraStructure {
	// Contient tous les vehicules

	public void entre(Element v) {
		list.add(v);
	}

	public long nombreDeVehiculesDansAeroport() {
		return countElements("Avion", "Helicoptere");
	}

	public long nombreDeVehiculesDansGarage() {
		return countElements("Moto", "Voiture");
	}

	public long nombreDeVehiculeDansPort() {
		return countElements("Bateau", "JetSki", "Hydravion");
	}

	public int nombreDeVehiculeDansHangar() {
		return list.size();
	}


}

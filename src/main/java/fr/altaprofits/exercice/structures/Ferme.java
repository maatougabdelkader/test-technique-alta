package fr.altaprofits.exercice.structures;

import fr.altaprofits.exercice.element.animal.Animal;

public class Ferme extends InfraStructure {

	// Contient tous les animaux

	public void entre(Animal a) {
		list.add(a);
	}

	public long nombreOiseauxDansFerme() {
		return countElements("Oiseau");
	}

	public long nombreAnimauxTerrestreDansFerme() {
		return countElements("AnimalTerrestre");
	}

	public long nombreAnimauxDansFerme() {
		return list.size();
	}

}

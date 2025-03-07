package fr.altaprofits.exercice.element.animal;

public class Oiseau extends Animal {

	public Oiseau(boolean marin) {
		super();
		ref = "Oiseau-" + ++idIndex;

		this.navigue = marin ? true : false;
		this.vole = true;
		this.roule = true;
	}

}

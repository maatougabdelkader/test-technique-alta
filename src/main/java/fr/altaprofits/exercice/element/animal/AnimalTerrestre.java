package fr.altaprofits.exercice.element.animal;

public class AnimalTerrestre extends Animal {
	
	public AnimalTerrestre() {
		super();
        ref = "Terrestre-" + ++idIndex;
        this.navigue = false;
        this.roule = true;
        this.vole = false;
	}

}

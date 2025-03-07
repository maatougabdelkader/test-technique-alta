package fr.altaprofits.exercice.element.animal;

import fr.altaprofits.exercice.element.Element;

public class Animal extends Element {

	@Override
	public String toString() {
		return "Animal de type : " + this.getClass().getSimpleName() + " et de Ref : " + this.getRef();
	}

}

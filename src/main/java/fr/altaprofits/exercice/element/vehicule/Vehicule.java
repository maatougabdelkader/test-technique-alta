package fr.altaprofits.exercice.element.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.element.Element;

public class Vehicule extends Element {

	private Point position;

	public Vehicule() {
		super();
		setPosition(new Point(0, 0));
	}

	public void seDeplace(Point destination, String type) {

		System.out.printf("vehicule de type %s (Ref : %s), se deplace de la position %s vers %s\n", type, getRef(),
				getPosition(), destination);
		setPosition(destination);
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Vehicule de type : " + this.getClass().getSimpleName() + " et de Ref :" + this.getRef();
	}

}

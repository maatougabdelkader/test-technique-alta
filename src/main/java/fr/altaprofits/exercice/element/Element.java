package fr.altaprofits.exercice.element;

public class Element {

	protected static Integer idIndex = 0;
	
	protected String ref;
	
	protected boolean roule;

	protected boolean vole;

	protected boolean navigue;

	public Element() {
		ref = "";
	}

	public static Integer getIdIndex() {
		return idIndex;
	}

	public String getRef() {
		return ref;
	}

	public boolean isRoule() {
		return roule;
	}

	public void setRoule(boolean roule) {
		this.roule = roule;
	}

	public boolean isVole() {
		return vole;
	}

	public void setVole(boolean vole) {
		this.vole = vole;
	}

	public boolean isNavigue() {
		return navigue;
	}

	public void setNavigue(boolean navigue) {
		this.navigue = navigue;
	}

}

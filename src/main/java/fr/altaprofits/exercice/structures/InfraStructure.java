package fr.altaprofits.exercice.structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;

import fr.altaprofits.exercice.element.Element;

public class InfraStructure {
	
	protected HashSet<Element> list = new HashSet<>();

	
	private void imprimerDansConsole(Element v) {
		System.out.println(v);
	}

	private void imprimerDansFichier(Element a, File f) throws FileNotFoundException {
		try (PrintStream printStream = new PrintStream(new FileOutputStream(f))) {
			printStream.println("Vehicule de type " + a.getClass().getSimpleName());
			printStream.println(a);
		}
	}

	public void imprimerToutDansConsole() {
		for (Element v : list)
			imprimerDansConsole(v);

	}

	public void imprimerToutDansFichier(File f) throws FileNotFoundException {
		for (Element a : list)
			imprimerDansFichier(a, f);

	}
	
	protected long countElements(String ... types) {
		long count = 0; 
		for (String type : types) {
			count = count +
					list.stream().filter(o -> {
						return o.getClass().getSimpleName().equals(type) ;
					}).count();
		}
		return count;
	}

	public long nombreElementNavigant() {
		return list.stream().filter(o -> {
			return o.isNavigue();
		}).count();

	}

	public long nombreElementVolant() {
		return list.stream().filter(o -> {
			return o.isVole();
		}).count();

	}

	public long nombreElementRoulant() {
		return list.stream().filter(o -> {
			return o.isRoule();
		}).count();

	}

}

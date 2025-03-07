package fr.altaprofits.exercice;

import fr.altaprofits.exercice.element.animal.AnimalTerrestre;
import fr.altaprofits.exercice.element.animal.Oiseau;
import fr.altaprofits.exercice.element.vehicule.Avion;
import fr.altaprofits.exercice.element.vehicule.Helicoptere;
import fr.altaprofits.exercice.element.vehicule.Hydravion;
import fr.altaprofits.exercice.element.vehicule.JetSki;
import fr.altaprofits.exercice.element.vehicule.Moto;
import fr.altaprofits.exercice.structures.Ferme;
import fr.altaprofits.exercice.structures.Hangar;

public class Application {
    public static void main(String[] args) {
        Hangar hangar = new Hangar();
        Ferme ferme = new Ferme();

        Moto moto1 = new Moto();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Helicoptere helico1 = new Helicoptere();
        JetSki jetSki1 = new JetSki();

        hangar.entre(moto1);
        hangar.entre(avion1);
        hangar.entre(avion2);
        hangar.entre(helico1);
        hangar.entre(jetSki1);

        //ajouter un hydravion à l'hangar
        Hydravion hydravion = new Hydravion();
        hangar.entre(hydravion);

        hangar.imprimerToutDansConsole();

        System.out.println("Nombre de vehicule dans le hangar : " + hangar.nombreDeVehiculeDansHangar());
        System.out.println("Nombre de vehicule dans l'aeroport : " + hangar.nombreDeVehiculesDansAeroport());
        System.out.println("Nombre de vehicule dans le garage : " + hangar.nombreDeVehiculesDansGarage());
        System.out.println("Nombre de vehicule dans le port : " + hangar.nombreDeVehiculeDansPort());

        avion1.seDeplace(new Point(10, 30));
        avion1.seDeplace(new Point(30, 60));
        avion2.seDeplace(new Point(25, 55));
        helico1.seDeplace(new Point(23, 11));
        jetSki1.seDeplace(new Point(3, 9));

		// ajouter des animaux à la ferme
		Oiseau canard = new Oiseau(true);
		ferme.entre(canard);
		AnimalTerrestre  cheval = new AnimalTerrestre();
		ferme.entre(cheval);
		
		//imprimer les occupants de la ferme
		ferme.imprimerToutDansConsole();
		
		//imprimer les occupants de la ferme par type
		System.out.println("Nombre d'animaux dans la femre : " + ferme.nombreAnimauxDansFerme());
		System.out.println("Nombre d'animaux terrestres dans la femre : " + ferme.nombreAnimauxTerrestreDansFerme());
		System.out.println("Nombre d'oiseaux dans la femre : " + ferme.nombreOiseauxDansFerme());
        
		// Recenser les element dans nos infrastructure pouvant voler, rouler et naviguer
		// on devrait pour compter:
		// 3 roulant -> 1 moto, 1 cheval et 1 canard
		// 5 volant -> 2 avions, 1 helicoptere, 1 hyravion et 1 canard
		// 3 navigant -> 1 jet-ski, 1 hyravion et 1 canard
		System.out.println("Nombre d'element de la femre  pouvant rouler: "  +  (hangar.nombreElementRoulant() + ferme.nombreElementRoulant()));
		System.out.println("Nombre d'element de la femre  pouvant voler: "  + (hangar.nombreElementVolant()+ ferme.nombreElementVolant()));
		System.out.println("Nombre d'element de la femre  pouvant naviguer: "  + (hangar.nombreElementNavigant()  + ferme.nombreElementNavigant()));
		
		
		
        
        
    }
}

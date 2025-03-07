**Clés de la nouvelle refactorisation :**
- Créations d'une nouvelle super-classe `Infrastructure` pour regrouper le Fonctionnalité commune aux classes `Hangar` et `Ferme`

- Créations deux nouvelles super-classes `Vehicule` qui regroupe les fonctionnalités communes aux véhicules (avion, moto ...) et `Animal` qui regroupe la sous Classe `Oiseau` (pour animaux volant) et `AnimalTerrestre` pour animaux rompant) c’est deux Classe héritent d'une superclasse `Elment` pour implanter la logique de type de mouvement
# Exercice Altaprofits
Nous disposons d'un hangar comprenant plusieurs sections pouvant accueillir différents types de véhicules : avions, hélicoptères, bateaux, jet-skis, voitures et motos.

### Spécifications fonctionnelles du hangar :

- Permettre l'entrée d'un véhicule dans une section spécifique.
- Retourner le nombre total de véhicules présents dans le hangar.
- Retourner le nombre de véhicules dans la section **aéroport** (avions, hélicoptères).
- Retourner le nombre de véhicules dans la section **port** (bateaux, jet-skis).
- Retourner le nombre de véhicules dans la section **garage** (voitures, motos).
- Afficher dans la console la liste de tous les véhicules présents dans le hangar.
- Exporter cette même liste de véhicules dans un fichier.


### Spécifications fonctionnelles des véhicules :
- Chaque véhicule doit avoir un ID unique.
- Tous les véhicules doivent être capables de se déplacer.

### Travail demandé :

Dans le cadre de la préparation de notre entretien, nous vous transmettons un code accompagné de ses spécifications.
Ce code, bien qu'élémentaire, vise à répondre aux spécifications fonctionnelles. Toutefois, nous estimons qu'il est imparfait dans sa conception.

Nous vous invitons dans un premier temps à proposer une version améliorée de ce code.

Une fois le refactoring réalisé, nous vous demandons d'implémenter les fonctionnalités suivantes :
- Ajouter la prise en charge d'un nouveau type de véhicule dans le hangar : l'**hydravion**.
- Nous souhaitons également gérer une **ferme**, capable d'accueillir des animaux, y compris des oiseaux et d'autres animaux pouvant se déplacer sur l'eau.
- Enfin, nous aimerions pouvoir recenser, dans notre environnement (ferme + hangar), le nombre d'éléments capables de voler, rouler et naviguer.



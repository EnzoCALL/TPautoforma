package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
        /*
        • Créer une classe AffichagePartiel
        • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        • Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        • Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant
             aux index pairs
        • Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        */

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.print("\nEntiers du tableau supérieurs à 3:        ");
        for (int i=0; i < array.length; i++) {
            if (array[i] > 3)
                System.out.print(array[i] + ", ");
        }

        System.out.print("\nEntiers du tableau qui sont pairs:        ");
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + ", ");
        }

        System.out.print("\nEntiers du tableau qui sont impairs:      ");
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                System.out.print(array[i] + ", ");
        }

        System.out.print("\n\nEntiers du tableau qui sont enregistrés dans un index pair:        ");
        for (int i=0; i < array.length; i++) {
            if (i % 2 == 1)
                System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
    }
}

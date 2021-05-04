package fr.algorithmie;

public class RechercheMax {

    public static void main(String[] args) {
        /*
        • Créer une classe RechercheMax
        • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • Rechercher le plus grand élément du tableau
        */

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int k = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] > k)
                k = array[i];
        }

        System.out.println("\n \nLe plus grand élement du tableau est: " + k);

    }
}

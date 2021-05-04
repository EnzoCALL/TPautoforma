package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {
        /*
        • Créer une classe ComparaisonTableau
        • Soit les tableaux suivants :
        o int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4}
        o int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        • Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2
        tableaux
        */

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int compteur = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2.length; k++)
                if (array1[i] == array2[k])
                    compteur = compteur + 1;
        }

        System.out.println("Il y a " + compteur + " nombre(s) en commun dans les deux listes. \n");
    }
}

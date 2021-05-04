package fr.algorithmie;

public class SommeDeTableaux {

    public static void main(String[] args) {
        /*
        • Créer une classe SommeDeTableaux
        • {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        • Créer un tableau qui contient la somme des 2 précédents tableaux
        */

        int[] sujet1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] sujet2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int taille = 0;
        if (sujet1.length > sujet2.length)
            taille = sujet1.length;
        else
            taille = sujet2.length;

        int[] somme = new int [taille];

        for (int i=0; i < somme.length; i++) {
            somme[i] = sujet1[i] + sujet2[i];
        }
        System.out.print("\nVerification des valeurs de la somme des tableaux:    ");
        for (int i=0; i < somme.length; i++) {
            System.out.print(somme[i] + ", ");
        }
        System.out.println("\n");
    }
}

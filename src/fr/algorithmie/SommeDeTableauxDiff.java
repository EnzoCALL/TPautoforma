package fr.algorithmie;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {
        /*
        • Créer une classe SommeDeTableauxDiff
        • {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        • Créer un tableau qui contient la somme des 2 précédents tableaux
        */

        int[] sujet1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] sujet2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int temp = 0;
        int[] plusgrand = new int [temp];
        int[] pluspetit = new int [temp];

        if (sujet1.length > sujet2.length) {
             plusgrand = new int [sujet1.length];
             pluspetit = new int [sujet2.length];
             for (int i=0; i < plusgrand.length; i++)
                plusgrand[i] = sujet1[i];
             for (int i=0; i < pluspetit.length; i++)
                pluspetit[i] = sujet2[i];
        }
        else {
            plusgrand = new int[sujet2.length];
            pluspetit = new int[sujet1.length];
            for (int i = 0; i < plusgrand.length; i++)
                plusgrand[i] = sujet2[i];
            for (int i = 0; i < pluspetit.length; i++)
                pluspetit[i] = sujet1[i];
        }

        for (int i=0; i < pluspetit.length; i++) {
            plusgrand[i] = plusgrand[i] + pluspetit[i];
        }
        System.out.print("\nVerification des valeurs de la somme des tableaux:    ");
        for (int i=0; i < plusgrand.length; i++) {
            System.out.print(plusgrand[i] + ", ");
        }
        System.out.println("\n");
    }
}

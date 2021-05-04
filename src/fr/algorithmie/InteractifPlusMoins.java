package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        /*
        Créer une classe InteractifPlusMoins
        Ecrire un jeu qui :
        - choisit un nombre aléatoire entre 1 et 100
        - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou
          en dessous du nombre,
        - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez
          trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
        - le programme se termine.
        */

        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        int choix = 0;
        int trial = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEssayes de trouver le nombre, il est choisit aléatoirement entre 1 et 100! \nBonne chance à toi!");
        boolean acces = false;

        while (acces == false)
        {
            choix = scan.nextInt();

            if (choix == result)
                acces = true;
            else {
                if (choix > result){
                acces = false;
                System.out.println("C'est moins!");
                trial = trial +1; }
                else {
                    acces = false;
                System.out.println("C'est plus!");
                trial = trial +1; }

            }
        }
        System.out.println("Felicitation! Tu as trouvé le nombre " + result + "! \nNombre d'essais: " + trial);
    }
}

package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select = 0;
        int chiffre = 0;
        int[] tab = {chiffre};
        boolean acces = false;



        while (acces == false) {
            System.out.println("\n1--- Ajouter un nombre. \n2--- Afficher les nombres existants.\n3--- Sortir de l'application.");
            int choix = scan.nextInt();

            if (choix == 1)
            {
                System.out.println("Saisissez le nombre à rentrer dans le tableau: ");
                chiffre = scan.nextInt();
                tab[select] = chiffre;
                tab = Arrays.copyOf(tab, tab.length+1);
                select = select +1;
            }
            else
                if (choix == 2)
                {
                    System.out.println("Voici le tableau actuel: ");
                    for (int i = 0; i < tab.length; i++)
                        System.out.print(tab[i] + ", ");
                }
                else
                    if (choix ==3) {
                        System.out.println("L'application s'arrête.");
                        acces = true;
                    }
                    else
                        System.out.println("Je n'ai pas compris votre demande.");
        }
    }
}

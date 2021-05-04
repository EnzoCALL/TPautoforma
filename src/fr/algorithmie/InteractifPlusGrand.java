package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {
        /*
        Créer une classe InteractifPlusGrand
        Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
        ces nombres.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez 10 nombres: ");

        int[] nume = new int[10];
        int phine = 0;

        for (int i=0; i < nume.length; i++)
        {
            nume[i] = scan.nextInt();
            if (nume [i] > phine)
                phine = nume[i];
        }

        System.out.println("Le numéro le plus grand des 10 nombres sélectionnés est: " + phine);

    }
}

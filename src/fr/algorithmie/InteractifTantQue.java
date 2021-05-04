package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {
        /*
        Créer une classe InteractifTantQue
        Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
        compris entre 1 et 10 :
        - Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
          nombre à l’utilisateur.
        - Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
        */

        Scanner scan= new Scanner(System.in);
        boolean acces = false;
        int nombre = 0;

            while (acces == false)
            {
                System.out.print("Ecrivez un chiffre compris entre 1 et 10: ");
                nombre = scan.nextInt();

                if (nombre >= 1 && nombre <= 10)
                    acces = true;
                else {
                    acces = false;
                    System.out.print("Votre nombre n'est pas compris entre 1 et 10, veuillez recommencer. ");
                }
            }

        System.out.println("Le nombre écrit est: " + nombre);



    }
}

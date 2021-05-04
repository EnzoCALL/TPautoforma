package fr.algorithmie;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        /*
       Créer une classe InteractifTableMult
       Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
       10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
       multiplication de ce nombre.
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

        int result = 0;

        for (int i = 0; i < 11 ; i++) {
            result = nombre * i;
            System.out.println(nombre + " + " + i + " = " + result);
        }
    }
}

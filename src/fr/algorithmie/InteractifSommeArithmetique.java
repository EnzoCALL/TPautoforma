package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {
        /*
        Créer une classe InteractifSommeArithmetique
        Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
        entiers compris entre 1 et ce nombre.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un nombre: ");
        int nombre = scan.nextInt();

        int d = 0;

        for (int i = 0; i < nombre +1; i++) {
            d = d + i;
        }

        System.out.println("Le nombre selectionné est le: " + nombre + "\nLa somme arithmetique de ce nombre est: " + d);
    }
}

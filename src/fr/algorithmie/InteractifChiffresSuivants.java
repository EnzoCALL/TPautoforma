package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {
        /*
        Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres
        suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13,
        14, 15.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un nombre: ");
        int nombre = scan.nextInt();

        System.out.println("Le nombre selectionné est le: " + nombre + "\nLes 10 nombres suivants " + nombre + " sont: ");

        for (int i = nombre+1; i < nombre + 11; i++) {
                        System.out.print(i + ", ");
        }
    }
}

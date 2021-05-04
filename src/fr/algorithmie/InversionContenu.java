package fr.algorithmie;

public class InversionContenu {

    public static void main(String[] args) {
        /*
        • Créer une classe InversionContenu
        • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        • Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
          dans l’ordre inverse.
        • Afficher l’ensemble des éléments des 2 tableaux
        */

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        int k = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            k = array.length -1 - i;
            arrayCopy[k] = array[i];
        }


        System.out.println("\nElements du tableau original: ");
        for (int i=0; i < array.length; i++)
            System.out.print(array[i] + ", ");

        System.out.println("\n \nEélements du tableau copié: ");
        for (int i=0; i < arrayCopy.length; i++)
            System.out.print(arrayCopy[i] + ", ");

        System.out.println("\n");
    }
}

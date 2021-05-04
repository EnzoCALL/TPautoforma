package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {
        /*
        • Créer une classe Rotation
        • Dans cette classe, on déclare un tableau d’entiers
        • Effectuez une rotation à droite des éléments.
        • Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
        */

        int[] array = {3, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};
        int[] arrayCopy = new int[array.length];

        for (int i=0; i < array.length; i++)
        {
            arrayCopy[i] = array[i];
        }

        for (int i=1; i < arrayCopy.length; i++)
        {
            array[i] = arrayCopy[i-1];
        }
        array[0] = arrayCopy[arrayCopy.length-1];

        for (int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}

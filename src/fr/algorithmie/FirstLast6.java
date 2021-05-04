package fr.algorithmie;

public class FirstLast6 {

    public static void main(String[] args) {
        /*• Créer une classe FirstLast6
        • Dans cette classe, on déclare un tableau d’entiers
        • On calcule une valeur booléenne qui contrôle le tableau de la sorte :
            o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
              dernier élément vaut 6.
            o elle vaut false dans les autres cas
        • écrire l’algo de valorisation de cette variable avec le minimum de ligne
        */

        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};
        int o = array.length - 1;
        boolean control = false;

        if (array.length != 0)
        {
            if (array[0] == 6 || array[o] == 6)
                control = true;
            else
                control = false;
        }
        else control = false;

        System.out.println(control);
    }
}

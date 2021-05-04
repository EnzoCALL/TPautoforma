package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        /*
        • Créer une classe FirstLast
        • Dans cette classe, on déclare un tableau d’entiers
        • On calcule une valeur booléenne qui contrôle le tableau de la sorte :
            o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
              premier et le dernier élément du tableau ont la même valeur
            o elle vaut false dans les autres cas
        • écrire l’algo de valorisation de cette variable avec le minimum de ligne
        */

        int[] array = {3, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};
        int o = array.length - 1;
        boolean control = false;

        if (array.length >= 1)
        {
            if (array[0] == array[o])
                control = true;
            else
                control = false;
        }
        else control = false;

        System.out.println(control);
    }
}

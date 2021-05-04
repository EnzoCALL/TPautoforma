public class FabriquerMur {
    public static void main(String[] args) {
        /*
        • Copiez la classe FabriquerMur dans votre projet STS
        • Dans cette classe vous devez mettre au point la méthode fabriquerMur
        • Cette méthode doit produire un algorithme qui retourne s’il est possible ou non de
          fabriquer un mur avec des briques de longueur 1 et des briques de longueur 5.
        • Exemples :
            o j’ai 2 briques de longueur 1 et 2 briques de longueur 5, est-il possible de créer un
              mur de 11m ? la réponse est oui, il suffit de prendre 2 briques de 5 et une brique de 1.
            o j’ai 3 briques de longueur 1 et 1 brique de longueur 5, est-il possible de créer un
              mur de 9m ? la réponse est non.

        • Veuillez compléter la méthode fabriquerMur qui prend en paramètres :
            o nbSmall : le nombre de briques de longueur 1
            o nbBig : le nombre de briques de longueur 5
            o longueur : la taille du mur.
        • A l’exécution les méthodes verifier exécutées avec diverses valeurs de paramètres
          permettent de dire si oui ou non votre algorithme fonctionne.
        */

// Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {

        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +

                    longueur + ") NON passant.");

        }
    }
}
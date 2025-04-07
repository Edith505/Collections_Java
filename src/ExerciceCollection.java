import java.util.*;

public class ExerciceCollection {
    public static final int NOMBRE_ITERATIONS = 1000000;


    public void add(Integer... vals) {

    }

    public static void main(String[] args) {

        System.out.println("Initialisation");
        //Construction et initialisation de liste
        {
            //Avec instanciation
            //TODO 1 Créer une liste qui contient les nombres 1, 2 et 3 dans une variable nommée liste1.
            Collection<Integer> liste1 = new ArrayList<>();
            liste1.add(1);
            liste1.add(2);
            liste1.add(3);

            //TODO 2 Afficher le contenu de la variable liste1.
            System.out.println("--------------/ TODO 2 /---------------");
            for (Integer i : liste1) {
                System.out.println(i);
            }
            System.out.println("liste1:" + liste1);

            //TODO 3 Créer une liste2 qui contient les éléments 1,2,3, et 4 à l'aide de la méthode Arrays.asList()
            //( ou List.of())
            System.out.println("--------------/ TODO 3 /---------------");
            Collection<Integer> liste2 = Arrays.asList(1, 2, 3, 4);
            System.out.println("liste2:" + liste2);

            //TODO 4 Essayer d'ajouter un élément à cette liste. Expliquer le résultat?
            System.out.println("--------------/ TODO 4 /---------------");
            System.out.println("liste2.add(5) : échoue avec une UnsupportedOperationException parce que Arrays.asList() retourne une liste de taille fixe." + liste2);

            //Créer une Collection avec une autre Collection
            //TODO 5 Créer une liste3 à partir de l'objet liste1. On peut créer une collection à partir du
            // contenu de n'importe quelle autre collection. Toutes les collections ont un constructeur
            // qui reçoit un object de type Collection en paramètre!
            System.out.println("--------------/ TODO 5 /---------------");
            Collection<Integer> liste3 = new ArrayList<>(liste1);
            System.out.println("liste3:" + liste3);

            //À l'aide d'un tableau statique
            //TODO 6 Créer une liste4 à partir du tableau static suivant en utilisant
            // la méthode asList de la classe utilitaire Arrays voir l'API https://docs.oracle.com/javase/8/docs/api/.
            System.out.println("--------------/ TODO 6 /---------------");
            Integer[] tab = new Integer[]{1, 2, 3};// ATTENTION  : Interger[] et non int[] !!!
            Collection<Integer> liste4 = Arrays.asList(tab);
            System.out.println("liste4:" + liste4);

            //Avec des objets de type Personne
            //TODO 7 Créer une liste5 qui contient 2 instances de Personne.
            System.out.println("--------------/ TODO 7 /---------------");
            Collection<Personne> liste5 = new ArrayList<>();
            liste5.add(new Personne("Rakoto", 1));
            liste5.add(new Personne("Rakoto", 2, 25));
            System.out.println("liste5:" + liste5);

        }
        //ajout d'éléments
        System.out.println("\nAjout dans une collection");
        {
            System.out.println("provenant de Collection");
            {
                Collection<Integer> liste1 = Arrays.asList(1, 2, 3, 4);
                Collection<Integer> liste2 = Arrays.asList(5, 6, 7, 8);
                //TODO 8 Créer une liste3 qui ajoute tous les éléments de liste1 et liste2 puis ajoute le
                // nombre 9
                System.out.println("--------------/ TODO 8 /---------------");
                Collection<Integer> liste3 = new ArrayList<>(liste1);
                liste3.addAll(liste2);
                liste3.add(9);
                System.out.println("liste3:" + liste3);
            }

        }

        //Retrait d'éléments - Collection
        System.out.println("\nRetrait dans une collection");
        {
            Collection<Integer> listeTemp = Arrays.asList(2, 4, 6, 8, 10);
            Collection<Integer> liste1 = new ArrayList<>(listeTemp);
            System.out.println("liste1 avant retrait:" + liste1);

            //TODO 9 Retirer le 2 de la liste 1. Si l'élément a été retiré afficher "L'élément 2 été retiré "
            // sinon afficher "aucun élément n'a été retiré ". Dans les 2 cas afficher la liste1.
            System.out.println("--------------/ TODO 9 /---------------");
            if (liste1.remove(2)) {
                System.out.println("L'élément 2 été retiré");
            } else {
                System.out.println("aucun élément n'a été retiré");
            }
            System.out.println("liste1 après retrait:" + liste1);

            //TODO 10 Retirer le 5 de la liste 1. Si l'élément a été retiré afficher "L'élément 5 été retiré "
            // sinon afficher "aucun élément n'a été retiré ". Dans les 2 cas afficher la liste1.
            System.out.println("--------------/ TODO 10 /---------------");
            if (liste1.remove(5)) {
                System.out.println("L'élément 5 été retiré");
            } else {
                System.out.println("aucun élément n'a été retiré");
            }
            System.out.println("on retire le troisième élément liste1 : " + liste1);

            // on peut vider la collection avec clear
            //TODO 11 vider le contenu de la collection liste1
            System.out.println("--------------/ TODO 11 /---------------");
            liste1.clear();
            System.out.println("liste1 est vide " + liste1);

            //On peut également enlever les éléments d'une collectionqui sont dans une autre collection
            liste1.addAll(Arrays.asList(1, 2, 3, 4, 5));
            Collection<Integer> liste2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

            //TODO 12 retirer tous les éléments de la liste1 qui sont dans la liste2.
            // (regarder bien l'API c'est très simple!)
            System.out.println("--------------/ TODO 12 /---------------");
            liste1.removeAll(liste2);

            System.out.println("Les éléments de liste1 qui sont dans liste2 ont été retirés " + liste1);

        }

        System.out.println();
        System.out.println("Retrait d'objets");
        {
            Collection<Personne> liste = new ArrayList<>(Arrays.asList(
                    new Personne("Matilde", 3),
                    new Personne("Bernard", 4)
            ));
            Personne autrePersonne = new Personne("Beatrice", 5);
            liste.add(autrePersonne);

            //TODO 13 retirer l'objet autrePersonne de la liste.
            System.out.println("--------------/ TODO 13 /---------------");
            System.out.println("liste : " + liste);
            liste.remove(autrePersonne);
            System.out.println("liste : " + liste);

            //Qu'arrive-t-il si l'instance est différente mais avec les même variables!
            //TODO 14. Retirer l'objet suivant de la collection. Pourquoi est-ce que ça ne  fonctionne pas?
            System.out.println("--------------/ TODO 14 - 15 /---------------");
            Personne matilde = new Personne("Matilde", 3);
            liste.remove(matilde);

            // TODO 15 Faites le nécessaire pour que todo14  fonctionne
            System.out.println("On a retiré Matilde: " + liste);


        }
        //Iterator boucle accéléré et listIterator
        System.out.println("\nIterateurs de collection");
        {
            Collection<Integer> liste = new ArrayList<>(Arrays.asList(1, 4, 2, 6, 5, -5, 3, 5, -9, 4, 2, -3, 5));
            //TODO 16 À partir d'un objet Iterator,  calculer la moyenne des nombres
            System.out.println("--------------/ TODO 16 /---------------");
            int moyenne = 0;
            int somme = 0;
            Iterator<Integer> iterator = liste.iterator();
            while (iterator.hasNext()) {
                somme += iterator.next();
            }
            moyenne = somme / liste.size();
            System.out.println("La moyenne est: " + moyenne);

            //On retire tous les nombres négatifs
            //TODO 17 À partir d'un objet Iterator, retirer tous les nombres négatifs de la collection
            System.out.println("--------------/ TODO 17 /---------------");
            Iterator<Integer> iterator2 = liste.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next() < 0) {
                    iterator2.remove();
                }
            }
            System.out.println("La liste sans nombre négatif" + liste);

            //for accéléré
            //Compter le nombre de Peronne qui ont plus de 18 ans
            List<Personne> listePersonne = new ArrayList<>(Arrays.asList(
                    new Personne("Paul", 1, 16),
                    new Personne("Luc", 2, 19),
                    new Personne("Bernard", 3, 24),
                    new Personne("Pilgrim", 4, 12),
                    new Personne("Mildred", 5, 27),
                    new Personne("Anthem", 6, 8)
            ));
            int nombrePersonneMajeure = 0;
            //TODO 18 En utilisant un boucle for accélérée (aussi appelée foreach), compter les personnes
            // qui sont majeures dans listePersonne.
            System.out.println("--------------/ TODO 18 /---------------");
            for (Personne personne : listePersonne) {
                if (personne.getAge() >= 18) {
                    nombrePersonneMajeure++;
                }
            }
            System.out.println("Il y a " + nombrePersonneMajeure + " personnes majeures");


            // TODO 19 Dans le package personneCollection, programmez les classes PersonneCollection, EnfantCollection et
            //  AdulteCollection qui contiennent
            //  un attribut de type Collection contenant des personne et les 3 méthodes suivantes :
            //  --boolean ajoutePersonne(Personne) varie selon la classe :
            //      - PersonneCollection ajoute toutes les personnes qui ne sont pas nulle. vrai si non nul
            //      - Enfant collection n'ajoute que les enfants et retourne faux s'il s'agit d'un adulte ou d'une personne nulle
            //      - AdulteColection n'ajoute que les adultes et retourne faux s'il s'agit d'un enfant ou d'une personne nulle
            // -- int calculeAgeMoyen() retourne l'age moyen des personnes contenues dans la collection en utilisant un iterateur
            // -- Collection<Integer> getIds retourne une collection contenant tous les Id des personnes contenues dans la collection en utilisatn un foreach
            // IMPORTANT -> Réutilisez au maximum et maximisez la compatibilité entre les 3 classes.


        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    static public Boolean test = true;

    public static void main(String[] args) {


        Plateau gameBoard = new Plateau();
        System.out.println(gameBoard);



        ArrayList<Magician> tableauMagicien = new ArrayList<>();
        ArrayList<Warrior> tableauGuerrier = new ArrayList<>();


        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Souhaitez vous " +
                    "(créer) un nouveau personnage, " +
                    "(lister) les personnages existants, " +
                    "(afficher) toutes les informations d'un personnage, " +
                    "(modifier) les informations d'un personnage" +
                    "(supprimer) un personnage, " +
                    "(quitter) le programme?");
            String choixCreationAffichage = sc.nextLine();
            System.out.println("Vous avez choisi: " + choixCreationAffichage);


            /*************************************************
             *       LISTE LES PERSONNAGES EXISTANTS          *
             *************************************************/

                if (choixCreationAffichage.equals("lister")) {
                    //boucle qui tourne dans le tableau de personnages
                    for (int i = 0; i < tableauMagicien.size(); i++) {
                        System.out.println(tableauMagicien.get(i));
                    }
                    for (int i = 0; i < tableauGuerrier.size(); i++) {
                        System.out.println(tableauGuerrier.get(i));
                    }




                /*************************************************
                 *       AFFICHAGE DES INFOS D'UN PERSONNAGE     *
                 *************************************************/
            }else if (choixCreationAffichage.equals("afficher")) {

                System.out.println("Souhaitez-vous afficher un (magicien) ou un (guerrier)?");
                String typePersonnage = sc.nextLine();
                System.out.println("Vous avez choisi : " + typePersonnage);

                /*************************************************
                 *      AFFICHAGE DES MAGICIENS                  *
                 *************************************************/

                if (typePersonnage.equals("magicien")) {

                    for (int i = 0; i < tableauMagicien.size(); i++) {
                        System.out.println(tableauMagicien.get(i));


                        /*************************************************
                         *      CHOIX DU MAGICIEN A AFFICHER             *
                         *************************************************/

                        System.out.println("Quel est le numéro du magicien que vous souhaitez afficher?");
                        int numeroMagicien = sc.nextInt();
                        System.out.println("Vous avez choisi : " + numeroMagicien);

                        System.out.println(tableauMagicien.get(numeroMagicien));
                    }

                    /*************************************************
                     *      AFFICHAGE DES GUERRIERS                  *
                     *************************************************/

                } else if (typePersonnage.equals("guerrier")) {

                    for (int i = 0; i < tableauGuerrier.size(); i++) {
                        System.out.println(tableauGuerrier.get(i));
                    }


                    /*************************************************
                     *     CHOIX DU GUERRIER A AFFICHER              *
                     *************************************************/

                    System.out.println("Quel est le numéro du guerrier que vous souhaitez afficher?");
                    int numeroGuerrier = sc.nextInt();
                    System.out.println("Vous avez choisi : " + numeroGuerrier);


                    System.out.println(tableauGuerrier.get(numeroGuerrier));
                }


                /*************************************************
                 *       SUPPRESSION D'UN PERSONNAGE DU TABLEAU  *
                 *************************************************/
            }else if (choixCreationAffichage.equals("supprimer")) {

                /*************************************************
                 *       CHOIX DU PERSONNAGE A SUPPRIMER         *
                 *************************************************/

                System.out.println("Souhaitez-vous supprimer un (magicien) ou un (guerrier)?");
                String suppressionMagicienOuGuerrier = sc.nextLine();
                System.out.println("Vous avez choisi: " + suppressionMagicienOuGuerrier);

                if (suppressionMagicienOuGuerrier.equals("magicien")) {

                    for (int i = 0; i < tableauMagicien.size(); i++) {
                        System.out.println(tableauMagicien.get(i));
                    }

                    /*************************************************
                     *      CHOIX DU MAGICIEN A SUPPRIMER            *
                     *************************************************/

                    System.out.println("Quel est le numéro du magicien que vous souhaitez supprimer?");
                    int numeroMagicien = sc.nextInt();
                    System.out.println("Vous avez choisi : " + numeroMagicien);

                    tableauMagicien.remove(numeroMagicien);


                }else if (suppressionMagicienOuGuerrier.equals("guerrier")) {

                    for (int i = 0; i < tableauGuerrier.size(); i++) {
                        System.out.println(tableauGuerrier.get(i));
                    }

                    /*************************************************
                     *     CHOIX DU GUERRIER A SUPPRIMER             *
                     *************************************************/

                    System.out.println("Quel est le numéro du guerrier que vous souhaitez supprimer?");
                    int numeroGuerrier = sc.nextInt();
                    System.out.println("Vous avez choisi : " + numeroGuerrier);

                    tableauGuerrier.remove(numeroGuerrier);

                } else {

                    System.out.println("Merci d'écrire en minuscules et de choisir les termes entre parenthèses");
                }


                /*************************************************
                 *  MODIFIER LES INFORMATIONS D'UN PERSONNAGE    *
                 *************************************************/

            }else if (choixCreationAffichage.equals("modifier")) {



                /*************************************************
                 *       CHOIX DU PERSONNAGE A MODIFIER         *
                 *************************************************/

                System.out.println("Souhaitez-vous modifier un (magicien) ou un (guerrier)?");
                String modificationMagicienOuGuerrier = sc.nextLine();
                System.out.println("Vous avez choisi: " + modificationMagicienOuGuerrier);

                if (modificationMagicienOuGuerrier.equals("magicien")) {

                    for (int i = 0; i < tableauMagicien.size(); i++) {
                        System.out.println(tableauMagicien.get(i));
                    }

                    /*************************************************
                     *      CHOIX DU MAGICIEN A MODIFIER           *
                     *************************************************/

                    System.out.println("Quel est le numéro du magicien que vous souhaitez modifier?");
                    int numeroMagicien = sc.nextInt();
                    System.out.println("Vous avez choisi : " + numeroMagicien);

                    sc.nextLine();

                    System.out.println("Quel nom souhaitez-vous lui donner?");
                    String nouveauNomMagicien = sc.nextLine();
                    System.out.println("Vous avez choisi : " + nouveauNomMagicien);


                    Magician myMagician = tableauMagicien.get(numeroMagicien);
                    myMagician.setName(nouveauNomMagicien);


                }else if (modificationMagicienOuGuerrier.equals("guerrier")) {

                    for (int i = 0; i < tableauGuerrier.size(); i++) {
                        System.out.println(tableauGuerrier.get(i));
                    }

                    /*************************************************
                     *     CHOIX DU GUERRIER A MODIFIER            *
                     *************************************************/

                    System.out.println("Quel est le numéro du guerrier que vous souhaitez modifier?");
                    int numeroGuerrier = sc.nextInt();
                    System.out.println("Vous avez choisi : " + numeroGuerrier);

                    sc.nextLine();

                    System.out.println("Quel nom souhaitez-vous lui donner?");
                    String nouveauNomGuerrier = sc.nextLine();
                    System.out.println("Vous avez choisi : " + nouveauNomGuerrier);

                    Warrior myWarrior = tableauGuerrier.get(numeroGuerrier);
                    myWarrior.setName(nouveauNomGuerrier);

                } else {

                    System.out.println("Merci d'écrire en minuscules et de choisir les termes entre parenthèses");
                }


            /*************************************************
             *      CREATEUR DE PERSONNAGE                   *
             *************************************************/
        }else if (choixCreationAffichage.equals("créer")) {

            System.out.println("Souhaitez vous créer un magicien ou un guerrier?");
            String choixMagicienGuerrier = sc.nextLine();
            System.out.println("Vous avez choisi: " + choixMagicienGuerrier);


            /*************************************************
             *      CREATEUR DE MAGICIEN                     *
             *************************************************/

            if (choixMagicienGuerrier.equals("magicien")) {

                System.out.println("Quel est le nom de votre magicien?");
                String magicianName = sc.nextLine();
                System.out.println("Vous avez choisi : " + magicianName);

                System.out.println("Quel est le chemin de l'image de votre magicien?");
                String magicianImage = sc.nextLine();
                System.out.println("Vous avez choisi : " + magicianImage);

                System.out.println("Quel niveau de vie a votre magicien (3-6)?");
                int niveauVieMagicien = sc.nextInt();
                System.out.println("Vous avez choisi : " + niveauVieMagicien);

                System.out.println("Quel niveau d'attaque a votre magicien (8-15)?");
                int niveauAttaqueMagicien = sc.nextInt();
                System.out.println("Vous avez choisi : " + niveauAttaqueMagicien);

                sc.nextLine();

                System.out.println("Quel sort choisissez-vous?");
                String nomSort = sc.nextLine();
                System.out.println("Vous avez choisi : " + nomSort);

                System.out.println("Quel est le niveau d'attaque de ce sort?");
                int niveauAttaqueSort = sc.nextInt();
                System.out.println("Vous avez choisi : " + niveauAttaqueSort);

                Spell sort = new Spell(nomSort, niveauAttaqueSort);

                sc.nextLine();

                System.out.println("Quel philtre choisissez-vous?");
                String choixPhiltre = sc.nextLine();
                System.out.println("Vous avez choisi : " + choixPhiltre);

                Philter philtre = new Philter(choixPhiltre);

                Magician magicien = new Magician(magicianName, magicianImage, niveauVieMagicien,
                        niveauAttaqueMagicien, sort, philtre);
                tableauMagicien.add(magicien);


                /*************************************************
                 *         CREATEUR DE GUERRIER                  *
                 *************************************************/

            } else if (choixMagicienGuerrier.equals("guerrier")) {

                System.out.println("Quel est le nom de votre guerrier?");
                String warriorName = sc.nextLine();
                System.out.println("Vous avez choisi : " + warriorName);

                System.out.println("Quel est le chemin de l'image de votre guerrier?");
                String warriorImage = sc.nextLine();
                System.out.println("Vous avez choisi : " + warriorImage);

                System.out.println("Quel niveau de vie a votre guerrier (5-10)?");
                int niveauVieGuerrier = sc.nextInt();
                System.out.println("Vous avez choisi : " + niveauVieGuerrier);

                System.out.println("Quel niveau d'attaque a votre guerrier (5-10)?");
                int niveauAttaqueGuerrier = sc.nextInt();
                System.out.println("Vous avez choisi : " + niveauAttaqueGuerrier);

                sc.nextLine();

                System.out.println("Quelle arme choisissez-vous?");
                String choixArme = sc.nextLine();
                System.out.println("Vous avez choisi : " + choixArme);

                System.out.println("Quelle est le niveau d'attaque de cette arme?");
                int choixNiveauAttaque = sc.nextInt();
                System.out.println("Vous avez choisi : " + choixNiveauAttaque);

                Weapon arme = new Weapon(choixArme, choixNiveauAttaque);

                sc.nextLine();

                System.out.println("Quel bouclier choisissez-vous?");
                String choixBouclier = sc.nextLine();
                System.out.println("Vous avez choisi : " + choixBouclier);

                Shield bouclier = new Shield(choixBouclier);

                Warrior guerrier = new Warrior(warriorName, warriorImage, niveauVieGuerrier,
                        niveauAttaqueGuerrier, arme, bouclier);
                tableauGuerrier.add(guerrier);

            }


            /*************************************************
             *      QUITTER LE PROGRAMME                     *
             *************************************************/

        } else if (choixCreationAffichage.equals("quitter")) {
            test = false;


            /*************************************************
             *     ERREUR DANS L'USER INPUT                  *
             *************************************************/

        } else {
            System.out.println("Veuillez choisir entre magicien et guerrier " +
                    "et écrire en lettres minuscules");
        }


    } while(test.equals(true));

}
}
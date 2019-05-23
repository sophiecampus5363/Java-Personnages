import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class Plateau {

    /*************************************************
     *      INITIALISATION DU PLATEAU                *
     *************************************************/

    ArrayList<Case> tableauCases = new ArrayList<>();

    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Plateau() {
        for (int i = 0; i < 13; i++) {
            tableauCases.add(new Case());
        }

        for (int i = 0; i < 4; i++) {
            tableauCases.add(new Ennemi());
        }

        for (int i = 0; i < 3; i++) {
            tableauCases.add(new Objet());

        }
    }

    /*****************************************
     *      AFFICHAGE DU TABLEAU EN TEXTE    *
     *****************************************/

    public String toString()
    {
        StringBuilder result = new StringBuilder();

       for(Case box : tableauCases){
           result.append("\n");
           result.append(box);
        }
        return result.toString();


    }
}







public class Spell {

    /****************************
     *     INSTANCE FIELDS      *
     ****************************/

    private String spellName;
    private int spellAttackLevel;

    /****************************
     *      GETTERS             *
     ****************************/

    public String getName(){
        return spellName;
    }
    public int getAttackLevel(){
        return  spellAttackLevel;
    }

    /****************************
     *          SETTERS         *
     ****************************/

    public void setName(String name){
        spellName = name;
    }
    public void setAttackLevel(int attackLevel){
        spellAttackLevel = attackLevel;
    }

    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Spell(String name, int attackLevel ){
        spellName = name;
        spellAttackLevel = attackLevel;
    }

    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Votre sort a les paramètres suivants:" + newLine +
                "nom du sort: "
                +spellName+ newLine +
                "niveau d'attaque du sort:"
                +spellAttackLevel+ newLine +
                ".";
    }

}

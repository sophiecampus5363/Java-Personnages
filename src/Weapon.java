public class Weapon {

    /****************************
     *     INSTANCE FIELDS      *
     ****************************/

    private String weaponName;
    private int weaponAttackLevel;

    /****************************
     *      GETTERS             *
     ****************************/

    public String getName(){
        return weaponName;
    }
    public int getAttackLevel(){
        return weaponAttackLevel;
    }

    /****************************
     *          SETTERS         *
     ****************************/

    public void setName(String name){
        weaponName = name;
    }
    public void setAttackLevel(int attackLevel){
        weaponAttackLevel = attackLevel;
    }

    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Weapon(String name, int attackLevel){
        weaponName = name;
        weaponAttackLevel = attackLevel;

    }

    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Votre arme a les paramètres suivants:" + newLine +
                "nom de l'arme: "
                +weaponName+ newLine +
                "niveau d'attaque de l'arme:"
                +weaponAttackLevel+ newLine +
                ".";
    }






}

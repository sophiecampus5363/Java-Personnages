public class Shield {

    /****************************
     *     INSTANCE FIELDS      *
     ****************************/

    private String shieldName;

    /****************************
     *      GETTERS             *
     ****************************/

    public String getName(){
        return shieldName;
    }

    /****************************
     *          SETTERS         *
     ****************************/

    public void setName(String name){
        shieldName = name;
    }

    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Shield(String name){
        shieldName = name;
    }

    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Votre arme a les paramètres suivants:" + newLine +
                "nom de l'arme: "
                +shieldName+ newLine +

                ".";
    }





}

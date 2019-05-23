public class Philter {

    /****************************
     *     INSTANCE FIELDS      *
     ****************************/

    private String philterName;

    /****************************
     *      GETTERS             *
     ****************************/

    public String getName(){
        return philterName;
    }

    /****************************
     *          SETTERS         *
     ****************************/

    public void setName(String name){
        philterName = name;
    }

    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Philter(String name){
        philterName = name;
    }

    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Votre philtre a les paramètres suivants:" + newLine +
                "nom du philtre: "
                +philterName+ newLine +

                ".";
    }


}

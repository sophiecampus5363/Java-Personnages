public class Personnage {

    /****************************
     *      DEFINITION CLASSE   *
     ****************************/


    public String name;
    public String image;
    public int lifeLevel;
    public int attackLevel;


    /****************************
     *      CONSTRUCTEUR        *
     ****************************/

    public Personnage (String name, String image, int lifeLevel, int attackLevel) {
        this.name = name;
        this.image = image;
        this.lifeLevel = lifeLevel;
        this.attackLevel = attackLevel;

    }

    /****************************
     *      GETTERS             *
     ****************************/

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }


    /*****************************
     *      SETTERS              *
     *****************************/

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

}

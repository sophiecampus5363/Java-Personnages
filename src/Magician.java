public class Magician extends Personnage {

    /****************************
     *     INSTANCE FIELDS      *
     ****************************/

    private Spell magicianSpell;
    private Philter magicianPhilter;


    /****************************
     *        CONSTRUCTEUR      *
     ****************************/

    public Magician(String name, String image, int lifeLevel, int attackLevel,
                    Spell spell, Philter philter) {
        super(name,image, lifeLevel, attackLevel);
        magicianSpell = spell;
        magicianPhilter = philter;

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

    public Spell getSpell() {
        return magicianSpell;
    }

    public Philter getPhilter() {
        return magicianPhilter;
    }

    /****************************
     *          SETTERS         *
     ****************************/

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

    public void setSpell(Spell spell) {
        magicianSpell = spell;
    }

    public void setPhilter(Philter philter) {
        magicianPhilter = philter;
    }

    /******************************************************
     *      AFFICHAGE DU PROFIL DU PERSONNAGE EN TEXTE    *
     ******************************************************/


    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "Votre magicien a le profil suivant:" + newLine +
                "nom: "
        +this.name+ newLine +
                "image:"
        +this.image+ newLine +
                "niveau de vie:"
        +this.lifeLevel+ newLine +
                "niveau d'attaque:"
        +this.attackLevel+ newLine +
                "sort:"
        +this.magicianSpell+ newLine +
                "philtre:"
        +this.magicianPhilter+ newLine +
                ".";
    }





}
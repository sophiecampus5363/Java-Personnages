    public class Warrior extends Personnage {

        /****************************
         *     INSTANCE FIELDS      *
         ****************************/


        private Weapon warriorWeapon;
        private Shield warriorShield;

        /****************************
         *        CONSTRUCTEUR      *
         ****************************/

        public Warrior(String name, String image, int lifeLevel, int attackLevel,
                       Weapon weapon, Shield shield){
            super(name,image, lifeLevel, attackLevel);
            warriorWeapon = weapon;
            warriorShield = shield;

        }

            /****************************
             *      GETTERS             *
             ****************************/

        public String getName(){
            return name;
        }
        public String getImage(){
            return image;
        }
        public int getLifeLevel(){
            return lifeLevel;
        }
        public int getAttackLevel(){
            return attackLevel;
        }
        public Weapon getWeapon(){
            return warriorWeapon;
        }
        public Shield getShield(){
            return warriorShield;
        }


            /****************************
             *          SETTERS         *
             ****************************/

        public void setName(String name){
            name = name;
        }
        public void setImage(String image){
            image = image;
        }
        public void setLifeLevel(int lifeLevel){
            lifeLevel = lifeLevel;
        }
        public void setAttackLevel(int attackLevel){
            attackLevel = attackLevel;
        }
        public void setWeapon(Weapon weapon){
            warriorWeapon = weapon;
        }
        public void setShield(Shield shield){
            warriorShield = shield;
        }

            /******************************************************
             *      AFFICHAGE DU PROFIL DU PERSONNAGE EN TEXTE    *
             ******************************************************/

        public String toString(){
            String newLine = System.getProperty("line.separator");
            return "Votre guerrier a le profil suivant:" + newLine +
                    "nom: "
                    +name+ newLine +
                    "image:"
                    +image+ newLine +
                    "niveau de vie:"
                    +lifeLevel+ newLine +
                    "niveau d'attaque:"
                    +attackLevel+ newLine +
                    "arme:"
                    +warriorWeapon+ newLine +
                    "bouclier:"
                    +warriorShield+ newLine +
                    ".";
        }

    }


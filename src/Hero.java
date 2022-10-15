public class Hero {
    private int health;

    public int getHealth() {
        return health;
    }

    private int damage;

    public int getDamage() {
        return damage;
    }

    private String superPower;

    public String getSuperPower() {
        return superPower;
    }

    public Hero(int health, int damage, String superPower){
        this.health=health;
        this.damage=damage;
        this.superPower=superPower;

    }

    public Hero(int health, int damage){
        this.health=health;
        this.damage=damage;
    }
}

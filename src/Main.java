import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefence("Magical");

        System.out.println("Boss's health:"+boss.getHealth()+ " Boss's damage:"+boss.getDamage()+
                " Boss's defence type:"+boss.getDefence());
        System.out.println("____________________________________________________________");
        
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println(" Heroes health:"+createHeroes()[i].getHealth()+ " Heroes damage:"+
                    createHeroes()[i].getDamage()+ " Heroes super power:"+ createHeroes()[i].getSuperPower());

        }
        createHeroes();


    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(500, 40, "Super speed");
        Hero hero2 = new Hero(800, 100);
        Hero hero3 = new Hero(100, 50, "Super stregth");

        Hero [] heroes = {hero1, hero2, hero3};

        return heroes;
    }
}
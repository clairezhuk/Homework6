package sveta;
//import com.company.Hero;
public class Main {

    public static void main(String[] args) {
        Druid druid = new Druid(3,50,20,10);
        Animal animal = new Animal("Wolf",50,30);
        Warrior warrior = new Warrior(2,40,20,2);
        Magician magician = new Magician(5,70,20,40);
        DarkMagician darkMagician = new DarkMagician(1,30,10,20);
        druid.tameAnimal(animal);
        druid.info();
        System.out.println();
        warrior.info();
        System.out.println();
        magician.info();
        System.out.println();
        darkMagician.info();
        System.out.println();
        System.out.println("________________________");

        warrior.attack(magician);
        druid.attack(darkMagician);
        magician.attack(druid);
        darkMagician.magicAttack(warrior);
        druid.info();
        System.out.println();
        warrior.info();
        System.out.println();
        magician.info();
        System.out.println();
        darkMagician.info();
        System.out.println();
        System.out.println("________________________");

        animal.attackLikeAnimal(magician);
        darkMagician.darkMagicAttack(animal);
        magician.magicAttack(warrior);
        druid.heal();
        warrior.strongHit(magician);
        druid.info();
        System.out.println();
        warrior.info();
        System.out.println();
        magician.info();
        System.out.println();
        darkMagician.info();
        System.out.println();
        System.out.println("________________________");

        druid.heal();
        darkMagician.darkMagicAttack(druid);
        druid.attack(magician);
        druid.info();
        System.out.println();
        warrior.info();
        System.out.println();
        magician.info();
        System.out.println();
        darkMagician.info();
        System.out.println();
        System.out.println("________________________");
    }
}

package sveta;

public class Animal {
    public Animal(){

    }
    public Animal(String name, int healthPoints, int power){
        this.name = name;
        this.healthPoints = healthPoints;
        this.power = power;
    }
    int healthPoints;
    int power;
    String name;
    final public void attackLikeAnimal(Hero hero){
        hero.leavePoints -= power;
    }
    final public void attackLikeAnimal(Animal animal){
        animal.healthPoints -= power;
    }
}

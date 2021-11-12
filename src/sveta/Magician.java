package sveta;

public class Magician extends Hero{
    int magicDamage;
    public Magician(){}
    public Magician(int level, int leavePoints, int fisicalDamage, int magicDamage){
        this.level = level;
        this.leavePoints = leavePoints;
        this.fisicalDamage = fisicalDamage;
        this.magicDamage = magicDamage;
    }
    public void magicAttack(Hero hero){
        if (leavePoints>0) hero.leavePoints -= magicDamage;
    }
    public void magicAttack(Animal animal){
        if (leavePoints>0) animal.healthPoints -= magicDamage;
    }
    @Override
    public void attack(Hero hero) {
        if (leavePoints>0) hero.leavePoints-=super.fisicalDamage;
    }
    @Override
    public void attack(Animal animal){
        if (leavePoints>0) animal.healthPoints -= fisicalDamage;
    }

    @Override
    public void info() {
        System.out.println("type: magician");
        if (leavePoints>0) {
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            System.out.println("maggic damage: " + magicDamage);
        }
        else {
            System.out.println("Is dead");
        }
    }

    @Override
    public void train() {
        if (leavePoints>0) {
            this.level += 1;
            if (level % 3 == 0) {
                leavePoints += 10;
                magicDamage += 5;
            }
            fisicalDamage += 1;
        }

    }
}

package sveta;
public class Warrior extends Hero {
    int multiplicleFisicalDamage;

    public Warrior(int level, int leavePoints, int fisicalDamage, int multiplicleFisicalDamage) {
        this.level = level;
        this.leavePoints = leavePoints;
        this.multiplicleFisicalDamage = multiplicleFisicalDamage;
        this.fisicalDamage = fisicalDamage;
    }

    public Warrior(){}

    void strongHit(Hero hero){

        if (leavePoints>0){hero.leavePoints -= fisicalDamage*multiplicleFisicalDamage;}
    }
    void strongHit(Animal animal){
        if (leavePoints>0) animal.healthPoints -= fisicalDamage*multiplicleFisicalDamage;
    }
    @Override
    public void info(){
        System.out.println("type: warrior");
        if (leavePoints>0) {
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            System.out.println("multiplicle fisical damage: " + multiplicleFisicalDamage);
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
                multiplicleFisicalDamage += 1;
            }
            fisicalDamage += 1;
        }
    }

    @Override
    public void attack(Hero hero) {
        if (leavePoints>0) {
            hero.leavePoints -= fisicalDamage;
        }
    }
    @Override
    public void attack(Animal animal){
        if (leavePoints>0) {
            animal.healthPoints -= fisicalDamage;
        }
    }
}

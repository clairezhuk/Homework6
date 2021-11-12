package sveta;

public class DarkMagician extends Magician{
    public DarkMagician(){}
    public DarkMagician(int level, int leavePoints, int fisicalDamage, int magicDamage){
        this.level = level;
        this.leavePoints = leavePoints;
        this.fisicalDamage = fisicalDamage;
        this.magicDamage = magicDamage;
    }
    void darkMagicAttack(Hero hero){
        if (leavePoints>0) {
            hero.leavePoints -= magicDamage * (level + (int) (Math.random() * magicDamage/5));
            this.leavePoints -= 5;
        }
    }
    void darkMagicAttack(Animal animal){
        if (leavePoints>0) {
            animal.healthPoints -= magicDamage * (level + (int) (Math.random() * magicDamage/5));
            this.leavePoints -= 5;
        }
    }
    @Override
    public void info() {
        System.out.println("type: dark magician");
        if(leavePoints>0) {
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            System.out.println("maggic damage: " + magicDamage);
        }
        else {
            System.out.println("Is dead");
        }
    }
}

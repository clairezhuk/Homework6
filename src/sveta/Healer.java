package sveta;

public class Healer extends Hero{
    public int healPower;
    public Healer(int level, int leavePoints, int fisicalDamage, int healPower){
        this.level = level;
        this.leavePoints = leavePoints;
        this.fisicalDamage = fisicalDamage;
        this.healPower = healPower;
    }
    public Healer(){}
    public void heal(Hero hero){
        if (leavePoints>0){
            hero.leavePoints += healPower;
        }
    }
    public void heal(){
        if (leavePoints>0){
            super.leavePoints += healPower;
        }
    }
    public void attack(Hero hero){
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
    @Override
    public void info(){
        System.out.println("type: healer");
        if(leavePoints>0) {
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            System.out.println("heal power" + healPower);
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
            }
            fisicalDamage += 1;
            healPower += 1;
        }
    }

}

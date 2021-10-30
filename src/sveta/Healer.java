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
        hero.leavePoints += healPower;
    }
    public void heal(){ super.leavePoints += healPower;}
    public void attack(Hero hero){
        hero.leavePoints -= fisicalDamage;
    }
    @Override
    public void attack(Animal animal){
        animal.healthPoints -= fisicalDamage;
    }
    @Override
    public void info(){
        System.out.println("type: healer");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage);
        System.out.println("heal power" + healPower);
    }
    @Override
    public void train() {
        this.level+=1;
        if (level % 3 == 0) {
            leavePoints+=10;
        }
        fisicalDamage+=1;
        healPower+=1;
    }

}

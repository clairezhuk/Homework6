package sveta;
public class Warrior extends sveta.Hero {
    int multiplicleFisicalDamage;

    public Warrior(int level, int leavePoints, int fisicalDamage, int multiplicleFisicalDamage) {
        this.level = level;
        this.leavePoints = leavePoints;
        this.multiplicleFisicalDamage = multiplicleFisicalDamage;
        this.fisicalDamage = fisicalDamage;
    }

    void strongHit(sveta.Hero hero){
        hero.leavePoints -= 30;
    }
    @Override
    void infoAboutHero(){
        System.out.println("type: warrior");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage*multiplicleFisicalDamage);
        System.out.println("multiplicle fisical damage: "+multiplicleFisicalDamage);
    }

    @Override
    public void train() {
        this.level += 1;
        if (level % 3 == 0) {
            leavePoints+=10;
            multiplicleFisicalDamage+=1;
        }
        fisicalDamage+=1;
    }
}

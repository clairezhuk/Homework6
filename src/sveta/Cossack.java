package sveta;

public class Cossack extends Warrior {
    public Cossack(int level, int leavePoints, int fisicalDamage, int multiplicleFisicalDamage){
        super(level,leavePoints,fisicalDamage,multiplicleFisicalDamage);
    }
    public Cossack(){

    }
    Saber saber = new Saber();
    void chopWithSaber(){}
    @Override
    public void info(){
        System.out.println("type: cossack");
        if (leavePoints>0) {
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            if (saber.name != null) {
                System.out.println("saber: " + saber.name);
            }
        }
        else {
            System.out.println("Is dead");
        }
    }
}

package sveta;

public class Cossack extends sveta.Warrior {
    public Cossack(int level, int leavePoints, int fisicalDamage, int multiplicleFisicalDamage){
        super(level,leavePoints,fisicalDamage,multiplicleFisicalDamage);
    }
    sveta.Saber saber = new sveta.Saber();
    void chopWithSaber(){}
    @Override
    void infoAboutHero(){
        System.out.println("type: cossack");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage);
        if (saber.name != null) {System.out.println("saber: "+saber.name);}
    }
}

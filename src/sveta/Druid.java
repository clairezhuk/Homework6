package sveta;

public class Druid extends sveta.Healer {
    sveta.Animal animal = new sveta.Animal();
    public Druid(int level, int leavePoints, int fisicalDamage, int healPower){
        super(level,leavePoints,fisicalDamage,healPower);
    }
    void tameAnimal(sveta.Animal animal){
        this.animal = animal;
    }
    @Override
    void infoAboutHero(){
        System.out.println("type: druid");
        System.out.println("level: "+level);
        System.out.println("leave points: "+leavePoints);
        System.out.println("fisical damage: "+fisicalDamage);
        System.out.println("heal power: "+healPower);
        if (animal.name != null) {System.out.println("animal:"+animal.name);}
    }
}

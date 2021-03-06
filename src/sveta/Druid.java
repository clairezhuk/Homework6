package sveta;

public class Druid extends Healer {
    sveta.Animal animal = new sveta.Animal();
    public Druid(int level, int leavePoints, int fisicalDamage, int healPower){
        super(level,leavePoints,fisicalDamage,healPower);
    }
    public Druid(){}
    void tameAnimal(sveta.Animal animal){
        this.animal = animal;
    }
    @Override
    public void info(){
        System.out.println("type: druid");
        if(leavePoints>0) {
            if (animal.healthPoints <= 0) {
                animal.name = null;
            }
            System.out.println("level: " + level);
            System.out.println("leave points: " + leavePoints);
            System.out.println("fisical damage: " + fisicalDamage);
            System.out.println("heal power: " + healPower);
            if (animal.name != null) {
                System.out.println("animal:" + animal.name);
            }
        }
        else {
            System.out.println("Is dead");
        }
    }
}

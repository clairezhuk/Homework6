package sveta;

abstract public class Hero implements Trainee, Info {
    public int leavePoints;
    public int level;
    public int fisicalDamage;

    public abstract void attack(Hero hero);
    public abstract void attack(Animal animal);
}
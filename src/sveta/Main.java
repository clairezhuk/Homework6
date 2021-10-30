package sveta;
//import com.company.Hero;
public class Main {

    public static void main(String[] args) {
        Warrior hero1 = new Warrior(1,30,1,1);
        Druid hero2 = new Druid(1,30,1,1);
        sveta.Academy universalAcademy = new sveta.Academy();
        WarriorAcademy warriorAcademy = new WarriorAcademy();
        sveta.PriestAcademy priestAcademy = new sveta.PriestAcademy();
        System.out.println("START INFO:");
        hero1.infoAboutHero();
        System.out.println();
        hero2.infoAboutHero();
        System.out.println();

        System.out.println("AFTER UNIVERSAL ACADEMY:");
        universalAcademy.teach(hero1);
        universalAcademy.teach(hero2);
        hero1.infoAboutHero();
        System.out.println();
        hero2.infoAboutHero();
        System.out.println();

        System.out.println("AFTER WARRIOR ACADEMY:");
        warriorAcademy.teach(hero1);
        warriorAcademy.teach(hero2);
        hero1.infoAboutHero();
        System.out.println();
        hero2.infoAboutHero();
        System.out.println();

        System.out.println("AFTER PRIEST ACADEMY:");
        priestAcademy.teach(hero1);
        priestAcademy.teach(hero2);
        hero1.infoAboutHero();
        System.out.println();
        hero2.infoAboutHero();
    }
}

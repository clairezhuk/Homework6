package sveta;

public class WarriorAcademy{
    void teach(sveta.Trainee trainee){
        if (trainee instanceof Warrior){trainee.train();}
    }
}

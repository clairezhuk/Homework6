package sveta;

public class PriestAcademy {
    void teach(Trainee trainee){
        if (trainee instanceof sveta.Healer){trainee.train();}
    }
}

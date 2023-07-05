package OOP_Seminar1.OOP_Sem1_HT;

public class Fly extends Animals{
    public Fly(String name, String species) {
        super(name, species);
    }

    @Override
    public void Swim(){
        super.CantSwim();
    }
}
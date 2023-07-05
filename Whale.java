package OOP_Seminar1.OOP_Sem1_HT;

public class Whale extends Animals{
    public Whale (String name, String species) {
        super(name, species);
    }

    @Override
    public void Fly(){
        super.NoWings();
    }

    @Override
    public void Swim(){
        super.Dive();
    }

    @Override
    public void WalkRun(){
        super.NoWalk();
    }
}
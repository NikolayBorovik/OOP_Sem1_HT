package OOP_Seminar1.OOP_Sem1_HT;

public class Fish extends Animals{
    public Fish(String name, String species) {
        super(name, species);
    }

    @Override
    public void Fly(){
        super.Dive();
    }

    @Override
    public void Swim(){
        System.out.println("Only rare fish can fly but not me.");
    }

    @Override
    public void WalkRun(){
        super.NoWalk();
    }
}
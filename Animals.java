package OOP_Seminar1.OOP_Sem1_HT;

public class Animals {
    protected String name;
    protected String color;
    protected int numLimbs;
    protected String vaccinated;
    protected int age;
    protected String species;

    public Animals(String name, String color, int numLimbs, String vaccinated, int age, String species) {
        this.name = name;
        this.color = color;
        this.numLimbs = numLimbs;
        this.vaccinated = vaccinated;
        this.age = age;
        this.species = species;
    }

    public Animals(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animals() {
        this("none", "none");
    }

    @Override
    public String toString() {
        return String.format("%s;%s", name, species);
    }

    private void FlapWings(){
        System.out.println("Staring to flap my wings and hop up");
    }
    private void Planing(){
        System.out.println("Staring to plane");
    }
    protected void NoWings(){
        System.out.println("Oops, I've got no wings to fly:(");
    }
    public void Fly(){
        FlapWings();
        Planing();
    }

    private void StepWater(){
        System.out.print("Stepping into the water... ");
    }
    protected void Dive(){
        System.out.println("Diving and swimming all right...");
    }
    protected void CantSwim(){
        System.out.println("Oops, I can't swim.");
    }
    public void Swim(){
        StepWater();
        Dive();
    }

    protected void NoWalk(){
        System.out.println("There's no talking about walking.");
    }
    public void WalkRun(){
        System.out.println("Walking is just my element!");
    }
}

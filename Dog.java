package OOP_Seminar1.OOP_Sem1_HT;

public class Dog extends Animals {
    
    public Dog(String name, String species) {
        super(name, species);
    }

    @Override
    public void Fly(){
        super.NoWings();
    }
}

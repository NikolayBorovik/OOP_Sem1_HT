package OOP_Seminar1.OOP_Sem1_HT;

public class Program {
    public static void main(String[] args) {
    //         Дз: добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
    // наследника Animal, умеющих летать, плавать, бегать. При этом добиться того, чтобы не умеющие летать или плавать, 
    // не могли этого сделать. САМОЕ ВАЖНОЕ! В файле readme.md в репозитории гитхаб описать,
    // какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
    // (если они есть)
    Dog dog = new Dog("Sharik", "Dog");
    System.out.println(dog);
    dog.Fly();
    dog.Swim();
    dog.WalkRun();

    Cat cat = new Cat("Pussy", "Cat");
    System.out.println(cat);
    cat.Fly();
    cat.Swim();
    cat.WalkRun();

    Bird bird = new Bird ("Flutter", "Bird");
    System.out.println(bird);
    bird.Fly();
    bird.Swim();
    bird.WalkRun();

    Fish fish = new Fish ("Golden", "Fish");
    System.out.println(fish);
    fish.Fly();
    fish.Swim();
    fish.WalkRun();

    Fly fly = new Fly ("Buzz", "Fly");
    System.out.println(fly);
    fly.Fly();
    fly.Swim();
    fly.WalkRun();

    Whale whale = new Whale ("Busty", "Whale");
    System.out.println(whale);
    whale.Fly();
    whale.Swim();
    whale.WalkRun();

    

    

    }
}

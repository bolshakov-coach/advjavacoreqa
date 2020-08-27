package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class Dog extends AbstractAnimal implements WalkingAnimal {

    public Dog() {
        super(111);
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    @Override
    void sound() {
        System.out.println("bark - bark");
    }
}

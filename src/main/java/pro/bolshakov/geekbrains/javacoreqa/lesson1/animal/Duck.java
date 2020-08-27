package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class Duck extends AbstractAnimal implements SwimmingAnimal, WalkingAnimal {

    public Duck() {
        super(96);
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public void walk() {
        System.out.println("Duck walks");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    @Override
    void sound() {
        System.out.println("Krya - Krya");
    }
}

package pro.bolshakov.geekbrains.javacoreqa.lesson1;

import lesson1.animal.*;

public class InterfaceDemoApp {

    public static void main(String[] args) {

        Duck duck = new Duck();
        Dog dog = new Dog();

//        takeAnimal(duck);
//        takeAnimal(dog);

//        takeAbstractAnimal(duck);
//        takeAbstractAnimal(dog);

//        takeSwimAnimal(duck);
//        takeSwimAnimal(dog);

//        takeWalkingAnimal(duck);
//        takeWalkingAnimal(dog);

    }

    private static void takeAnimal(Animal animal){
        System.out.println("We take animal: " + animal.toString());
    }

    private static void takeAbstractAnimal(AbstractAnimal abstractAnimal){
        System.out.println("Abstract animal actions");
        abstractAnimal.heartBeat();
        abstractAnimal.sound();
    }

    private static void takeSwimAnimal(SwimmingAnimal swimmingAnimal){
        swimmingAnimal.swim();
    }

    private static void takeWalkingAnimal(WalkingAnimal walkingAnimal){
        walkingAnimal.walk();
    }


}

package pro.bolshakov.geekbrains.javacoreqa.lesson1;

import lesson1.animal.Cat;

import java.util.UUID;

public class MyPersonalCat extends Cat {

    public MyPersonalCat() {
    }

    public MyPersonalCat(String name, String color, int age) {
        super(name, color, age, UUID.randomUUID().toString());
    }

    @Override
    public void methodPublic() {
        super.methodPublic();
        System.out.println("My Personal Cat - call public");
    }

    @Override
    protected void methodProtected() {
        super.methodProtected();
        System.out.println("My Personal Cat - call protected");
    }
}

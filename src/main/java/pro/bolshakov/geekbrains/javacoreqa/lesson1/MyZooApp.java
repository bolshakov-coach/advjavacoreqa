package pro.bolshakov.geekbrains.javacoreqa.lesson1;

import lesson1.animal.Cat;

public class MyZooApp {

    public static void main(String[] args) {

        Cat cat1 = createCat();
        System.out.println("Cat name -->" + cat1.name);

        Cat cat2 = cat1;
        System.out.println("Cat name -->" + cat2.name);

        Object objCat = createCat();
        System.out.println(objCat.toString());

        Cat cat3 = (Cat) objCat;
        cat3.name = "Changed name";
        System.out.println(cat3.toString());

        MyPersonalCat myPersonalCat = new MyPersonalCat();

        System.out.println(myPersonalCat instanceof Cat);
        System.out.println(myPersonalCat instanceof MyPersonalCat);
//        System.out.println(myPersonalCat instanceof WildCat);

    }


    static Cat createCat(){
        return new Cat("My First pet", "yellow",3, "id");
    }
}

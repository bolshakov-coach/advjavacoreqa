package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class ForestApp {
    public static void main(String[] args) {

        Cat cat = createCat();
        outputCatData(cat);

//        FatCat fatCat = createFatCat();
//        outputCatData(fatCat);

//        Cat catFromFatCat = createFatCat();
//        outputCatData(catFromFatCat);

    }

    static Cat createCat(){
        Cat cat = new Cat();
        cat.name = "My First pet in forest";
        cat.age = 10;
        cat.color = "black";
        return cat;
    }

    static FatCat createFatCat(){
        FatCat fatCat = new FatCat();
        fatCat.name = "My pretty round cat";
        fatCat.age = 3;
        fatCat.color = "white";
        return fatCat;
    }

    static void outputCatData(Cat cat){
        System.out.println("New animal --> " + cat.name + " with age " + cat.age + " and color " + cat.color);
    }
}

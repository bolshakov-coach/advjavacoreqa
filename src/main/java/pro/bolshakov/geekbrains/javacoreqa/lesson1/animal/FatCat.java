package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class FatCat extends Cat {

    static String staticName = "";

    static public void callStaticMethod(String value){
        System.out.println("Static method get parameter: " + value + " get from class " + staticName);
    }


    @Override
    public String toString() {
        return "FatCat -> " + super.toString();
    }
}

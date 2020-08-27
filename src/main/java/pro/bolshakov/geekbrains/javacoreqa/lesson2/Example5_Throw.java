package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example5_Throw {

    public static void main(String[] args) {

//        myThrowCheckedExc();
//        myThrowUncheckedExc();
//        myThrowUncheckedExcWithoutTry();
    }

    private static void myThrowUncheckedExc() {
        try {
            throw new NullPointerException("You got null");
        }
        catch (NullPointerException e) {
            System.out.println("I got");
            e.printStackTrace();
        }
    }

    private static void myThrowCheckedExc() {
        try {
            throw new IllegalAccessException("Illegal access to the body");
        }
        catch (IllegalAccessException e) {
            System.out.println("I got");
            e.printStackTrace();
        }
    }

    private static void myThrowUncheckedExcWithoutTry() {
        throw new NullPointerException("You got null");
    }
}

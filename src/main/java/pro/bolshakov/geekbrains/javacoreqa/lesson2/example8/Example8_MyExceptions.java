package pro.bolshakov.geekbrains.javacoreqa.lesson2.example8;

public class Example8_MyExceptions {

    public static void main(String[] args) {

//        myThrowCheckedExc();
//        myThrowUncheckedExc();

    }

    private static void myThrowUncheckedExc() {
        try {
            throw new MyExceptionUnchecked();
        }
        catch (MyExceptionUnchecked e) {
            System.out.println("I got");
            e.printStackTrace();
        }
    }

    private static void myThrowCheckedExc() {
        try {
            throw new MyExceptionChecked();
        }
        catch (MyExceptionChecked e) {
            System.out.println("I got");
            e.printStackTrace();
        }
    }

}

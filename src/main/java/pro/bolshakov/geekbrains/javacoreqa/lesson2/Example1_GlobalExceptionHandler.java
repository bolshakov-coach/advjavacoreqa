package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example1_GlobalExceptionHandler {

    public static void main(String[] args) {

        int a = 0;
        int b = 10;
        System.out.println(b / a);

//        myMethod();

    }


    static void myMethod(){
        int a = 0;
        int b = 10;
        System.out.println(b / a);
    }

}

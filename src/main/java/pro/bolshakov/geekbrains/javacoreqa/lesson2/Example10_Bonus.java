package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example10_Bonus {

    public static void main(String[] args) {
        myMethod();
    }


    static void myMethod(){
        try {
            System.exit(0);
        }
        finally {
            System.out.println("finally");
        }
    }

}

package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example2_TryCatch {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10;
            System.out.println(b / a);
            System.out.println("block in try");
        }
        catch (ArithmeticException e){
            System.out.println("Got exception");
            e.printStackTrace();
        }
        System.out.println("finish");
    }

}

package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example4_CatchSuperClass {

    static int delimiter = 10;
    static int indArr = 42;


    public static void main(String[] args) {
        try {
            delimiter -= 10;
            int b = 42 / delimiter;
            int[] arr = {1,2,3};
            arr[indArr] = 4;
            System.out.println("block in try");
        }
        catch (Exception e){
            System.out.println("I am batya");
        }
/*
        catch (ArithmeticException e){
            System.out.println("Division by zero");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect index for array");
            e.printStackTrace();
        }
*/
        System.out.println("finish");
    }
}

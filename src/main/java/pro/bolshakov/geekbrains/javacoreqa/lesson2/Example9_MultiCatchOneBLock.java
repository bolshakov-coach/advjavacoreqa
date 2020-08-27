package pro.bolshakov.geekbrains.javacoreqa.lesson2;

public class Example9_MultiCatchOneBLock {

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
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Wow wow. I got");
            e.printStackTrace();
        }
        System.out.println("finish");
    }
}

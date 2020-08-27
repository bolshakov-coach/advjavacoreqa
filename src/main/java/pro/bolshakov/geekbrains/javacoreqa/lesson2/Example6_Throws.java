package pro.bolshakov.geekbrains.javacoreqa.lesson2;

import java.io.IOException;

public class Example6_Throws {
    public static void main(String[] args) {

//        myThrowCheckedExc();
//        myThrowUncheckedExc();
//        myThrowUncheckedExc2();

    }

    private static void myThrowCheckedExc() throws IllegalAccessException{
        throw new IllegalAccessException("Illegal access to the body");
    }

    /*private static void myThrowCheckedExc2(){
        throw new IllegalAccessException("Illegal access to the body");
    }*/

    private static void myThrowCheckedExc3() throws IllegalAccessException, IOException{

        int g = 3;
        int y = 6;
        if(g - 4 > y){
            throw new IllegalAccessException("Illegal access to the body");
        }
        else {
            throw new IOException("Strange error");
        }


    }

    private static void myThrowCheckedExc4() throws Exception{

        int g = 3;
        int y = 6;
        if(g - 4 > y){
            throw new IllegalAccessException("Illegal access to the body");
        }
        else {
            throw new IOException("Strange error");
        }


    }


    private static void myThrowUncheckedExc() throws NullPointerException{
        throw new NullPointerException("You got null");
    }

    private static void myThrowUncheckedExc2(){
        throw new NullPointerException("You got null");
    }

}

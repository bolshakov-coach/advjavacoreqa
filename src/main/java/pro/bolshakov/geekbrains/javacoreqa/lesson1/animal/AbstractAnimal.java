package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public abstract class AbstractAnimal implements Animal{

    private int heartRate;

    public AbstractAnimal(int heartRate) {
        this.heartRate = heartRate;
    }

    abstract void sound();

    public void heartBeat(){
        System.out.println("Heart beat with pace -> " + heartRate);
    }
}

package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class Cat {

    public String name;
    protected String color;
    int age;
    private String hidedId;

    public Cat() {
    }

    public Cat(String _name, String _color, int _age, String _hidedId) {
        name = _name;
        color = _color;
        age = _age;
        hidedId = _hidedId;
    }

    public void methodPublic(){
        System.out.println("It is public method");
    }

    protected void methodProtected(){
        System.out.println("It is protected method");
    }

    void methodPackage(){
        System.out.println("It is package method");
    }

    private void methodPrivate(){
        System.out.println("It is private method");
    }

    public void callPrivateMethod(){
        methodPrivate();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", hidedId='" + hidedId + '\'' +
                '}';
    }
}

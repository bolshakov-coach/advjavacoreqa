package pro.bolshakov.geekbrains.javacoreqa.lesson1.animal;

public class WildCat extends Cat {

    public WildCat() {
        super();
    }

    @Override
    public void methodPublic() {
        super.methodPublic();
        System.out.println("WildCat - Call method");
    }

    @Override
    protected void methodProtected() {
        super.methodProtected();
        System.out.println("WildCat - Call method");
    }

    @Override
    void methodPackage() {
        super.methodPackage();
        System.out.println("WildCat - Call method");
    }
}

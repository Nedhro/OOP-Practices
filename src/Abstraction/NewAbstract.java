package Abstraction;

public class NewAbstract {
    public static void main(String[] args) {
        MacBook obj = new MacBook();
        Asus obj1= new Asus();
        show(obj);
        show(obj1);
    }

    public static void show(Laptop obj) {
        obj.showConfig();
    }
}
abstract class Laptop{
    public abstract void showConfig();
}

class MacBook extends Laptop {
    public void showConfig() {
        System.out.println(" 8GB RAM");
    }
}

class Asus extends Laptop {
    public void showConfig() {
        System.out.println(" 6GB RAM");
    }
}
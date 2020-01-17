package Abstraction;

public class AbstractDemo {

    public static void main(String[] args) {
        Redmi obj = new Samsung();
        obj.call();
        obj.move();
        obj.message();
    }
}

abstract class Iphone {
    public void call() {     // concrete method
        System.out.println("Calling by Iphone...");
    }

    public abstract void message(); //abstract

    public abstract void move(); //abstract

}

abstract class Redmi extends Iphone {
    public void call() {
        System.out.println("Calling by Redmi...");
    }

    public void move() {
        System.out.println("The phone is moving...");
    }

}

class Samsung extends Redmi { //concrete
    public void message() {
        System.out.println("The phone can send message...");
    }
}
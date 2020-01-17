package Polymorphism;

public class StaticPolymorphism {
    public void call(){
        System.out.println("Void call");
    }
    public int call(int a){
        System.out.println("Int call");
        return a;
    }
    public String call(String a){
        System.out.println("String call");
        return a;
    }

    public static void main(String[] args) {
        StaticPolymorphism obj=new StaticPolymorphism();
        obj.call("hello");
        obj.call(34);
        obj.call();
    }
}

package Polymorphism;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        B obj=new B();
        obj.call();
        obj.call(32);
    }
}
class A{
    public void call(){
        System.out.println("Void call");
    }
}
class B extends A{
    public int call(int a){
        System.out.println("Int call" +a);
        return a;
    }
}
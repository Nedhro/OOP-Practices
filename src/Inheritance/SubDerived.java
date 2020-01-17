package Inheritance;

public class SubDerived extends Base {
    public SubDerived() {
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SubDerived obj=new SubDerived();
        System.out.println("Class Name : "+obj.name);
        obj.operate();
    }
}

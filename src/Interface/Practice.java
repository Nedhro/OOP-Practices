package Interface;

interface Add{
    public int add(int a, int b);
}

interface Sub{
    public int sub(int a, int b);
}
class Implementer implements Add,Sub{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}

public class Practice {
    public static void main(String[] args) {
        Implementer obj=new Implementer();
        System.out.println( obj.add(2,3));
        System.out.println( obj.sub(3,2));
    }
}

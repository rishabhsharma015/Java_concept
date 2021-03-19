class A1{
    public void meth1(){
        System.out.println("Method 1 of class A1");
    }
    public void meth2(){
        System.out.println("Method 2 of class A1");
    }
}

class B1 extends A1{
    public void methB(){
        System.out.println("Method 1 of class B1");
    }

    @Override
    public void meth2(){
        System.out.println("Method 2 of class B1");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A1 b = new B1();
        b.meth2();
        b.meth1();
    }
}

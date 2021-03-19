class Base{
    public Base(){
        System.out.println("I am a base class Constructor");
    }

    public Base(int a){
        System.out.println("Base constructor value is "+a);
    }
}

class Derived extends Base{

    public Derived(){
        System.out.println("I am a Derived class Constructor");
    }

    public Derived(int a){
        super(7);
        System.out.println("Derived constructor value is "+a);
    }
}

class childDerived extends Derived{
    public childDerived(){
        super(5);
        System.out.println("I am a child of Derived class Constructor");
    }
    public childDerived(int a){

        System.out.println("childDerived constructor value is "+a);
    }
}

public class constructors_in_Inheritance {
    public static void main(String[] args) {

        childDerived d = new childDerived();
    }
}

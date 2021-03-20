abstract class Parent{              // A single abstract method in a class can make the class abstract.
                                    // An abstract class can have both abstract and non abstract methods.
    abstract void name();           // Abstract class can not be Instantiated.
    abstract void section();        // Reference of an abstract class can be created.
    abstract void color();

    public void myMethod(){
        System.out.println("method");
    }
}

class Child extends Parent{
    public void name(){ System.out.println("I am Java"); }
    public void section(){
        System.out.println("D");
    }
    public void color(){
        System.out.println("Blue");
    }
}

public class Abstract_Class_concept {
    public static void main(String[] args) {
       // Child c = new Child();    // Object of an abstract class can not be created.

         Parent p = new Child();   // Reference of an abstract class can be created.

      //  Parent p1 = new Parent(); // This will give an Error.


    }
}

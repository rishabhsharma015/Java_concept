interface Myinterface{
    int i = 5;                                    // By default i is final, it can't be modified.
    void meth1();
    void meth2();

//    void meth3(){
//        System.out.println("implemented");      // Interface abstract methods cannot have body(Implementation).
//    }                                           // Interface cannot be instantiated.
}

class NewClass implements Myinterface{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
}

public class Interface_concept {
    public static void main(String[] args) {
//   Myinterface a = new Myinterface();     // It will give me an error (Myinterface is abstract and cannot be instantiated)
      Myinterface n = new NewClass();        // we can create reference of Myinterface .
       // n.i = 10;                          // It will give you an error.
         //  n.meth3();              // It will give me an error - Cannot resolve meth3() in Myinterface.
         }
    }


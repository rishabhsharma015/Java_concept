interface Myinterface{
    int i = 5;                                   
    void meth1();
    void meth2();     
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
      Myinterface n = new NewClass();        
                   
         }
    }


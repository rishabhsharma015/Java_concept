class Calc            // Super, Parent, Base
{
    public int add(int i, int j)
    {
        return i+j;
    }

    public Calc()
    {
        System.out.println("Calc");
    }

}

class Myclass1 extends Calc
{
    public void greet()
    {
        System.out.println("Hello World");
    }
    public Myclass1()
    {
        System.out.println("Myclass1");
    }

}

class CalcAdv  extends Myclass1           // Sub, Child, Derived
{
    public int add(int i, int j)
    {
        return i+j;
    }
    public int sub(int i, int j)
    {
        return i-j;
    }
    public CalcAdv()
    {
        System.out.println("CalcAdv");
    }
}



public class InheritenceDemo {
    public static void main(String[] args) {
        CalcAdv ob = new CalcAdv();
        System.out.println(ob.add(20,15));
        System.out.println(ob.sub(20,15));
        ob.greet();
        System.out.println(ob.add(4,5));
    }
}

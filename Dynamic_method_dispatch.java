class Phone{                                                                     // Super class
    public void showTime(){
        System.out.println("Time is 8:00 AM");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}

class SmartPhone extends Phone{                                                  // Sub class
    public void music(){
        System.out.println("Playing Music...");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }

    public void Ring(){
        System.out.println("SmartPhone is Ringing....");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();                                         // It is Allowed

        obj.on();                                        // SmartPhone ka object bana hai to uska "on()" method run hoga
        obj.showTime();                                  // or bache hue methods ( music(), Ring() ) run nhi honge

                                                         // Phone ka reference bana hai to uska "on()" method run nhi hoga
                                                         // baaki bache hue methods run honge.
        // These two method will not execute
        // 1) obj.Ring();
        // 2) obj.music();


    }
}

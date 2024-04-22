package hirarchical7;

import hirarchical6.Cat;

public class Bicycle extends Vehicle {

    public void speedUp() {
        super.speedUp();
       System.out.println("Bicycle speed is 10");

    }

    public static void main(String[] args) {
        Bicycle b2 =new Bicycle();
        b2.speedUp();
        System.out.println("Cycle speed " +b2.getSpeed());
    }
}


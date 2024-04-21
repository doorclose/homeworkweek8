package inheritance2;

public class Car extends Vehical{

    @Override
    public void drive() {
      //  super.drive();

        System.out.println("Reparing a car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}


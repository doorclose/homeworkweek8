package Inheritence5;

public class Car extends Vehicle {
    public Car(String make, String model, int year, String fueltype){
        super(make,model,year,fueltype);
        //his.volvoCapicity = volvocapicity
    }

    public Car() {
        super();
    }

    @Override
    public double fuelefficiency() {
        return super.fuelefficiency();
    }

    @Override
    public double distancetravell()
    {
        return super.distancetravell() * fuelefficiency();
    }

    @Override
    public int maximumspeed() {
        return super.maximumspeed();
        //  return 40;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.fuelefficiency();
        car.distancetravell();
        car.maximumspeed();
    }
}


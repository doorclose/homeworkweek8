package Inheritence5;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fueltype){
        super(make,model,year,fueltype);
        //his.volvoCapicity = volvocapicity
    }

    public Motorcycle() {
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
        Motorcycle m = new Motorcycle();
        m.fuelefficiency();
        m.distancetravell();
        m.maximumspeed();
    }
}
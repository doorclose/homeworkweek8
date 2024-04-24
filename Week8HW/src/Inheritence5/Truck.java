package Inheritence5;

public class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fueltype){
        super(make,model,year,fueltype);
       //his.volvoCapicity = volvocapicity
    }

    public Truck() {
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
        Truck t = new Truck();
t.fuelefficiency();
t.distancetravell();
t.maximumspeed();
}
}
package Inheritence5;
//Write a Java program to create a vehicle class hierarchy. The base class should be
//Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
//properties such as make, model, year, and fuel type. Implement methods for
//calculating fuel efficiency, distance traveled, and maximum speed.
public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String fueltype;

    public Vehicle (String make,String model, int year ,String fueltype ){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype =fueltype;
    }

    public Vehicle() {

    }

    public String getmake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFueltype() {
        return fueltype;
    }

    public double fuelefficiency(){
        return 0.0;
     }
public double distancetravell(){
return 0.0;
}
public int maximumspeed(){
return 0;
}
}

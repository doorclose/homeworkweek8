package hirarchical7;

public class Car extends Vehicle {

    @Override
    public void speedUp(){
       super.speedUp();
       System.out.println("Car speed  increase by 20");
    }

    public static void main(String[] args) {
        Car s2 = new Car();
        s2.speedUp();
        System.out.println("Increase car speed" + s2.getSpeed());
    }

}
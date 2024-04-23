package inheritence8;

import inheritance2.Car;

public class Manager extends Employee {

    @Override
    public void calculate() {
      //  super.calculate();

        System.out.println("Employee salary £30000");
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculate();

    }
}
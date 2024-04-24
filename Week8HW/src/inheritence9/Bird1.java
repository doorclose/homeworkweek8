package inheritence9;

import hirarchical6.Bird;

public class Bird1 extends Animal1 {

    @Override
    public void move() {
        super.move();
        System.out.println("Birds sound sweet n lovely");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Animal sound very scary");
    }

    public static void main(String[] args) {
        Bird1 b = new Bird1();
        b.makeSound();
        b.move();
    }
}

package inheritence9;

import inheritence4.Animal;

//Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera. Override the move() method
//in each subclass to describe how each animal moves. Also, override the makeSound()
//method in each subclass to make a specific sound for each animal.
public class Panther1 extends Animal {

    @Override
    public void move() {
       // super.move();
        System.out.println("Panther runs very fast");
    }
    public void makeSound(){

        System.out.println("Panthar walk like king");
    }

    public static void main(String[] args) {
        Panther1 p = new Panther1();
        p.makeSound();
        p.move();
    }
    }


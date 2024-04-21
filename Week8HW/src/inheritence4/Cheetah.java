package inheritence4;

public class Cheetah extends Animal {

    @Override
    public void move() {
        //super.move();
        System.out.println("Animals are humans friends");
    }

    public static void main(String[] args) {
     Cheetah c= new Cheetah();
     c.move();
    }
}

package hirarchical6;

public class Cat extends AnimalFamily{
    public void Sound() {
        System.out.println("Cat  sounds mew mew ");

    }

    public static void main(String[] args) {
       Cat c2 =new Cat();
        c2.Sound();
    }
}



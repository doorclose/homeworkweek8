package hirarchical6;

import inheritence4.Animal;
import inheritence4.Cheetah;

public class Bird extends AnimalFamily{
 public void Sound(){
        System.out.println("Coco sounds cooocoo ");

    }

    public static void main(String[] args) {
        Bird b2 =new Bird();
        b2.Sound();
    }
}

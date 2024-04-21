package inheritence1;

public class Codebustergroup extends Codebuster {

    @Override
    public void groupName() {
        System.out.println("Codebuster group");
      //  super.groupName();
    }

    public static void main(String[] args) {
        Codebustergroup c= new Codebustergroup();
        c.groupName();
    }
}

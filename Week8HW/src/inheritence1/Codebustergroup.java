package inheritence1;
//Write a Java program to create a class called codebuster with a method called
//groupName(). Create a subclass called codebusterGroups() that overrides the
//groupName() method.
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

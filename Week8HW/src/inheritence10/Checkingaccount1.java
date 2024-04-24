package inheritence10;

public class Checkingaccount1 extends Bankaccount1 {

    public void withdraw() {
        //   super.withdraw();
        System.out.println("withdraw money carefully and limit is £6000");
    }

    public static void main(String[] args) {
        Checkingaccount1 c =new Checkingaccount1();
        c.withdraw();
    }
}



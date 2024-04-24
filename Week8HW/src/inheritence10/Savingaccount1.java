package inheritence10;

public class Savingaccount1 extends Bankaccount1 {
    @Override
    public void withdraw() {
     //   super.withdraw();
        System.out.println("maximum withdraw is £5000");
    }

    public static void main(String[] args) {
        Savingaccount1 s =new Savingaccount1();
        s.withdraw();
    }
}

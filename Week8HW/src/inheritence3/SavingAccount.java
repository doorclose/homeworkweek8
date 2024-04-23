package inheritence3;
//Write a Java program to create a class known as "BankAccount" with methods called
//deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
//withdraw() method to prevent withdrawals if the account balance falls below one
//hundred.
public class SavingAccount extends BankAccount {

    @Override
    public void withdraw() {
        //   super.withdraw();
        System.out.println(" client want to Widraw money");
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw();
    }
}



package inheritence10;
//10. Write a Java program to create a base class BankAccount with methods deposit() and
//withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//withdraw() method in each subclass to impose different withdrawal limits and fees.
public class Bankaccount1 {

    public void deposit(){
        System.out.println("Savingaccount need minimum balance");
    }
    public void withdraw(){
        System.out.println("withdraw money with receipt always");
    }
}


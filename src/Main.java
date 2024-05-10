//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.deposit(50);
        account1.deposit(50);
        account1.withdraw(20);
        double totalCurrentBalance = account1.getBalance();
        System.out.println(totalCurrentBalance);
        System.out.println("expected: 80");

    }
}
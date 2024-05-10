//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    CashRegister register1 = new CashRegister(1,1);
    register1.recordPurchase(29.50);
    register1.recordPurchase(9.25);
    register1.recordPayment(100);
    double change = register1.giveChange();
    System.out.println(change);
    CashRegister register2 = new CashRegister();
    register2.recordPurchase(30);
    register2.recordPurchase(9);
    register2.recordPayment(50);
    double change1 = register2.giveChange();
    System.out.println(change1);
    }
}
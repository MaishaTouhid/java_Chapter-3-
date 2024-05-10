public class CashRegister {
    private double purchase;
    private double payment ;
    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public CashRegister(double purchase, double payment) {
        this.purchase = purchase;
        this.payment = payment;
    }
    public void recordPurchase(double amount){
        purchase = purchase + amount;
    }
    public void recordPayment(double amount){
        payment = payment + amount;
    }
    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;

    }

}

public class Bank1 implements IOptions {
    private double balance;

    public void addMoney(double money) {
        balance += money;
    }


    public void withdrawMoney(double money) {
        balance -= money;
    }

    public String bank() {
        return Double.toString(balance);
    }

}

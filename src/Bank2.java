public class Bank2 implements IOptions {
    private double balance;

    public void addMoney(double money) {
        balance += money*1.01;
    }


    public void withdrawMoney(double money) {
        balance -= money;
    }

    public String bank() {
        return Double.toString(balance);
    }
}

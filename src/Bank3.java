import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class Bank3 implements IOptions {

    private double balance;

    public void addMoney(double money) {
        balance += money*0.99;
    }


    public void withdrawMoney(double money) {
        balance -= money;
    }

    public String bank() {
        return Double.toString(balance);
    }
}

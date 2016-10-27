public class Main {
    public static void main(String[] args) {
        IOptions b1 = new Bank1();
        IOptions b2 = new Bank2();
        IOptions b3 = new Bank3();
        IOptions arr[] = new IOptions[3];
        arr[0]=b1;
        arr[1]=b2;
        arr[2]=b3;

        for (int i = 0; i < arr.length; i++) {
            arr[i].addMoney(200);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].withdrawMoney(120);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].bank());
        }

    }
}

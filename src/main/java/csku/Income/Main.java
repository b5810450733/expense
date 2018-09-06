package csku.Income;

public class Main {
    public static void main(String[] args) {
        Income in = new Income();
        System.out.println(in.moneyIn(5000));
        System.out.println(in.moneyOut(3000));
        System.out.println(in.baLance());
        System.out.println(in.toString());

    }
}

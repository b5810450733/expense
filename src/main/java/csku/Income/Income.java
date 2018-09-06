package csku.Income;

public class Income {
    public int incomeMoney = 0 , monOut = 0 , balant = 0 , moneyInt = 0;


    public Income() {
    }

    public int moneyIn(int in){
        incomeMoney += in;
        this.moneyInt = in;
        this.balant += in;
        return  in; //"You Income : " +
    }

    public int moneyOut (int out){
        if (out > getBalant()){
            int newbalant = 0;
            newbalant = getBalant();
            incomeMoney = 0;
            balant = 0;
            monOut = newbalant;
            return newbalant;
        }else {
            incomeMoney -= out;
            balant -= out;
            monOut = out;
        }
        return out; //"Your Spend : "+
    }

    public int baLance(){
        balant = incomeMoney;
        return incomeMoney; // "Your Balance : " +
    }

    @Override
    public String toString() {
        return "Initial income = " + moneyInt + " || Expense = " + monOut+" || Remaining income = " + balant ;
    }

    public int getIncomeMoney() {
        return incomeMoney;
    }

    public int getMonOut() {
        return monOut;
    }

    public int getBalant() {
        return balant;
    }

    public int getMoneyInt() {
        return moneyInt;
    }
}

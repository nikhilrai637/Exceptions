public class Account {
    private int balance = 10000;
    public void debit(int amount){
        if(balance < amount)
            throw  new IllegalArgumentException("Insufficient Balance");
    }
}

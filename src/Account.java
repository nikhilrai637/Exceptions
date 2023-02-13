import java.io.IOException;

public class Account {
    private int balance = 10000;
    public void debit(int amount){
        if(balance < amount)
            throw  new IllegalArgumentException("Insufficient Balance");
    }

    //IOException

    public void credit(int amount) throws IOException{
        if(amount<0)
            throw  new IOException("credited amount cannot be negative");
    }
}

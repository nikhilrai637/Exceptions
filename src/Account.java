import java.io.IOException;

public class Account {
    private static int balance = 10000;
    public static void debit(int amount){
        if(balance < amount)
            throw  new IllegalArgumentException("Insufficient Balance");
    }

    //IOException

    public static void credit(int amount) throws IOException{
        if(amount<0)
            throw  new IOException("credited amount cannot be negative");
    }
}

import java.io.IOException;

public class ATM {
    public static void display() throws   InsufficientFundsException {
      //  Account.debit(50_000);

        try {
            Account.credit(-1);
        } catch (  InsufficientFundsException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

}

import java.io.IOException;

public class ATM {
    public static void display() throws IOException {
        Account.debit(50_000);

        try {
            Account.credit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }

}

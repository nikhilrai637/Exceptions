import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.debit(10);

        try {
            account.credit(-100);
        } catch (IOException e) {
            System.out.println("Exception handling happens at the caller function " +
                    ", not where we throw it at first place");
        }
    }

}
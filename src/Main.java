import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ATM.display();
        } catch (Throwable e) {
            var cause = e.getCause(); //Getting the caused Exception
            System.out.println("Accessing the message directly from caused exception object");
            System.out.println(cause.getMessage());
        }
    }

}
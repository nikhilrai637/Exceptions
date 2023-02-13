import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ATM.display();
        } catch (Throwable e) {
            System.out.println("An error occured." +
                    " This is an example of chaining exceptions." +
                    " Using Throwable class we are catching generic exceptions");
        }
    }

}
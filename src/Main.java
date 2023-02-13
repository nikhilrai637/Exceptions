import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ATM.display();
        } catch (Throwable e) {
             e.printStackTrace();
        }
    }

}
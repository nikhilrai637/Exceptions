import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!!");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

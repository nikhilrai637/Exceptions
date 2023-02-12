import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

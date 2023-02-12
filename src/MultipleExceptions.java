import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e) {
//             e.printStackTrace();
//        }
    }
}

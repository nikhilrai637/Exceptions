import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {

    public static void show()  {

        try( var reader  = new FileReader("file.txt")) {
            reader.read();
        } catch (IOException e) {
            System.out.println("Replaced FileNotFoundException with IOException because of " +
                    "auto closure resource IOException");

        }


    }
}

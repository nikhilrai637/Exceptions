import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FinalBlock {
    public static void show(){
        FileReader reader  = null;
        try {
              reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException e) {
            System.out.println("Could not read Data");
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("reader is null");
            }
        }
    }

}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HappyBirthday {
    public static void main(String[] args) {
        // FileReader = read the contents of a file as a stream of characters
        //              one by on read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("BirthdayCard.txt");
            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

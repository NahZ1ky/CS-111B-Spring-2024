import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class zybook_1207 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();

        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner fileScanner = new Scanner(fileStream);

        while (fileScanner.hasNextLine()) {
            String photoFileName = fileScanner.nextLine();
            String infoFileName = photoFileName.replace("_photo.jpg", "_info.txt");
            System.out.println(infoFileName);
        }

        fileScanner.close();
        scnr.close();
    }
}
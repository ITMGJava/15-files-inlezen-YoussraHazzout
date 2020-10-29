import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen2 {

    public static void main(String[] args) {
        try {
            BestandInlezen("Hello.txt");

        } catch (FileNotFoundException f) {
            System.out.println("Het bestand kan niet worden gelezen");
            System.out.println("Foutmelding!:" + f.getMessage());
        }
    }

    static void BestandInlezen(String file) throws FileNotFoundException {
        File f = new File("Hello.txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }

    }

}

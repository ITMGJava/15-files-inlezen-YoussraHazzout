import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {
    public static void main(String[] args) {
        try {
            File f = new File("Hello.txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch(FileNotFoundException f){
            System.out.println("Het bestand kan niet gevonden worden.");
            f.printStackTrace();
        }
        }
            //System.out.println("Het bestand is ingelezen!");
            //static void bestandInlezen(String f) {

            }


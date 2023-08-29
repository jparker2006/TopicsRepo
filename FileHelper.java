import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHelper {
    // Parameter is the full file path of where the file is on your computer
    public static void readFromFile(String sFilePath) {
        try {
            File i_file = new File(sFilePath);
            Scanner i_scanner = new Scanner(i_file);
            while (i_scanner.hasNextLine()) {
                String sLine = i_scanner.nextLine();
                System.out.println(sLine);
            }
            i_scanner.close();
            System.out.println("Your file has been read.");
        } catch (FileNotFoundException e) {
            System.out.println("There was an error with your file:");
            e.printStackTrace();
        }
    }

    // Parameter output path is the full file path of where you want the file to be on your computer
    // Parameter text is the text you want in the output files contents
    public static void writeToFile(String sOutputPath, String sText) {
        try {
            FileWriter o_file = new FileWriter(sOutputPath);
            o_file.write(sText);
            o_file.close();
            System.out.println("Your file has been written.");
        } catch (IOException e) {
            System.out.println("There was an error with your file:");
            e.printStackTrace();
        }
    }
}

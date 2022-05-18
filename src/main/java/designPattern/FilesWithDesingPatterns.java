package designPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesWithDesingPatterns{
    public static void main(String[] args) throws IOException {
        File singleton = new File("singleton.txt");
        File builder= new File("builder.txt");

        createFile(singleton);
        writeToFile(singleton);

        createFile(builder);
        writeToFile(builder);

    }


    //Methods for created and writing file singleton.txt
    private static void createFile(File file) throws IOException {
        boolean newFile = file.createNewFile();
    }

    private static void writeToFile(File file) throws FileNotFoundException {
        PrintWriter entry = new PrintWriter(file);
        entry.println("What is this singleton?");
        entry.println("""
                Singleton ->  There is only one instance of a class
                     for the entire program, and no other can be created.
                     The instance is available for entire code -> is public and static!
                     Warning! Static breaks the principle of object orientation.""");
        entry.close();
    }
}
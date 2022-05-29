package designPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesWithDesingPatterns {
    public static void main(String[] args) throws IOException {

        /*
        File singleton = new File("singleton.txt");
        createFile(singleton);
        writeToFile(singleton);

        File builder = new File("builder.txt");
        createFile(builder);
        writeToFile(builder);
        */

        File factory = new File("factory.txt");
        createFile(factory);
        writeToFile(factory);


    }


    //Methods for created and writing file singleton.txt
    private static void createFile(File file) throws IOException {
        boolean newFile = file.createNewFile();
    }

    private static void writeToFile(File file) throws FileNotFoundException {
        PrintWriter entry = new PrintWriter(file);
        entry.println("*** FACTORY ***");
        entry.println("""
                What is this factory pattern
                Factory ->  Exists in three forms:
                           * factory method
                           * abstract factory
                           * factory
                           When there is a need to define certain objects or types of objects to be built in some intended way.
                           There should be objects that are practical and have very specific fields.
                            
                      """);
        entry.close();
    }
}
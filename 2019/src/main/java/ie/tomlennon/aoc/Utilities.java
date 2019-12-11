package ie.tomlennon.aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilities {

    private Utilities(){

    }

    public static final Collection<String> readInputFile(String absolutePath){
        Collection<String> fileContents = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                absolutePath)))
        {
            String line = reader.readLine();
            while (line != null) {
                fileContents.add(line);
                // read next line
                line = reader.readLine();
            }

        } catch (IOException ioe) {
            Logger.getAnonymousLogger().log(Level.WARNING, "IOException throwns in parsing file", ioe);
        }

        return fileContents;
    }

}

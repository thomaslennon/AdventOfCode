package ie.tomlennon.aoc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Utilities {

    private Utilities() {

    }

    public static Collection<String> readInputFile(String absolutePath) {
        Collection<String> fileContents = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                absolutePath))) {
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

    public static List<Integer> getCodesAsIntegers(Collection<String> fileContents) {
        List<Integer> code = new ArrayList<>();
        for (String fileLine : fileContents) {
            StringTokenizer tokenizer = new StringTokenizer(fileLine, ",");
            while (tokenizer.hasMoreTokens()) {
                code.add(Integer.parseInt(tokenizer.nextToken()));
            }
        }
        return code;
    }

    public static List<String> getCodesAsStrings(Collection<String> fileContents) {
        List<String> code = new ArrayList<>();
        for (String fileLine : fileContents) {
            StringTokenizer tokenizer = new StringTokenizer(fileLine, ",");
            while (tokenizer.hasMoreTokens()) {
                code.add(tokenizer.nextToken());
            }
        }
        return code;
    }
}

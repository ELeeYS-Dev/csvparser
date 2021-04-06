package csvparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileLoader {
    public static BufferedReader loadFile(String path) throws FileNotFoundException {
        System.out.printf("Loading file: %s%n", path);
        return new BufferedReader(new FileReader(path));
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package csvparser;

import com.google.gson.Gson;
import csvparser.builder.Builder;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class App {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws IOException {
        System.out.println("Starting CSV Parser.");
        System.out.println("Author @ELeeYS-Dev");

        Builder builder = new Builder();

        BufferedReader br = FileLoader.loadFile("src/main/resources/input.csv");
        List<String[]> entries = CsvParser.parseCsv(br, true);
        Collection objects = builder.buildFromInputFields(entries);

        Gson gson = new Gson();
        FileWriter myWriter = new FileWriter("src/main/resources/result.json");
        myWriter.write(gson.toJson(objects));
        myWriter.close();
    }
}

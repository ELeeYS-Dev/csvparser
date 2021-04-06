package csvparser;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CsvParser {
    public static List<String[]> parseCsv(BufferedReader br, boolean hasHeader) throws IOException {
        String line = br.readLine();

        if (line != null && hasHeader)
            line = br.readLine();

        List<String[]> res = new ArrayList<>();
        while (line != null) {
            boolean openQuote = false;
            StringBuilder curString = new StringBuilder();
            List<String> values = new LinkedList<>();
            for (int i = 0; i < line.length(); i++) {
                char curChar = line.charAt(i);
                if (!openQuote && curChar == ',') {
                    values.add(curString.toString());
                    curString = new StringBuilder();
                } else if (curChar == '"') {
                    if (openQuote && i != line.length() - 1 && line.charAt(i + 1) == '"') {
                        curString.append('"');
                        i++;
                    } else
                        openQuote = !openQuote;
                } else
                    curString.append(curChar);
            }

            values.add(curString.toString());
            res.add(values.toArray(new String[0]));

            line = br.readLine();
        }
        return res;
    }
}

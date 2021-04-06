package csvparser.parser;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionParser {
    public static Collection<String> parseCollection(String str) {
        return Arrays.stream(str.split(","))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toSet());
    }
}

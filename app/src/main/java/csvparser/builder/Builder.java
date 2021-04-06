package csvparser.builder;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Builder {
    public Collection<Model> buildFromInputFields(List<String[]> fieldsList) {
        return fieldsList.stream()
                .map(this::build)
                .collect(Collectors.toSet());
    }

    protected Model build(String[] fields) {
        return new Model(fields);
    }
}

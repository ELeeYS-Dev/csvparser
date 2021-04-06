package csvparser.builder;

import csvparser.parser.CollectionParser;

import java.util.Collection;

// Update this model to whatever is needed
public class Model {
    private final String field1;
    private final String field2;
    private final String field3;
    private final Collection<String> collectionField4;

    public Model(String[] fields) {
        this.field1 = fields[0];
        this.field2 = fields[1];
        this.field3 = fields[2];
        this.collectionField4 = CollectionParser.parseCollection(fields[3]);
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public Collection<String> getCollectionField4() {
        return collectionField4;
    }
}

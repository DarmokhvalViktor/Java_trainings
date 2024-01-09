package fourth_subtask;

import java.util.stream.DoubleStream;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String definition;

    Gender(String definition) {
        this.definition = definition;
    }
    public void printDefinition() {
        System.out.println("Gender definition: " + definition);
    }
}

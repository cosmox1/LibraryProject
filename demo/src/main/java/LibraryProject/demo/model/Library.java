package LibraryProject.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;
//LastUpDate 05.06.2021
public class Library {
    private final UUID id;
    private final String name;

    public Library(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

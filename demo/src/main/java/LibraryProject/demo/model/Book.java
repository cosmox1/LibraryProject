package LibraryProject.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;
/** primul pas este sa creem un model de entitate
 * ce sa contina un nume si un tip
 * accestate doar prin getere si constr**/
public class Book {
private final UUID id;
private final String name;
private final String autor;

    public Book(@JsonProperty("id") UUID id, String name, @JsonProperty("autor") String autor
    ) {
        this.id = id;
        this.name = name;
        this.autor = autor;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }
}

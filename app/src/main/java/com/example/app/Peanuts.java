package com.example.app;


import javax.persistence.*;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
public class Peanuts  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(example = "Snoopy")
    private String name;

    @Schema(example = "Charlie Brown's pet beagle")
    private String description;

    // Id
    public Long getId() {
        return id;
    }

    // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

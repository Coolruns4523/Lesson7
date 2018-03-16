package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Tvshow {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min = 3, max = 10)
    private String type;

    @NotNull
    @Size(min = 10, max = 30)
    private String description;

    public Tvshow() {

    }

    private long getId() {
        return id;
    }

    private String getType() {
        return type;
    }

    private String getDescription() {
        return description;
    }
}

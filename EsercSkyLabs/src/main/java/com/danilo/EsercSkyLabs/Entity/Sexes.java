package com.danilo.EsercSkyLabs.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sexes")

public class Sexes {
    @Id
    private int id;
    private String name;

    public Sexes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.danilo.EsercSkyLabs.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "workclasses")

public class Workclasses {
    @Id
    private int id;
    private String name;

    public Workclasses(int id, String name) {
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

package com.hospital.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tools {
    private int id;
    private String type;
    private String moderate;
    private String weak;
    @GeneratedValue
    @Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModerate() {
        return moderate;
    }

    public void setModerate(String moderate) {
        this.moderate = moderate;
    }

    public String getWeak() {
        return weak;
    }

    public void setWeak(String weak) {
        this.weak = weak;
    }
}

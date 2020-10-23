package com.evergreen.evergreen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Species {

    @Id
    private Integer id;
    private String species;
    private String family;
    private String water_requirement;
    private String light_requirement;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getWater_requirement() {
        return water_requirement;
    }

    public void setWater_requirement(String water_requirement) {
        this.water_requirement = water_requirement;
    }

    public String getLight_requirement() {
        return light_requirement;
    }

    public void setLight_requirement(String light_requirement) {
        this.light_requirement = light_requirement;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

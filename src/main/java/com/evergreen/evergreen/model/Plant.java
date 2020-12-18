package com.evergreen.evergreen.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plant")
public class Plant {

    @Id
    private Integer id;

    private String name;
    private Integer size;
    private Integer age;
    private Boolean alive;
    @ManyToOne
    private Species specie;

    @OneToMany
    private List<Events_log> event;

    public Species getSpecie() {
        return specie;
    }

    public void setSpecie(Species specie) {
        this.specie = specie;
    }






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }




}

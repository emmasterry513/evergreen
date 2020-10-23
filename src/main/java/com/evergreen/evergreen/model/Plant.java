package com.evergreen.evergreen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    private Integer id;

    private String name;
    private Integer size;
    //private String species;
    //private Integer age;
    //private String status;

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

//    public String getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
}

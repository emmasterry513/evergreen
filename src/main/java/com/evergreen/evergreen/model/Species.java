package com.evergreen.evergreen.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="species")
public class Species {

    @Id
    private Integer id;
    private String specieName;
    private Long recommendedWater;
    private Integer waterFrencuency;
    private String plantLocation;
    private String sunRequeriment;

    @OneToMany
    private List<Plant> plants;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public Long getRecommendedWater() {
        return recommendedWater;
    }

    public void setRecommendedWater(Long recommendedWater) {
        this.recommendedWater = recommendedWater;
    }

    public Integer getWaterFrencuency() {
        return waterFrencuency;
    }

    public void setWaterFrencuency(Integer waterFrencuency) {
        this.waterFrencuency = waterFrencuency;
    }

    public String getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(String plantLocation) {
        this.plantLocation = plantLocation;
    }

    public String getSunRequeriment() {
        return sunRequeriment;
    }

    public void setSunRequeriment(String sunRequeriment) {
        this.sunRequeriment = sunRequeriment;
    }

}
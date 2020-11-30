package com.evergreen.evergreen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="events_log")
public class Events_log implements Serializable {


    @Id
    private Timestamp event_timestamp;
    private Integer plant_id;
    private String event_type;
    private Integer water_ammount;

    @Id
    @OneToOne
    private Plant plant;



    public Integer getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public Integer getWater_ammount() {
        return water_ammount;
    }

    public void setWater_ammount(Integer water_ammount) {
        this.water_ammount = water_ammount;
    }

    public Plant getPlant() {
        return plant;
    }

    public Timestamp getEvent_timestamp() {
        return event_timestamp;
    }

    public void setEvent_timestamp(Timestamp event_timestamp) {
        this.event_timestamp = event_timestamp;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }



}


package com.evergreen.evergreen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status {

    @Id
    private Integer id;
    private boolean status;
    private boolean replaceable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isReplaceable() {
        return replaceable;
    }

    public void setReplaceable(boolean replaceable) {
        this.replaceable = replaceable;
    }
}

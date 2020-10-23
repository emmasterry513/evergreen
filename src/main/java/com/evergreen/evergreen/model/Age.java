package com.evergreen.evergreen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Age {

    @Id
    private Integer id;
    private Integer age;
    private Integer days_alive_streak;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDays_alive_streak() {
        return days_alive_streak;
    }

    public void setDays_alive_streak(Integer days_alive_streak) {
        this.days_alive_streak = days_alive_streak;
    }
}

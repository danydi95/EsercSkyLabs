package com.danilo.EsercSkyLabs.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "records")

public class Records {
    @Id
    private int id;
    private int age;
    private int workclass_id;
    private int education_level_id;
    private int education_num;
    private int marital_status_id;
    private int occupation_id;
    private int relationship_id;
    private int race_id;
    private int sex_id;
    private int capital_gain;
    private int capital_loss;
    private int hours_week;
    private int country_id;
    private boolean over_50k;

    public Records(int id, int age, int workclass_id, int education_level_id, int education_num, int marital_status_id, int occupation_id, int relationship_id, int race_id, int sex_id, int capital_gain, int capital_loss, int hours_week, int country_id, boolean over_50k) {
        this.id = id;
        this.age = age;
        this.workclass_id = workclass_id;
        this.education_level_id = education_level_id;
        this.education_num = education_num;
        this.marital_status_id = marital_status_id;
        this.occupation_id = occupation_id;
        this.relationship_id = relationship_id;
        this.race_id = race_id;
        this.sex_id = sex_id;
        this.capital_gain = capital_gain;
        this.capital_loss = capital_loss;
        this.hours_week = hours_week;
        this.country_id = country_id;
        this.over_50k = over_50k;
    }

    public Records(int age)
    {
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkclass_id() {
        return workclass_id;
    }

    public void setWorkclass_id(int workclass_id) {
        this.workclass_id = workclass_id;
    }

    public int getEducation_level_id() {
        return education_level_id;
    }

    public void setEducation_level_id(int education_level_id) {
        this.education_level_id = education_level_id;
    }

    public int getEducation_num() {
        return education_num;
    }

    public void setEducation_num(int education_num) {
        this.education_num = education_num;
    }

    public int getMarital_status_id() {
        return marital_status_id;
    }

    public void setMarital_status_id(int marital_status_id) {
        this.marital_status_id = marital_status_id;
    }

    public int getOccupation_id() {
        return occupation_id;
    }

    public void setOccupation_id(int occupation_id) {
        this.occupation_id = occupation_id;
    }

    public int getRelationship_id() {
        return relationship_id;
    }

    public void setRelationship_id(int relationship_id) {
        this.relationship_id = relationship_id;
    }

    public int getRace_id() {
        return race_id;
    }

    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }

    public int getSex_id() {
        return sex_id;
    }

    public void setSex_id(int sex_id) {
        this.sex_id = sex_id;
    }

    public int getCapital_gain() {
        return capital_gain;
    }

    public void setCapital_gain(int capital_gain) {
        this.capital_gain = capital_gain;
    }

    public int getCapital_loss() {
        return capital_loss;
    }

    public void setCapital_loss(int capital_loss) {
        this.capital_loss = capital_loss;
    }

    public int getHours_week() {
        return hours_week;
    }

    public void setHours_week(int hours_week) {
        this.hours_week = hours_week;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public boolean isOver_50k() {
        return over_50k;
    }

    public void setOver_50k(boolean over_50k) {
        this.over_50k = over_50k;
    }
}

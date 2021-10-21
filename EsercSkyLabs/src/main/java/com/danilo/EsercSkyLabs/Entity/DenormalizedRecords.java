package com.danilo.EsercSkyLabs.Entity;


public class DenormalizedRecords {
    private int id;
    private int age;
    private int workclass_id;
    private String workclass_name;
    private int education_level_id;
    private String education_level_name;
    private int education_num;
    private int marital_status_id;
    private String marital_status_name;
    private int occupation_id;
    private String occupation_name;
    private int relationship_id;
    private String relationship_name;
    private int race_id;
    private String race_name;
    private int sex_id;
    private String sex_name;
    private int capital_gain;
    private int capital_loss;
    private int hours_week;
    private int country_id;
    private String country_name;
    private boolean over_50k;

    public DenormalizedRecords(int id, int age, int workclass_id, String workclass_name, int education_level_id, String education_level_name, int education_num, int marital_status_id, String marital_status_name, int occupation_id, String occupation_name, int relationship_id, String relationship_name, int race_id, String race_name, int sex_id, String sex_name, int capital_gain, int capital_loss, int hours_week, int country_id, String country_name, boolean over_50k) {
        this.id = id;
        this.age = age;
        this.workclass_id = workclass_id;
        this.workclass_name = workclass_name;
        this.education_level_id = education_level_id;
        this.education_level_name = education_level_name;
        this.education_num = education_num;
        this.marital_status_id = marital_status_id;
        this.marital_status_name = marital_status_name;
        this.occupation_id = occupation_id;
        this.occupation_name = occupation_name;
        this.relationship_id = relationship_id;
        this.relationship_name = relationship_name;
        this.race_id = race_id;
        this.race_name = race_name;
        this.sex_id = sex_id;
        this.sex_name = sex_name;
        this.capital_gain = capital_gain;
        this.capital_loss = capital_loss;
        this.hours_week = hours_week;
        this.country_id = country_id;
        this.country_name = country_name;
        this.over_50k = over_50k;
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

    public String getWorkclass_name() {
        return workclass_name;
    }

    public void setWorkclass_name(String workclass_name) {
        this.workclass_name = workclass_name;
    }

    public int getEducation_level_id() {
        return education_level_id;
    }

    public void setEducation_level_id(int education_level_id) {
        this.education_level_id = education_level_id;
    }

    public String getEducation_level_name() {
        return education_level_name;
    }

    public void setEducation_level_name(String education_level_name) {
        this.education_level_name = education_level_name;
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

    public String getMarital_status_name() {
        return marital_status_name;
    }

    public void setMarital_status_name(String marital_status_name) {
        this.marital_status_name = marital_status_name;
    }

    public int getOccupation_id() {
        return occupation_id;
    }

    public void setOccupation_id(int occupation_id) {
        this.occupation_id = occupation_id;
    }

    public String getOccupation_name() {
        return occupation_name;
    }

    public void setOccupation_name(String occupation_name) {
        this.occupation_name = occupation_name;
    }

    public int getRelationship_id() {
        return relationship_id;
    }

    public void setRelationship_id(int relationship_id) {
        this.relationship_id = relationship_id;
    }

    public String getRelationship_name() {
        return relationship_name;
    }

    public void setRelationship_name(String relationship_name) {
        this.relationship_name = relationship_name;
    }

    public int getRace_id() {
        return race_id;
    }

    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }

    public String getRace_name() {
        return race_name;
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }

    public int getSex_id() {
        return sex_id;
    }

    public void setSex_id(int sex_id) {
        this.sex_id = sex_id;
    }

    public String getSex_name() {
        return sex_name;
    }

    public void setSex_name(String sex_name) {
        this.sex_name = sex_name;
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

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public boolean isOver_50k() {
        return over_50k;
    }

    public void setOver_50k(boolean over_50k) {
        this.over_50k = over_50k;
    }
}
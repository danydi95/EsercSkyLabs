package com.danilo.EsercSkyLabs.Entity;

public class Stats {
    private String aggregationType;
    private int aggregationValue;
    private float capital_gain_sum;
    private float capital_gain_avg;
    private float capital_loss_sum;
    private float capital_loss_avg;
    private int over_50k_count;
    private int under_50k_count;

    public Stats(String aggregationType, int aggregationValue, float capital_gain_sum, float capital_gain_avg, float capital_loss_sum, float capital_loss_avg, int over_50k_count, int under_50k_count) {
        this.aggregationType = aggregationType;
        this.aggregationValue = aggregationValue;
        this.capital_gain_sum = capital_gain_sum;
        this.capital_gain_avg = capital_gain_avg;
        this.capital_loss_sum = capital_loss_sum;
        this.capital_loss_avg = capital_loss_avg;
        this.over_50k_count = over_50k_count;
        this.under_50k_count = under_50k_count;
    }

    public Stats(float capital_gain_sum, float capital_gain_avg, float capital_loss_sum, float capital_loss_avg, int over_50k_count, int under_50k_count) {
        this.capital_gain_sum = capital_gain_sum;
        this.capital_gain_avg = capital_gain_avg;
        this.capital_loss_sum = capital_loss_sum;
        this.capital_loss_avg = capital_loss_avg;
        this.over_50k_count = over_50k_count;
        this.under_50k_count = under_50k_count;
    }

    public String getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    public int getAggregationValue() {
        return aggregationValue;
    }

    public void setAggregationValue(int aggregationValue) {
        this.aggregationValue = aggregationValue;
    }

    public float getCapital_gain_sum() {
        return capital_gain_sum;
    }

    public void setCapital_gain_sum(float capital_gain_sum) {
        this.capital_gain_sum = capital_gain_sum;
    }

    public float getCapital_gain_avg() {
        return capital_gain_avg;
    }

    public void setCapital_gain_avg(float capital_gain_avg) {
        this.capital_gain_avg = capital_gain_avg;
    }

    public float getCapital_loss_sum() {
        return capital_loss_sum;
    }

    public void setCapital_loss_sum(float capital_loss_sum) {
        this.capital_loss_sum = capital_loss_sum;
    }

    public float getCapital_loss_avg() {
        return capital_loss_avg;
    }

    public void setCapital_loss_avg(float capital_loss_avg) {
        this.capital_loss_avg = capital_loss_avg;
    }

    public int getOver_50k_count() {
        return over_50k_count;
    }

    public void setOver_50k_count(int over_50k_count) {
        this.over_50k_count = over_50k_count;
    }

    public int getUnder_50k_count() {
        return under_50k_count;
    }

    public void setUnder_50k_count(int under_50k_count) {
        this.under_50k_count = under_50k_count;
    }
}


package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Codeshare {
    @SerializedName("airline") @Expose private Integer airline;
    @SerializedName("flight") @Expose private String flight;

    public Integer getAirline() {
        return airline;
    }
    public void setAirline(Integer airline) {
        this.airline = airline;
    }

    public String getFlight() {
        return flight;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }
}

package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AirHop {
    @SerializedName("depPlace") @Expose private Integer depPlace;
    @SerializedName("arrPlace") @Expose private Integer arrPlace;
    @SerializedName("depTime") @Expose private String depTime;
    @SerializedName("arrTime") @Expose private String arrTime;
    @SerializedName("flight") @Expose private String flight;
    @SerializedName("airline") @Expose private Integer airline;
    @SerializedName("duration") @Expose private Integer duration;
    @SerializedName("aircraft") @Expose private Integer aircraft;
    @SerializedName("arrTerminal") @Expose private String arrTerminal;
    @SerializedName("codeshares") @Expose private List<Codeshare> codeshares = new ArrayList<>();
    @SerializedName("depTerminal") @Expose private String depTerminal;
    @SerializedName("layoverDuration") @Expose private Integer layoverDuration;

    public Integer getDepPlace() {
        return depPlace;
    }
    public void setDepPlace(Integer depPlace) {
        this.depPlace = depPlace;
    }

    public Integer getArrPlace() {
        return arrPlace;
    }
    public void setArrPlace(Integer arrPlace) {
        this.arrPlace = arrPlace;
    }

    public String getDepTime() {
        return depTime;
    }
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrTime() {
        return arrTime;
    }
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getFlight() {
        return flight;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Integer getAirline() {
        return airline;
    }
    public void setAirline(Integer airline) {
        this.airline = airline;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getAircraft() {
        return aircraft;
    }
    public void setAircraft(Integer aircraft) {
        this.aircraft = aircraft;
    }

    public String getArrTerminal() {
        return arrTerminal;
    }
    public void setArrTerminal(String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }

    public List<Codeshare> getCodeshares() {
        return codeshares;
    }
    public void setCodeshares(List<Codeshare> codeshares) {
        this.codeshares = codeshares;
    }

    public String getDepTerminal() {
        return depTerminal;
    }
    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    public Integer getLayoverDuration() {
        return layoverDuration;
    }
    public void setLayoverDuration(Integer layoverDuration) {
        this.layoverDuration = layoverDuration;
    }
}
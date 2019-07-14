
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {
    @SerializedName("languageCode") @Expose private String languageCode;
    @SerializedName("currencyCode") @Expose private String currencyCode;
    @SerializedName("elapsedTime") @Expose private Integer elapsedTime;
    @SerializedName("places") @Expose private List<Place> places = new ArrayList<>();
    @SerializedName("airlines") @Expose private List<Airline> airlines = new ArrayList<>();
    @SerializedName("aircrafts") @Expose private List<Aircraft> aircrafts = new ArrayList<>();
    @SerializedName("agencies") @Expose private List<Agency> agencies = new ArrayList<>();
    @SerializedName("vehicles") @Expose private List<Vehicle> vehicles = new ArrayList<>();
    @SerializedName("routes") @Expose private List<Route> routes = new ArrayList<>();

    public String getLanguageCode() {
        return languageCode;
    }
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public List<Place> getPlaces() {
        return places;
    }
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }
    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }
    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public List<Agency> getAgencies() {
        return agencies;
    }
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Route> getRoutes() {
        return routes;
    }
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
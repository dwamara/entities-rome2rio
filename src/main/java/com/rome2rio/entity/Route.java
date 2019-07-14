
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Route {
    @SerializedName("name") @Expose private String name;
    @SerializedName("depPlace") @Expose private Integer depPlace;
    @SerializedName("arrPlace") @Expose private Integer arrPlace;
    @SerializedName("distance") @Expose private Double distance;
    @SerializedName("totalDuration") @Expose private Integer totalDuration;
    @SerializedName("totalTransitDuration") @Expose private Integer totalTransitDuration;
    @SerializedName("totalTransferDuration") @Expose private Integer totalTransferDuration;
    @SerializedName("indicativePrices") @Expose private List<IndicativePrice> indicativePrices = new ArrayList<>();
    @SerializedName("segments") @Expose private List<Segment> segments = new ArrayList<>();
    @SerializedName("alternatives") @Expose private List<Alternative> alternatives = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getTotalDuration() {
        return totalDuration;
    }
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Integer getTotalTransitDuration() {
        return totalTransitDuration;
    }
    public void setTotalTransitDuration(Integer totalTransitDuration) { this.totalTransitDuration = totalTransitDuration; }

    public Integer getTotalTransferDuration() {
        return totalTransferDuration;
    }
    public void setTotalTransferDuration(Integer totalTransferDuration) { this.totalTransferDuration = totalTransferDuration; }

    public List<IndicativePrice> getIndicativePrices() {
        return indicativePrices;
    }
    public void setIndicativePrices(List<IndicativePrice> indicativePrices) { this.indicativePrices = indicativePrices; }

    public List<Segment> getSegments() {
        return segments;
    }
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Alternative> getAlternatives() {
        return alternatives;
    }
    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
    }
}
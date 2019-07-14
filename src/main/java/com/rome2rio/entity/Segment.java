
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Segment {
    @SerializedName("segmentKind") @Expose private String segmentKind;
    @SerializedName("depPlace") @Expose private Integer depPlace;
    @SerializedName("arrPlace") @Expose private Integer arrPlace;
    @SerializedName("vehicle") @Expose private Integer vehicle;
    @SerializedName("distance") @Expose private Double distance;
    @SerializedName("transitDuration") @Expose private Integer transitDuration;
    @SerializedName("transferDuration") @Expose private Integer transferDuration;
    @SerializedName("path") @Expose private String path;
    @SerializedName("indicativePrices") @Expose private List<IndicativePrice> indicativePrices = new ArrayList<>();
    @SerializedName("stops") @Expose private List<Stop> stops = new ArrayList<>();
    @SerializedName("agencies") @Expose private List<Agency> agencies = new ArrayList<>();
    @SerializedName("outbound") @Expose private List<Outbound> outbound = new ArrayList<>();
    @SerializedName("return") @Expose private List<Return> _return = new ArrayList<>();

    public String getSegmentKind() {
        return segmentKind;
    }
    public void setSegmentKind(String segmentKind) {
        this.segmentKind = segmentKind;
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

    public Integer getVehicle() {
        return vehicle;
    }
    public void setVehicle(Integer vehicle) {
        this.vehicle = vehicle;
    }

    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getTransitDuration() {
        return transitDuration;
    }
    public void setTransitDuration(Integer transitDuration) {
        this.transitDuration = transitDuration;
    }

    public Integer getTransferDuration() {
        return transferDuration;
    }
    public void setTransferDuration(Integer transferDuration) {
        this.transferDuration = transferDuration;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public List<IndicativePrice> getIndicativePrices() {
        return indicativePrices;
    }
    public void setIndicativePrices(List<IndicativePrice> indicativePrices) { this.indicativePrices = indicativePrices; }

    public List<Stop> getStops() {
        return stops;
    }
    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public List<Agency> getAgencies() {
        return agencies;
    }
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    public List<Outbound> getOutbound() {
        return outbound;
    }
    public void setOutbound(List<Outbound> outbound) {
        this.outbound = outbound;
    }

    public List<Return> getReturn() {
        return _return;
    }
    public void setReturn(List<Return> _return) {
        this._return = _return;
    }
}
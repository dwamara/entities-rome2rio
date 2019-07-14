
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stop {
    @SerializedName("place") @Expose private Integer place;
    @SerializedName("transitDuration") @Expose private Integer transitDuration;
    @SerializedName("stopDuration") @Expose private Integer stopDuration;

    public Integer getPlace() {
        return place;
    }
    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getTransitDuration() {
        return transitDuration;
    }
    public void setTransitDuration(Integer transitDuration) {
        this.transitDuration = transitDuration;
    }

    public Integer getStopDuration() {
        return stopDuration;
    }
    public void setStopDuration(Integer stopDuration) {
        this.stopDuration = stopDuration;
    }
}
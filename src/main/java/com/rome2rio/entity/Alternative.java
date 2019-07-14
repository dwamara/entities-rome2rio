
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alternative {

    @SerializedName("firstSegment") @Expose private Integer firstSegment;
    @SerializedName("lastSegment") @Expose private Integer lastSegment;
    @SerializedName("route") @Expose private Route route;

    public Integer getFirstSegment() {
        return firstSegment;
    }
    public void setFirstSegment(Integer firstSegment) {
        this.firstSegment = firstSegment;
    }

    public Integer getLastSegment() {
        return lastSegment;
    }
    public void setLastSegment(Integer lastSegment) {
        this.lastSegment = lastSegment;
    }

    public Route getRoute() { return route; }
    public void setRoute(Route route) {
        this.route = route;
    }
}
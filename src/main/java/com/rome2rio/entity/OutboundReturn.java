
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class OutboundReturn {
    @SerializedName("operatingDays") @Expose private Integer operatingDays;
    @SerializedName("indicativePrices") @Expose private List<IndicativePrice> indicativePrices = new ArrayList<>();
    @SerializedName("hops") @Expose private List<AirHop> hops = new ArrayList<>();

    public Integer getOperatingDays() {
        return operatingDays;
    }
    public void setOperatingDays(Integer operatingDays) {
        this.operatingDays = operatingDays;
    }

    public List<IndicativePrice> getIndicativePrices() {
        return indicativePrices;
    }
    public void setIndicativePrices(List<IndicativePrice> indicativePrices) { this.indicativePrices = indicativePrices; }

    public List<AirHop> getHops() {
        return hops;
    }
    public void setHops(List<AirHop> hops) {
        this.hops = hops;
    }
}
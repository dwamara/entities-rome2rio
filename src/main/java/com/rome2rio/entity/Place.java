
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place {
    @SerializedName("lat") @Expose private Double lat;
    @SerializedName("lng") @Expose private Double lng;
    @SerializedName("kind") @Expose private String kind;
    @SerializedName("shortName") @Expose private String shortName;
    @SerializedName("longName") @Expose private String longName;
    @SerializedName("canonicalName") @Expose private String canonicalName;
    @SerializedName("code") @Expose private String code;
    @SerializedName("regionCode") @Expose private String regionCode;
    @SerializedName("countryCode") @Expose private String countryCode;
    @SerializedName("timeZone") @Expose private String timeZone;

    public Double getLat() {
        return lat;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }
    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getCanonicalName() {
        return canonicalName;
    }
    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
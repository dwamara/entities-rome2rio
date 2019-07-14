
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    @SerializedName("name") @Expose private String name;
    @SerializedName("url") @Expose private String url;
    @SerializedName("icon") @Expose private Icon icon;
    @SerializedName("phone") @Expose private String phone;
    @SerializedName("agency") @Expose private Integer agency;
    @SerializedName("frequency") @Expose private Integer frequency;
    @SerializedName("duration") @Expose private Integer duration;
    @SerializedName("operatingDays") @Expose private Integer operatingDays;
    @SerializedName("lineNames") @Expose private List<String> lineNames = new ArrayList<>();
    @SerializedName("lineCodes") @Expose private List<String> lineCodes = new ArrayList<>();
    @SerializedName("links") @Expose private List<Link> links = new ArrayList<>();


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Icon getIcon() {
        return icon;
    }
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAgency() {
        return agency;
    }
    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Integer getFrequency() {
        return frequency;
    }
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getOperatingDays() {
        return operatingDays;
    }
    public void setOperatingDays(Integer operatingDays) {
        this.operatingDays = operatingDays;
    }

    public List<String> getLineNames() {
        return lineNames;
    }
    public void setLineNames(List<String> lineNames) {
        this.lineNames = lineNames;
    }

    public List<String> getLineCodes() {
        return lineCodes;
    }
    public void setLineCodes(List<String> lineCodes) {
        this.lineCodes = lineCodes;
    }

    public List<Link> getLinks() {
        return links;
    }
    public void setLinks(List<Link> links) {
        this.links = links;
    }
}

package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Icon {
    @SerializedName("url") @Expose private String url;
    @SerializedName("x") @Expose private Integer x;
    @SerializedName("y") @Expose private Integer y;
    @SerializedName("w") @Expose private Integer w;
    @SerializedName("h") @Expose private Integer h;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getW() {
        return w;
    }
    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }
    public void setH(Integer h) {
        this.h = h;
    }
}
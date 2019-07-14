
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {
    @SerializedName("text") @Expose private String text;
    @SerializedName("url") @Expose private String url;
    @SerializedName("displayUrl") @Expose private String displayUrl;
    @SerializedName("moustacheUrl") @Expose private String moustacheUrl;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public String getMoustacheUrl() {
        return moustacheUrl;
    }
    public void setMoustacheUrl(String moustacheUrl) {
        this.moustacheUrl = moustacheUrl;
    }
}
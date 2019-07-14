
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airline {
    @SerializedName("code") @Expose private String code;
    @SerializedName("name") @Expose private String name;
    @SerializedName("url") @Expose private String url;
    @SerializedName("icon") @Expose private Icon icon;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

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
}
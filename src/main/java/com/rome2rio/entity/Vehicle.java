
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vehicle {
    @SerializedName("name") @Expose private String name;
    @SerializedName("kind") @Expose private String kind;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
}
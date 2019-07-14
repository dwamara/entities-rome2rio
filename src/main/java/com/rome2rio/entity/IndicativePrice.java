
package com.rome2rio.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndicativePrice {
    @SerializedName("price") @Expose private Integer price;
    @SerializedName("priceLow") @Expose private Integer priceLow;
    @SerializedName("priceHigh") @Expose private Integer priceHigh;
    @SerializedName("currency") @Expose private String currency;
    @SerializedName("nativePrice") @Expose private Integer nativePrice;
    @SerializedName("nativePriceLow") @Expose private Integer nativePriceLow;
    @SerializedName("nativePriceHigh") @Expose private Integer nativePriceHigh;
    @SerializedName("nativeCurrency") @Expose private String nativeCurrency;
    @SerializedName("name") @Expose private String name;

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPriceLow() {
        return priceLow;
    }
    public void setPriceLow(Integer priceLow) {
        this.priceLow = priceLow;
    }

    public Integer getPriceHigh() {
        return priceHigh;
    }
    public void setPriceHigh(Integer priceHigh) {
        this.priceHigh = priceHigh;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getNativePrice() {
        return nativePrice;
    }
    public void setNativePrice(Integer nativePrice) {
        this.nativePrice = nativePrice;
    }

    public Integer getNativePriceLow() {
        return nativePriceLow;
    }
    public void setNativePriceLow(Integer nativePriceLow) {
        this.nativePriceLow = nativePriceLow;
    }

    public Integer getNativePriceHigh() {
        return nativePriceHigh;
    }
    public void setNativePriceHigh(Integer nativePriceHigh) {
        this.nativePriceHigh = nativePriceHigh;
    }

    public String getNativeCurrency() {
        return nativeCurrency;
    }
    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
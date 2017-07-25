package com.traco.androidlibraries.data.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tikson.tom on 7/21/2017.
 */

public class Cordinates {
    @SerializedName("lon")
    String lon;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @SerializedName("lat")
    String lat;
}

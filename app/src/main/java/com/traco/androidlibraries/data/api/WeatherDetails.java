package com.traco.androidlibraries.data.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by tikson.tom on 7/21/2017.
 */

public class WeatherDetails {
    @SerializedName("coord")
    Cordinates coordinates;
    @SerializedName("weather")
    ArrayList<Weather> weather;

    //  @SerializedName("base")
//    String base;
//    @SerializedName("main")
//    MainDetails main;
//    @SerializedName("visibility")
//    String visibility;
//    @SerializedName("wind")
//    Wind wind;
//    @SerializedName("clouds")
//    Clouds clouds;
//    @SerializedName("dt")
//    String dt;
//    @SerializedName("sys")
//    Syst sys;
//    @SerializedName("id")
//    String id;
    @SerializedName("name")
    String name;
//    @SerializedName("cod")
//    String cod;

    public Cordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Cordinates coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

//    public String getBase() {
//        return base;
//    }
//
//    public void setBase(String base) {
//        this.base = base;
//    }
//
//    public MainDetails getMain() {
//        return main;
//    }
//
//    public void setMain(MainDetails main) {
//        this.main = main;
//    }
//
//    public String getVisibility() {
//        return visibility;
//    }
//
//    public void setVisibility(String visibility) {
//        this.visibility = visibility;
//    }
//
//    public Wind getWind() {
//        return wind;
//    }
//
//    public void setWind(Wind wind) {
//        this.wind = wind;
//    }
//
//    public Clouds getClouds() {
//        return clouds;
//    }
//
//    public void setClouds(Clouds clouds) {
//        this.clouds = clouds;
//    }
//
//    public String getDt() {
//        return dt;
//    }
//
//    public void setDt(String dt) {
//        this.dt = dt;
//    }
//
//    public Syst getSys() {
//        return sys;
//    }
//
//    public void setSys(Syst sys) {
//        this.sys = sys;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public String getCod() {
//        return cod;
//    }
//
//    public void setCod(String cod) {
//        this.cod = cod;
//    }
}

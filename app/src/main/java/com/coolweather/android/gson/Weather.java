package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI air_now_city;

    public Now now;

    public Suggestion suggestion;

    public Update update;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

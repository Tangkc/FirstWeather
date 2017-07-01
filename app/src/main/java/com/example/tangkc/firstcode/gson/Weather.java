package com.example.tangkc.firstcode.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Tangkc on 2017/6/29.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

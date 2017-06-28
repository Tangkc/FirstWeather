package com.example.tangkc.firstcode.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tangkc on 2017/6/27.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;

    public class AQICity {
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}

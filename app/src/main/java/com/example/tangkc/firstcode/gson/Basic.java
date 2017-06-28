package com.example.tangkc.firstcode.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tangkc on 2017/6/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("update")
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

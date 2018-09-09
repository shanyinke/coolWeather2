package com.example.administrator.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("City")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
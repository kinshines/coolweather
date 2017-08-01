package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chaoyu on 2017/8/2.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Tempature temperature;
    @SerializedName("cond")
    public More more;
    public class Tempature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

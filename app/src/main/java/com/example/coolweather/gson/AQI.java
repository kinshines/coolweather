package com.example.coolweather.gson;

/**
 * Created by Chaoyu on 2017/8/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

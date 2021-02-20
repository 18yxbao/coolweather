package com.coolweather.android.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

/**
 * Create by yxbao on 2021/2/20
 */
public class County extends DataSupport {

    /**
     * id : 1554
     * name : 汕头
     * weather_id : CN101280501
     */

    private int id;
    @SerializedName("name")
    private String countyName;
    @SerializedName("weather_id")
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

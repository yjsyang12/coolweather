package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id; //id
    private String countyName; //县名
    private String weatherId; //天气id
    private int cityId; //市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countyName;
    }

    public void setCountryName(String countryName) {
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

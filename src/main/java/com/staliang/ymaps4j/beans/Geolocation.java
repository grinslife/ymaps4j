package com.staliang.ymaps4j.beans;

import com.staliang.ymaps4j.beans.Coordinate;

/**
 * Created by Alexandr_Badin on 13.08.2015
 */
public class Geolocation {
    private final String city;
    private final String region;
    private final String country;
    private final Coordinate coordinate;

    public Geolocation(String city, String region, String country, Coordinate coordinate) {
        this.city = city;
        this.region = region;
        this.country = country;
        this.coordinate = coordinate;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
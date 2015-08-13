package com.staliang.ymaps4j;

import com.staliang.ymaps4j.beans.YMapsVersion;
import com.staliang.ymaps4j.exception.YMapsException;
import com.staliang.ymaps4j.impl.v2.YMapsV2;

import java.util.Locale;

/**
 * Created by Alexandr_Badin on 11.08.2015.
 */
public abstract class YMapsFactory {

    public static YMaps getMaps(YMapsVersion mapsVersion, Locale locale) throws YMapsException {
        switch (mapsVersion){
            case V2:
                return new YMapsV2(locale);
            default:
                throw new YMapsException("Unknown version of Yandex Maps");
        }
    }
}
package com.traco.androidlibraries.data;

import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class RealDataSource implements DataSource {
    private static RealDataSource realDataSource;

    public static RealDataSource getInstance() {
        if (realDataSource == null)
            realDataSource = new RealDataSource();
        return realDataSource;
    }

    @Override
    public void getWeatherResult(CallbackResult<WeatherDetails> weatherDetails) {

    }

    @Override
    public WeatherDetails getWeatherDetailsLocally() {
        return null;
    }
}

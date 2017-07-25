package com.traco.androidlibraries.data;

import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class LocalDataSource implements DataSource {
    private static LocalDataSource localDataSource;

    public static LocalDataSource getInstance() {
        if (localDataSource == null)
            localDataSource = new LocalDataSource();
        return localDataSource;
    }

    @Override
    public void getWeatherResult(CallbackResult<WeatherDetails> weatherDetails) {

    }

    @Override
    public WeatherDetails getWeatherDetailsLocally() {
        return null;
    }
}

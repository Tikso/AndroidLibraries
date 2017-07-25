package com.traco.androidlibraries.data;

import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class FakeDataSource implements DataSource {
    private static FakeDataSource fakeDataSource;

    public static FakeDataSource getInstance() {
        if (fakeDataSource == null)
            fakeDataSource = new FakeDataSource();
        return fakeDataSource;
    }

    @Override
    public void getWeatherResult(CallbackResult<WeatherDetails> weatherDetails) {

    }
}

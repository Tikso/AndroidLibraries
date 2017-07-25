package com.traco.androidlibraries.data;

import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public interface DataSource {
    void getWeatherResult(CallbackResult<WeatherDetails> weatherDetails);

    WeatherDetails getWeatherDetailsLocally();


    interface CallbackResult<T> {
        void onSuccess(T data);

        void onFailure(Throwable t);
    }
}

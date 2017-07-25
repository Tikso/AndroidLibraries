package com.traco.androidlibraries.weather;

import com.traco.androidlibraries.data.DataSource;
import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class WeatherPresenter implements WeatherContractor.Presenter {
    private DataSource dataSource;
    private WeatherContractor.WeatherView view;

    public WeatherPresenter(WeatherContractor.WeatherView view, DataSource dataSource) {
        this.view = view;
        this.dataSource = dataSource;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscriobe() {

    }

    @Override
    public void callApi() {
        dataSource.getWeatherResult(new DataSource.CallbackResult<WeatherDetails>() {
            @Override
            public void onSuccess(WeatherDetails data) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}

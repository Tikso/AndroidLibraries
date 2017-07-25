package com.traco.androidlibraries.data;

import com.traco.androidlibraries.data.api.WeatherDetails;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class Repository implements DataSource {
    private final DataSource mRemoteDataSource;
    private final DataSource mLocalDataSource;
    private static Repository INSTANCE;

    private Repository(DataSource mRemoteDataSource, DataSource mLocalDataSource) {
        this.mLocalDataSource = mLocalDataSource;
        this.mRemoteDataSource = mRemoteDataSource;
    }

    public static Repository getInstance(DataSource remoteDataSource, DataSource locaDataSource) {

        if (INSTANCE == null) INSTANCE = new Repository(remoteDataSource, locaDataSource);
        return INSTANCE;
    }

    @Override
    public void getWeatherResult(final CallbackResult<WeatherDetails> weatherDetails) {
        System.out.println("Call on Repository");
        WeatherDetails weatherDetailsLocally = mLocalDataSource.getWeatherDetailsLocally();
        if (weatherDetailsLocally != null) {
            weatherDetails.onSuccess(weatherDetailsLocally);
        } else {
            mRemoteDataSource.getWeatherResult(new CallbackResult<WeatherDetails>() {
                @Override
                public void onSuccess(WeatherDetails data) {
                    weatherDetails.onSuccess(data);
                }

                @Override
                public void onFailure(Throwable t) {
                    weatherDetails.onFailure(t);
                }
            });
        }
    }

    @Override
    public WeatherDetails getWeatherDetailsLocally() {
        return null;
    }
}

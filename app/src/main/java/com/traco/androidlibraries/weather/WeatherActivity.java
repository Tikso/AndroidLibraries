package com.traco.androidlibraries.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.traco.androidlibraries.R;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class WeatherActivity extends AppCompatActivity {
    private WeatherFragment weatherFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (weatherFragment == null)
            weatherFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.weather_Container,
                weatherFragment, "fragment_weather").commit();
    }
}

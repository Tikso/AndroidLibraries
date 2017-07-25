package com.traco.androidlibraries.weather;

import com.traco.androidlibraries.BasePresenter;
import com.traco.androidlibraries.BaseView;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public interface WeatherContractor {

     interface WeatherView extends BaseView<Presenter> {

    }

     interface Presenter extends BasePresenter {
        void callApi();
    }
}

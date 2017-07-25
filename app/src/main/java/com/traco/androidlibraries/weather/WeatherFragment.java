package com.traco.androidlibraries.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.traco.androidlibraries.R;
import com.traco.androidlibraries.data.DataInjection;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class WeatherFragment extends Fragment implements View.OnClickListener, WeatherContractor.WeatherView {
    private Button btCallApi;
    private WeatherContractor.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View weatherView = inflater.inflate(R.layout.fragment_weather, container, false);
        btCallApi = (Button) weatherView.findViewById(R.id.btCallApi);
        btCallApi.setOnClickListener(this);
        presenter = new WeatherPresenter(this, DataInjection.provideRepositiry());
        return weatherView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btCallApi:
                presenter.callApi();
        }
    }

    @Override
    public void setPresenter(WeatherContractor.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setToast(String message) {

    }
}

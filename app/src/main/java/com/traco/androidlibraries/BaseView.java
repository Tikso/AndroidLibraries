package com.traco.androidlibraries;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);

    void setToast(String message);
}

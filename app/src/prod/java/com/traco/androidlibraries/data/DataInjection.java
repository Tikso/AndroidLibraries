package com.traco.androidlibraries.data;

/**
 * Created by tikson.tom on 7/25/2017.
 */

public class DataInjection {
    public static DataSource provideRepositiry() {
        return Repository.getInstance(RealDataSource.getInstance(), LocalDataSource.getInstance());
    }
}

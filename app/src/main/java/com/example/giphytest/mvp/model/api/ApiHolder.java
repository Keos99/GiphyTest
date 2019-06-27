package com.example.giphytest.mvp.model.api;

import com.example.giphytest.properties.Properties;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHolder {
    private static ApiHolder instance = new ApiHolder();
    DataSource dataSource;

    public static ApiHolder getInstance() {
        if (instance == null){
            instance = new ApiHolder();
        }
        return instance;
    }

    private ApiHolder() {
        dataSource = new Retrofit.Builder()
                .baseUrl(Properties.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        .create()))
                .build()
                .create(DataSource.class);
    }

    public static DataSource getApi() {
        return getInstance().dataSource;
    }
}

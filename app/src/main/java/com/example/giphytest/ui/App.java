package com.example.giphytest.ui;

import android.app.Application;

import com.example.giphytest.di.AppComponent;
import com.example.giphytest.di.DaggerAppComponent;
import com.example.giphytest.di.modules.AppModule;

public class App extends Application {
    public static App instance;
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

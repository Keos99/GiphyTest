package com.example.giphytest.di;

import com.example.giphytest.di.modules.AppModule;
import com.example.giphytest.di.modules.ImageLoaderModule;
import com.example.giphytest.mvp.presenter.MainActivityPresenter;
import com.example.giphytest.ui.activity.MainActivity;
import com.example.giphytest.ui.adapter.MainActivityRVAdapter;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules ={
        AppModule.class,
        ImageLoaderModule.class
})

public interface AppComponent {
    void inject (MainActivity mainActivity);
    void inject (MainActivityRVAdapter mainActivityRVAdapter);
    void inject (MainActivityPresenter mainActivityPresenter);
}

package com.example.giphytest.di.modules;

import android.widget.ImageView;

import com.example.giphytest.mvp.model.image.ImageLoader;
import com.example.giphytest.mvp.model.image.ImageLoaderGlide;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageLoaderModule {

    @Singleton
    @Provides
    public ImageLoader<ImageView> imageLoader(){
        return new ImageLoaderGlide();
    }
}

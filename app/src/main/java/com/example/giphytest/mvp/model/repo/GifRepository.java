package com.example.giphytest.mvp.model.repo;

import com.example.giphytest.mvp.model.api.ApiHolder;
import com.example.giphytest.mvp.model.entity.SearchEndpoint;
import com.example.giphytest.properties.Properties;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class GifRepository {

    public Single<SearchEndpoint> getGifs (String searchquery){
        return ApiHolder.getApi().searchGIF(searchquery, Properties.API_KEY)
                .subscribeOn(Schedulers.io());
    }
}

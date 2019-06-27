package com.example.giphytest.mvp.model.api;

import com.example.giphytest.mvp.model.entity.SearchEndpoint;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataSource {
    //http://api.giphy.com/v1/gifs/search? q= &api_key=
    @GET("gifs/search")
    Single<SearchEndpoint> searchGIF(@Query("q") String searchquery, @Query("api_key") String apikey);
}

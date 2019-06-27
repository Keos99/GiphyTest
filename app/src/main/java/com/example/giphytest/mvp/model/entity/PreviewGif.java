package com.example.giphytest.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

public class PreviewGif {

    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

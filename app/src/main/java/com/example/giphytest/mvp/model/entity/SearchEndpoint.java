package com.example.giphytest.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchEndpoint {
    @SerializedName("data")
    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

}

package com.example.giphytest.mvp.view;

import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.example.giphytest.mvp.model.entity.GifListItem;

import java.util.List;

@StateStrategyType(value = AddToEndSingleStrategy.class)
public interface MainActivityView extends MvpView {
    void setRecyclerViewAdapter(RecyclerView.Adapter adapter);
    void loadRecyclerView(List<GifListItem> gifListItems);
    void makeToast();
}

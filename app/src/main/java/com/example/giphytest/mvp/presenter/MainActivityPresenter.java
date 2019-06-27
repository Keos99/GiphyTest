package com.example.giphytest.mvp.presenter;

import android.annotation.SuppressLint;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.giphytest.mvp.model.entity.Data;
import com.example.giphytest.mvp.model.entity.GifListItem;
import com.example.giphytest.mvp.model.repo.GifRepository;
import com.example.giphytest.mvp.view.MainActivityView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {

    private Scheduler mainThreadScheduler;
    private GifRepository gifRepository;
    private List<Data> dataList;
    private List<GifListItem> gifListItems;


    public MainActivityPresenter(Scheduler scheduler) {
        this.mainThreadScheduler = scheduler;
    }

    @SuppressLint("CheckResult")
    public void sendRequestSearchForGifs(String query) {
        gifRepository = new GifRepository();
        gifRepository.getGifs(query)
                .observeOn(mainThreadScheduler)
                .subscribe(searchEndpoint -> {
                    dataList = searchEndpoint.getData();
                    getViewState().loadRecyclerView(prepareGifListItems());
                    getViewState().makeToast();
                }, throwable ->{
                    //TODO
                });
    }

    public List<GifListItem> prepareGifListItems(){
        gifListItems = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            gifListItems.add(new GifListItem(dataList.get(i).getImages().getPreviewGif().getUrl()));
        }
        return gifListItems;
    }
}

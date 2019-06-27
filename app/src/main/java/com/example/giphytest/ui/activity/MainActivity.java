package com.example.giphytest.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.giphytest.R;
import com.example.giphytest.mvp.model.entity.GifListItem;
import com.example.giphytest.mvp.presenter.MainActivityPresenter;
import com.example.giphytest.mvp.view.MainActivityView;
import com.example.giphytest.ui.App;
import com.example.giphytest.ui.adapter.MainActivityRVAdapter;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    private SearchView searchView;
    private RecyclerView recyclerView;
    private MainActivityRVAdapter adapter;

    @InjectPresenter
    MainActivityPresenter presenter;
    @ProvidePresenter
    public MainActivityPresenter mainActivityPresenter(){
        MainActivityPresenter presenter = new MainActivityPresenter
                (AndroidSchedulers.mainThread());
        App.getInstance().getAppComponent().inject(presenter);
        return presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getInstance().getAppComponent().inject(this);
        setContentView(R.layout.activity_main);

        initUI();
    }

    public void initUI(){
        recyclerView = findViewById(R.id.rv_gif);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        searchView = findViewById(R.id.mainactivity_searchview);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                presenter.sendRequestSearchForGifs(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    @Override
    public void setRecyclerViewAdapter(RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void makeToast() {
        Toast.makeText(this,"Заработало!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadRecyclerView(List<GifListItem> gifListItems) {
        adapter = new MainActivityRVAdapter(gifListItems);
        recyclerView.setAdapter(adapter);
        recyclerView.getAdapter().notifyDataSetChanged();
    }
}

package com.example.giphytest.ui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.giphytest.R;
import com.example.giphytest.mvp.model.entity.GifListItem;
import com.example.giphytest.mvp.model.image.ImageLoaderGlide;

import java.util.List;

public class MainActivityRVAdapter extends RecyclerView.Adapter<MainActivityRVAdapter.ViewHolder> {

    private List<GifListItem> gifListItems;
    private ImageLoaderGlide glide;

    public MainActivityRVAdapter(List<GifListItem> gifListItems) {
        this.gifListItems = gifListItems;
        glide = new ImageLoaderGlide();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gif,
                viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
       viewHolder.bind(position,viewHolder);
    }

    @Override
    public int getItemCount() {
        return gifListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView gifView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gifView = itemView.findViewById(R.id.rv_imageview);
        }

        public void bind (final int position,ViewHolder vievHolder ){
            final GifListItem item = gifListItems.get(position);
            glide.loadInto(item.getUri(),gifView);
        }
    }
}

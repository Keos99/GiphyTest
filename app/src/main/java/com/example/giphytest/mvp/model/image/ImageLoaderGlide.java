package com.example.giphytest.mvp.model.image;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoaderGlide implements ImageLoader<ImageView> {

    @Override
    public void loadInto(@Nullable String url, ImageView container) {
        Glide.with(container.getContext())
                .asGif()
                .load(url)
                .into(container);
    }
}

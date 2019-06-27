package com.example.giphytest.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("fixed_height")
    private FixedHeight fixedHeight;

    @SerializedName("fixed_height_downsampled")
    private FixedHeightDownsampled fixedHeightDownsampled;

    @SerializedName("fixed_width")
    private FixedWidth fixedWidth;

    @SerializedName("fixed_width_downsampled")
    private FixedWidthDownsampled fixedWidthDownsampled;

    @SerializedName("fixed_height_small")
    private FixedHeightSmall fixedHeightSmall;

    @SerializedName("fixed_width_small")
    private FixedWidthSmall fixedWidthSmall;

    @SerializedName("original")
    private Original original;

    @SerializedName("downsized_small")
    private DownsizedSmall downsizedSmall;

    @SerializedName("preview_gif")
    private PreviewGif previewGif;

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }
}

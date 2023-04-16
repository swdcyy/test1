package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener;
import java.lang.Exception;

public interface abstract SubsamplingScaleImageView$OnImageEventListener	// class@000fb5
{

    void onImageLoadError(Exception p0);
    void onImageLoaded();
    void onPreviewLoadError(Exception p0);
    void onPreviewReleased();
    void onReady();
    void onTileLoadError(Exception p0);
}

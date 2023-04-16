package com.yxcorp.image.fresco.wrapper.ImageCallback;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;

public interface abstract ImageCallback	// class@001a0a
{
    public static final StackTraceElement[] stackTrace;

    void onCompleted(Drawable p0);
    void onCompletedBitmap(Bitmap p0);
    void onProgress(float p0);
}

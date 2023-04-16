package com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.content.Context;
import android.net.Uri;
import android.graphics.Point;

public interface abstract ImageRegionDecoder	// class@000fbf
{

    Bitmap decodeRegion(Rect p0,int p1);
    Point init(Context p0,Uri p1);
    boolean isReady();
    void recycle();
}

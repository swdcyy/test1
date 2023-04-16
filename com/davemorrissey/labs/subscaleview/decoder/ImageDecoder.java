package com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import android.content.Context;
import android.net.Uri;
import android.graphics.Bitmap;

public interface abstract ImageDecoder	// class@000fbe
{

    Bitmap decode(Context p0,Uri p1);
}

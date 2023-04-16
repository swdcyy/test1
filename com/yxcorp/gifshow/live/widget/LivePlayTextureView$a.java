package com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import android.graphics.Bitmap;
import android.view.Surface;
import android.graphics.Matrix;
import android.graphics.Paint;

public interface abstract LivePlayTextureView$a	// class@001a8b
{

    Bitmap a(Bitmap p0);
    Surface b(boolean p0);
    void c(boolean p0);
    void d();
    void e(Matrix p0);
    void f();
    Bitmap getBitmap();
    void onFirstFrameRender();
    void onVideoSizeChanged(int p0,int p1);
    void prepareForStartAnim();
    void prepareForStopAnim();
    void setLayerType(int p0,Paint p1);
}

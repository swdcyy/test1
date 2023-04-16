package com.tachikoma.component.imageview.model.TKImageLoadParam$b;
import com.tachikoma.component.imageview.model.TKImageLoadParam$c;
import java.lang.String;
import java.lang.Throwable;

public interface abstract TKImageLoadParam$b	// class@000d07
{

    void onImageSet(boolean p0,TKImageLoadParam$c p1,long p2);
    void onLoadFail(String p0,Throwable p1,TKImageLoadParam$c p2,long p3);
    void onLoadProgress(float p0);
    void onLoadStart();
    void onLoadSuccess(TKImageLoadParam$c p0,long p1);
    void onPrefetch(boolean p0);
}

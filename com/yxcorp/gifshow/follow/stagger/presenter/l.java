package com.yxcorp.gifshow.follow.stagger.presenter.l;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

public final class l implements o	// class@001217
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.copy(p0.getConfig(), true);
       return Bitmap.createScaledBitmap(p0, ((int)((float)p0.getWidth() * 0.13f) + true), ((int)((float)p0.getHeight() * 0.13f) + true), false);
    }
}

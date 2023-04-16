package com.yxcorp.gifshow.webview.helper.d;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Bitmap;
import java.lang.Object;
import zq8.a;
import ayc.c;
import io.reactivex.g;
import brd.t;

public final class d implements o	// class@00175b
{
    public final GifshowActivity b;
    public final Bitmap c;

    public void d(GifshowActivity p0,Bitmap p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return t.create(new c(this.b, this.c));
    }
}

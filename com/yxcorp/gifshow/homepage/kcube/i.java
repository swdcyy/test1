package com.yxcorp.gifshow.homepage.kcube.i;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import lnc.a1;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class i implements o	// class@001735
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       int i = a1.e(24.00f);
       if (i && p0.getHeight()) {
          i = Math.min(i, p0.getHeight());
       }
       return BitmapUtil.U(p0, i, i, p0.getConfig(), false);
    }
}

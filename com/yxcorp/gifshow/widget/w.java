package com.yxcorp.gifshow.widget.w;
import erd.c;
import java.lang.Object;
import android.graphics.drawable.Drawable;

public final class w implements c	// class@0019f6
{
    public static final w a;

    static {
       w.a = new w();
    }
    public void w(){
       super();
    }
    public final Object a(Object p0,Object p1){
       Drawable[] uDrawableArr;
       if (p0.length > 0 && p1.length > 0) {
          uDrawableArr = new Drawable[]{p0[0],p1[0]};
       }else {
          uDrawableArr = new Drawable[0];
       }
       return uDrawableArr;
    }
}

package com.feature.post.bridge.f;
import erd.o;
import java.lang.Object;
import java.lang.String;
import java.util.regex.Pattern;
import lnc.v5;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import og.l;
import q87.c;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.StringBuilder;

public final class f implements o	// class@001478
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       int i = 0;
       if (p0.c().matcher(p0).matches()) {
          objArray = new Object[i];
          l.D().w("JsPublishFun", "coverPath is video type", objArray);
          p0 = BitmapUtil.m(p0, 3);
       }else {
          objArray = new Object[i];
          l.D().w("JsPublishFun", "coverPath is image type", objArray);
          p0 = BitmapUtil.s(p0);
       }
       return "data:image/jpg;base64,"+BitmapUtil.d(p0);
    }
}

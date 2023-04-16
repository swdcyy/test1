package com.feature.post.bridge.e;
import erd.o;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.StringBuilder;

public final class e implements o	// class@001476
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       return "data:image/jpg;base64,"+BitmapUtil.d(BitmapUtil.m(p0, 3));
    }
}

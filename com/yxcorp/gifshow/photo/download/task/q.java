package com.yxcorp.gifshow.photo.download.task.q;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.photo.download.task.s;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public final class q implements o	// class@000f15
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final Object apply(Object p0){
       return Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
    }
}

package com.yxcorp.gifshow.photo.download.task.p;
import erd.o;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.photo.download.task.s;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class p implements o	// class@000f13
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object apply(Object p0){
       return BitmapUtil.b(p0, 8);
    }
}

package com.kuaishou.logic.fetchframe.a;
import erd.o;
import java.lang.Object;
import qr3.i;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import java.lang.String;
import android.graphics.Bitmap;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import brd.t;

public final class a implements o	// class@0014c0
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       Bitmap uBitmap = FetchFrameManager.c(p0.a(), p0.a, p0.b);
       int i = 0;
       if (uBitmap == null) {
          objArray = new Object[i];
          a.D().w("FetchFrameManager", "loadFromCache: cant find cache "+p0.a(), objArray);
          p0 = t.empty();
       }else {
          objArray = new Object[i];
          a.D().w("FetchFrameManager", "loadFromCache: hit cache "+p0.a()+" w="+uBitmap.getWidth()+" h="+uBitmap.getHeight(), objArray);
          p0 = t.just(uBitmap);
       }
       return p0;
    }
}

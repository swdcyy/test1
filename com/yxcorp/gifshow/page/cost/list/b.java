package com.yxcorp.gifshow.page.cost.list.b;
import brd.x;
import java.lang.Object;
import brd.t;
import brd.w;
import android.os.Looper;
import t45.d;
import brd.z;

public final class b implements x	// class@000e28
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final w apply(t p0){
       if (Looper.myLooper() == Looper.getMainLooper()) {
       }else {
          p0 = p0.observeOn(d.a);
       }
       return p0;
    }
}

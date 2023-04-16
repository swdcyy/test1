package com.yxcorp.gifshow.commercial.initmodule.AdColdStartInitModule;
import com.kwai.framework.init.TTIInitModule;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import tkd.b;
import tkd.d;
import nl9.g;

public class AdColdStartInitModule extends TTIInitModule	// class@001139
{
    public static AtomicBoolean q;
    public static long r;
    public static SparseIntArray s;

    static {
       AdColdStartInitModule.s = new SparseIntArray();
    }
    public void AdColdStartInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, AdColdStartInitModule.class, "4")) {
          return;
       }
       AdColdStartInitModule.r = SystemClock.elapsedRealtime();
       d.a(0x22aa1781).onBackground();
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, AdColdStartInitModule.class, "5")) {
          return;
       }
       if ((SystemClock.elapsedRealtime() - AdColdStartInitModule.r) - 0xa4cb80 > 0) {
          AdColdStartInitModule.s.clear();
       }
       d.a(0x22aa1781).onForeground();
       return;
    }
}

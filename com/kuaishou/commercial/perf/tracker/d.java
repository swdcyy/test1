package com.kuaishou.commercial.perf.tracker.d;
import erd.g;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import java.lang.Object;
import ujc.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iy.e;
import android.os.Handler;
import android.os.Looper;
import hy.d;
import java.lang.Runnable;

public final class d implements g	// class@001517
{
    public final CommercialSplashTracker b;

    public void d(CommercialSplashTracker p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, CommercialSplashTracker.class, "8")) {
       }else {
          p0 = p0.a;
          if (p0 == 4 || p0 == 5) {
             tb.w();
             new Handler(Looper.getMainLooper()).post(new d(tb));
          }
       }
       return;
    }
}

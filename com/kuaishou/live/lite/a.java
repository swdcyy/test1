package com.kuaishou.live.lite.a;
import java.lang.Runnable;
import com.kuaishou.live.lite.LiveLiteFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import v63.f;
import msd.a;
import ec3.r;

public final class a implements Runnable	// class@001d6a
{
    public final LiveLiteFragment b;

    public void a(LiveLiteFragment p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveLiteFragment.class, "30")) {
       }else {
          b.Z(LiveLiteLogTag.LIFECYCLE, "removeRootViewController "+tb.z);
          if (tb.z != null) {
             r.a("RmLiteRootVC", new f(tb));
             tb.z = null;
             tb.H = false;
          }
       }
       return;
    }
}

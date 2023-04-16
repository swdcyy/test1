package nj0.i;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import fk0.a;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.model.LoadingStateTrack;
import lj0.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import android.os.SystemClock;
import java.lang.System;
import hg.a;
import java.lang.Throwable;

public final class i implements g	// class@003336
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       p0 = tb.e.o();
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, LoadingStateTrack.class, "10")) {
       }else {
          p0 = p0.k;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, KrnBundleLoadInfo.class, "29")) {
             p0.l = SystemClock.elapsedRealtime();
             p0.m = System.currentTimeMillis();
             if (p0.c != null) {
                a.d(0, "asset_init", a.e(), 6);
             }
          }
       }
       tb.e.z(System.currentTimeMillis(), null);
       return;
    }
}

package nj0.m;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.krn.delegate.KrnDelegate;
import sj0.b;
import lj0.c;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import zj0.x;
import zj0.u;
import com.kuaishou.krn.log.model.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.System;
import hg.a;
import java.lang.Throwable;

public final class m implements g	// class@00333a
{
    public final k b;
    public final Runnable c;

    public void m(k p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m tc = this.c;
       tb.e.i().o(KrnReactInstanceState.DIRTY);
       tb.e.k().r();
       p0 = tb.e.h();
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, a.class, "2")) {
       }else {
          p0.c = SystemClock.elapsedRealtime();
       }
       p0 = tb.e.o();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LoadingStateTrack.class, "31")) {
          p0 = p0.k;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, KrnBundleLoadInfo.class, "49")) {
             p0.S = SystemClock.elapsedRealtime();
             p0.T = System.currentTimeMillis();
             if (p0.c != null) {
                a.d(0, "load_business_js", a.e(), 7);
             }
          }
       }
       tb.e.q(System.currentTimeMillis(), null);
       if (tc != null) {
          tc.run();
       }
       return;
    }
}

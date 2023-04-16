package nj0.l;
import erd.g;
import com.kuaishou.krn.delegate.k;
import sj0.b;
import java.lang.Object;
import com.kuaishou.krn.load.JsRuntimeState;
import java.util.Objects;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.String;
import ek0.d;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Enum;
import lj0.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import com.kuaishou.krn.log.model.a;
import zj0.x;
import zj0.u;
import java.lang.Throwable;
import android.os.SystemClock;
import hg.a;
import java.lang.System;

public final class l implements g	// class@003339
{
    public final k b;
    public final b c;
    public final boolean d;

    public void l(k p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       Objects.requireNonNull(tb);
       LoadingStateTrack loadingState = LoadingStateTrack.class;
       d.e("[perfOpt]doOnSuccess: ");
       b j = tc.j;
       KrnDelegate e = tb.e;
       int i = p0.ordinal();
       Objects.requireNonNull(e);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), e, uoc, "10")) {
          e.k = i;
          c o = e.o;
          Objects.requireNonNull(o);
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), o, loadingState, "5")) {
             o.k.c0 = i;
          }
       }
       tb.e.h().g(j);
       Throwable throwable = null;
       tb.e.k().g(tc.d(), throwable);
       i = tb.e.o();
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(throwable, i, loadingState, "27")) {
          i = i.k;
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoid(throwable, i, KrnBundleLoadInfo.class, "45")) {
             i.E = SystemClock.elapsedRealtime();
             if (i.c != null) {
                a.d(0, "engine_init", a.e(), 5);
             }
             i.F = System.currentTimeMillis();
          }
       }
       if (td != null) {
          tb.i(true);
       }
       return;
    }
}

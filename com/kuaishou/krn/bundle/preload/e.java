package com.kuaishou.krn.bundle.preload.e;
import erd.o;
import java.lang.String;
import gj0.d;
import java.lang.Object;
import sj0.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.m;
import brd.a0;
import brd.z;
import lrd.b;
import com.kuaishou.krn.bundle.preload.g;
import erd.r;
import brd.r;
import com.kuaishou.krn.bundle.preload.b;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import brd.q;
import com.kuaishou.krn.bundle.preload.h;
import gj0.q;
import erd.g;
import com.kuaishou.krn.bundle.preload.i;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.operators.maybe.MaybeDelay;
import java.lang.Math;
import ird.a;
import io.reactivex.android.schedulers.a;
import gj0.p;
import gj0.f;
import gj0.k;
import erd.a;

public final class e implements o	// class@000845
{
    public final String b;
    public final d c;
    public final long d;

    public void e(String p0,d p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       e uoe = this;
       e b = uoe.b;
       e c = uoe.c;
       Object obj = p0;
       Long longx = Long.valueOf(uoe.d);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = PatchProxy.applyFourRefs(b, obj, c, longx, null, KrnReactRootPreloadManager.class, "12");
       if (om != patchProxyRe) {
       }else {
          om = a0.B(c).G(b.c()).t(g.b);
          b uob = PatchProxy.applyOneRefs(obj, null, KrnReactRootPreloadManager.class, "13");
          if (uob != patchProxyRe) {
          }else {
             uob = new b(obj);
          }
          Objects.requireNonNull(om);
          a.c(uob, "transformer is null");
          m om1 = m.E(uob.d(om)).m(h.b).k(new q(b, obj)).m(i.b);
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          Objects.requireNonNull(om1);
          z oz = b.a();
          a.c(mILLISECONDS, "unit is null");
          a.c(oz, "scheduler is null");
          MaybeDelay maybeDelay = new MaybeDelay(om1, Math.max(0, 500), mILLISECONDS, oz);
          om = a.g(v5).u(a.c()).k(new p(obj)).t(new f(obj)).h(new k(obj, c, longx, b));
       }
       return om;
    }
}

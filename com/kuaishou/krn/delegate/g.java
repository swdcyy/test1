package com.kuaishou.krn.delegate.g;
import erd.o;
import com.kuaishou.krn.delegate.k;
import java.lang.Runnable;
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
import bk0.k;
import java.lang.Long;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import java.lang.Boolean;
import brd.a0;
import java.lang.StringBuilder;
import ek0.d;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import nj0.o;
import ak0.a;
import nj0.m;
import erd.g;
import com.kuaishou.krn.delegate.j;
import nj0.f;

public final class g implements o	// class@000861
{
    public final k b;
    public final boolean c;
    public final Runnable d;

    public void g(k p0,boolean p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       LoadingStateTrack loadingState = tb.e.o();
       Objects.requireNonNull(loadingState);
       if (PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "30")) {
       }else {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "48")) {
             loadingState.Q = SystemClock.elapsedRealtime();
             loadingState.R = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.b(0, "load_business_js", a.e(), 7);
             }
          }
       }
       KrnDelegate e = tb.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(null, e, c.class, "24")) {
          c j = e.j;
          if (j != null && !PatchProxy.applyVoid(null, j, k.class, "9")) {
             j.c.setBusinessJsLoadStartTime(Long.valueOf(System.currentTimeMillis()));
          }
       }
       if (tc != null) {
          p0 = a0.B(Boolean.TRUE);
       }else {
          d.e("load script start: "+tb.e);
          p0 = a.b(tb.e.r().n(), p0, new o(tb));
       }
       return p0.r(new m(tb, td)).q(new j(tb)).p(new f(tb));
    }
}

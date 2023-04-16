package com.kuaishou.live.core.basic.activity.g0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import xs5.a;
import wj3.c;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import t02.a0;
import java.lang.Object;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m02.a1;
import m02.b1;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import android.os.SystemClock;
import wj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import im8.a;
import en8.a;
import aa1.d;
import tkd.b;
import tkd.d;
import g02.a;
import wj3.a;
import xp5.a;
import android.view.View;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import c12.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m02.b;
import c12.m;
import m02.e;
import m02.x0;
import wj3.a$a;
import java.lang.System;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.Long;
import java.util.Map;

public final class g0 implements Runnable	// class@001839
{
    public final LivePlayLoader b;
    public final a c;
    public final c d;
    public final boolean e;
    public final LivePlayLoader$e f;
    public final a0 g;
    public final Object[] h;

    public void g0(LivePlayLoader p0,a p1,c p2,boolean p3,LivePlayLoader$e p4,a0 p5,Object[] p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       g0 og0 = this;
       g0 b = og0.b;
       g0 c = og0.c;
       g0 d = og0.d;
       g0 e = og0.e;
       g0 f = og0.f;
       g0 g = og0.g;
       g0 h = og0.h;
       b.d0(b.a, "loadDidShowComponent", "liveStreamId", b.j, "isContainerDestroyView", Boolean.valueOf(b.q));
       if (b.q != null) {
       }else {
          LivePlayLoader d1 = b.d;
          LivePlayLoader b1 = b.b;
          a1 uoa1 = PatchProxy.applyOneRefs(f, b, LivePlayLoader.class, "21");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             uoa1 = new a1(b, f);
          }
          Object obj = uoa1;
          b1 uob1 = new b1(b);
          Objects.requireNonNull(d1);
          c uoc = c.class;
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{b1,c,d,Boolean.valueOf(e),obj,uob1,g,h};
             if (!PatchProxy.applyVoid(objArray, d1, uoc, "16")) {
             label_0081 :
                String str = "liveStreamId";
                if (d1.s != null) {
                   b.c0(d1.t, "component is destroyed, loadComponent return!", str, d1.d.getLiveStreamId());
                }else {
                   long l = SystemClock.elapsedRealtime();
                   if (d1.n != null) {
                      a[] uoaArray = new a[i];
                      uoaArray[i2] = g;
                      uoaArray[1] = g.D;
                      d1.m = new d(b1, LivePlayLoader$Stage.DID_SHOW.getName(), uoaArray);
                   }else {
                      a[] uoaArray1 = new a[i];
                      uoaArray1[i2] = g;
                      uoaArray1[1] = g.D;
                      d1.m = new d(uoaArray1);
                   }
                   d.a(-1995989111).cO(d1.m, c);
                   d1.m.L2(d);
                   c.e.b();
                   b.h(c.e.f(), d1.a.u1());
                   d1.m.f(d1.a.u1());
                   if (d1.p != null && d1.n == null) {
                      d1.q = new o(d1.m, new b(obj), d1.d.getLiveStreamId());
                   }
                   c m = d1.m;
                   e uoe = (d1.n != null)? new e(d1, obj): null;
                   String str1 = str;
                   if (!PatchProxy.applyVoidThreeRefs(m, uoe, h, null, x0.class, "1")) {
                      m.K7(uoe, h);
                   }
                   d1.j = System.currentTimeMillis();
                   if (d1.p == null && d1.n == null) {
                      obj.a(e);
                   }
                   d1.k = SystemClock.elapsedRealtime() - l;
                   b.c0(d1.t, "create and bind biz presenter succeeded", str1, d1.d.getLiveStreamId());
                   if (d1.r != null) {
                      b.Z(d1.t, "call loadComponent after Fragment onStop!");
                      uob1.run();
                   }
                }
             }
          }else {
             goto label_0081 ;
          }
          b.f.a.put(LivePlayStage.BIZ_COMPONENT_INITED, Long.valueOf(b.d.j));
          b.f.f = b.d.k;
       }
       return;
    }
}

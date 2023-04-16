package com.kuaishou.live.core.basic.activity.LivePlayFragment$a;
import xq5.c;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.stage.LiveLoadingStage;
import com.kuaishou.live.core.basic.activity.f0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.e;
import android.app.Activity;
import com.kuaishou.live.core.basic.activity.e$b;
import ekd.k1;
import com.kuaishou.live.core.basic.activity.q0;
import com.kuaishou.live.core.basic.activity.p0;
import msd.l;
import en8.a;
import java.util.Iterator;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.activity.q0$b;

public class LivePlayFragment$a implements c	// class@00180d
{
    public final LivePlayFragment b;

    public void LivePlayFragment$a(LivePlayFragment p0){
       this.b = p0;
       super();
    }
    public void P(){
       b.a(this);
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment$a.class, "1")) {
          return;
       }
       boolean b = true;
       this.b.Hh(b);
       LivePlayFragment$a tb = this.b;
       boolean b1 = false;
       if (tb.j1 != null) {
          tb.Uh();
          tb.j1 = b1;
       }
       LivePlayFragment y1 = this.b.y1;
       Objects.requireNonNull(y1);
       if (!PatchProxy.applyVoid(null, y1, LivePlayLoader.class, "13")) {
          b.c0(y1.a, "onContainerWillShow", "liveStreamId", y1.j);
          y1.p = b1;
          y1.f(LiveLoadingStage.Sliding, (b ^ y1.o), new f0(y1));
       }
       y1 = this.b.z1;
       if (y1 != null) {
          Objects.requireNonNull(y1);
          if (!PatchProxy.applyVoid(null, y1, e.class, "7")) {
             Activity activity = y1.b.getActivity();
             if (activity != null) {
                y1.e(activity);
                k1.s(y1.h, y1, 3000);
             }
          }
       }
       return;
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       LivePlayLoader e;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment$a.class, str)) {
          return;
       }
       this.b.Vh();
       LivePlayFragment$a tb = this.b;
       boolean b = true;
       tb.j1 = b;
       LivePlayFragment y1 = tb.y1;
       Objects.requireNonNull(y1);
       if (!PatchProxy.applyVoid(objArray, y1, LivePlayLoader.class, "14")) {
          b.c0(y1.a, "onContainerWillShowCanceled", "liveStreamId", y1.j);
          y1.p = b;
          e = y1.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, q0.class, str)) {
             b.c0(q0.e, "onContainerWillShowCanceled", "liveStreamId", e.b);
             q0 a = e.a;
             if (a != null) {
                a.b(p0.b);
             }
             Iterator iterator = e.c.iterator();
             while (iterator.hasNext()) {
                q0$b uob = iterator.next();
                if (uob.b != null) {
                   uob.y1();
                }
             }
             e.c.clear();
          }
       }
       y1 = this.b.z1;
       if (y1 != null) {
          Objects.requireNonNull(y1);
          if (!PatchProxy.applyVoid(objArray, y1, e.class, "8")) {
             k1.m(y1.h);
             Activity activity = y1.b.getActivity();
             if (activity != null) {
                y1.g(activity);
             }
          }
       }
       return;
    }
}

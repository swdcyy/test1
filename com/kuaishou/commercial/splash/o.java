package com.kuaishou.commercial.splash.o;
import erd.g;
import com.kuaishou.commercial.splash.q;
import java.lang.Object;
import tjc.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import java.lang.ref.WeakReference;
import android.app.Activity;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kuaishou.commercial.splash.i;
import cz.b;
import cz.d;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yy.i0;
import java.lang.Runnable;
import ekd.k1;

public final class o implements g	// class@0015b6
{
    public final q b;
    public final boolean c;

    public void o(q p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       o tb = this.b;
       o tc = this.c;
       Objects.requireNonNull(tb);
       q oq = q.class;
       int i = 0;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oq, "43")) {
       }else if(p0 != null && p0.d == null){
          Object[] objArray1 = new Object[i];
          j0.f("SplashDataManager", "checkCancelRealtimeTimer", objArray1);
          tb.e();
       }
       q i1 = tb.i;
       Activity uActivity = (i1 != null)? i1.get(): null;
       if (tb.h != null && uActivity != null) {
          int i2 = -536296199;
          if (d.a(i2).Xe()) {
             if (p0.b != null) {
                i.d(d.b(RequestTiming.ON_FOREGROUND, p0, i.v));
             }
          }else if(!d.a(i2).yz()){
             tb.k(2);
             p0 = new Object[i];
             j0.f("SplashDataManager", "enterEnhancedSplash in hot start >>>", p0);
             if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(uActivity, Boolean.valueOf(tc), tb, oq, "9")) {
                boolean b = tb.D2();
                Object[] objArray = new Object[i];
                j0.f("SplashDataManager", "enterSplashOnHotStart,mState: "+tb.a+",needEyemaxSplash:"+b, objArray);
                if (!b) {
                   if (tc != null) {
                      k1.o(new i0(tb, uActivity));
                   }else {
                      tb.g(uActivity);
                   }
                }
             }
          }
       }
       return;
    }
}

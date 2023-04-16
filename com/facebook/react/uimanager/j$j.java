package com.facebook.react.uimanager.j$j;
import ze.e;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.j$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import cb.a;
import hg.a;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import java.lang.System;
import java.util.ArrayDeque;
import com.facebook.react.uimanager.j$w;
import android.os.SystemClock;
import yd.e;
import java.lang.Exception;

public class j$j extends e	// class@00135c
{
    public final int d;
    public final j e;

    public void j$j(j p0,ReactContext p1,int p2,j$a p3){
       this.e = p0;
       super(p1);
       this.d = p2;
    }
    public void c(long p0){
       j$j oj = j$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "1")) {
          return;
       }
       if (this.e.l != null) {
          a.x("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
          return;
       }else {
          a.a(0, "dispatchNonBatchedUIOperations");
          if (this.e.F == null) {
             this.d(p0);
          }
          a.c(0, "dispatchNonBatchedUIOperations");
          a.a(0, "dispatchBatchedUIOperations");
          this.e.k();
          a.c(0, "dispatchBatchedUIOperations");
          ReactChoreographer.a().d(ReactChoreographer$CallbackType.DISPATCH_UI, this);
          return;
       }
    }
    public final void d(long p0){
       j$j oj = j$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "2")) {
          return;
       }
       long l = System.nanoTime() - p0;
       l = l / 0xf4240;
       long l1 = 16 - l;
       while (l1 - (long)this.d >= 0) {
          j d = this.e.d;
          _monitor_enter(d);
          if (this.e.i.isEmpty()) {
             _monitor_exit(d);
             break ;
          }else {
             j$w ow = this.e.i.pollFirst();
             try{
                _monitor_exit(d);
                this.e.u(ow);
                ow.execute();
                this.e.s(ow);
                oj = this.e;
                long l2 = SystemClock.uptimeMillis() - SystemClock.uptimeMillis();
                long l3 = oj.n + l2;
                oj.n = l3;
             }catch(java.lang.Exception e0){
                if (e.y) {
                   a.g("ReactNative", "Exception2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                   e0.printStackTrace();
                   goto label_0015 ;
                }else {
                   p0.l = true;
                   throw e0;
                }
             }
          }
       }
       return;
    }
}

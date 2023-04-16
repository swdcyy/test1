package com.kuaishou.live.longconnection.horserace.d$a;
import erd.g;
import com.kuaishou.live.longconnection.horserace.d;
import brd.v;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import mf3.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.util.concurrent.TimeUnit;
import brd.t;
import crd.b;
import brd.g;

public class d$a implements g	// class@000c8d
{
    public final v b;
    public final d c;

    public void d$a(d p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       d b;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          b.a("ObservableTimeBarrier", "timer: "+p0, objArray);
          if (!this.c.f.get()) {
             p0 = this.c.e;
             _monitor_enter(p0);
             int i1 = 1;
             if (this.c.e.isEmpty()) {
                d$a tc = this.c;
                if ((tc.h + i1) < tc.b.length) {
                   objArray1 = new Object[i];
                   b.a("ObservableTimeBarrier", "nextTimer, currentBarrierIndex: "+this.c.h, objArray1);
                   tc = this.c;
                   b = tc.b;
                   d h = tc.h;
                   int i2 = h + i1;
                   tc.h = i2;
                   t.timer((b[i2] - b[h]), TimeUnit.MILLISECONDS).doOnNext(this.c.d).subscribe();
                }else {
                   objArray1 = new Object[i];
                   b.a("ObservableTimeBarrier", "outOfAllBarriers", objArray1);
                   this.c.g.set(i1);
                }
             }else {
                this.b.onNext(this.c.e);
                this.c.f.set(i1);
                this.b.onComplete();
             }
             _monitor_exit(p0);
          }
       }
       return;
    }
}

package com.kuaishou.live.longconnection.horserace.d;
import brd.y;
import io.reactivex.g;
import brd.t;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.v;
import com.kuaishou.live.longconnection.horserace.AllNodeFailedException;
import java.lang.Throwable;
import brd.g;
import mf3.b;
import crd.b;
import com.kuaishou.live.longconnection.horserace.d$a;
import java.util.concurrent.TimeUnit;
import erd.g;
import com.kuaishou.live.longconnection.horserace.d$b;

public final class d implements y, g	// class@000c8f
{
    public final long[] b;
    public final t c;
    public g d;
    public final List e;
    public AtomicBoolean f;
    public AtomicBoolean g;
    public int h;
    public final List i;
    public v j;
    public int k;

    public void d(t p0,long[] p1){
       super();
       this.e = Collections.synchronizedList(new ArrayList());
       this.f = new AtomicBoolean();
       this.g = new AtomicBoolean();
       this.h = 0;
       this.i = Collections.synchronizedList(new ArrayList());
       this.b = p1;
       this.c = p0;
    }
    public static t b(t p0,long[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new d(p0, p1));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       if (this.j.isDisposed()) {
          return;
       }
       d te = this.e;
       _monitor_enter(te);
       if ((this.e.size() + this.i.size()) == this.k) {
          if (this.e.isEmpty()) {
             this.j.onError(new AllNodeFailedException(this.i));
          }else {
             this.j.onNext(this.e);
             this.f.set(true);
             this.j.onComplete();
          }
       }
       _monitor_exit(te);
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.f.get()) {
          return;
       }
       this.a();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (!this.f.get()) {
          this.i.add(p0);
       }
       this.a();
       return;
    }
    public void onNext(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (!this.f.get()) {
          int i = 0;
          if (this.g.get()) {
             objArray = new Object[i];
             b.a("ObservableTimeBarrier", "returnWhenOutOfAllBarriers", objArray);
             d te = this.e;
             _monitor_enter(te);
             if (!this.f.get()) {
                this.e.add(p0);
                this.j.onNext(this.e);
                this.f.set(true);
                this.j.onComplete();
             }
             _monitor_exit(te);
          }else {
             objArray = new Object[i];
             b.a("ObservableTimeBarrier", "receiveResult", objArray);
             this.e.add(p0);
          }
       }
       return;
    }
    public void onSubscribe(b p0){
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.a("ObservableTimeBarrier", "subscribe Start", objArray);
       this.j = p0;
       this.d = new d$a(this, p0);
       d tb = this.b;
       if (tb.length > 0) {
          t.timer(tb[this.h], TimeUnit.MILLISECONDS).doOnNext(this.d).subscribe();
       }
       this.c.forEach(new d$b(this));
       Object[] objArray1 = new Object[i];
       b.a("ObservableTimeBarrier", "subscribe end", objArray1);
       return;
    }
}

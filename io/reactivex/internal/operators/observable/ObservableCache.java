package io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableCache$a;
import brd.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable;
import crd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.System;

public final class ObservableCache extends a	// class@0012ef
{
    public final ObservableCache$a c;
    public final AtomicBoolean d;

    public void ObservableCache(t p0,ObservableCache$a p1){
       super(p0);
       this.c = p1;
       this.d = new AtomicBoolean();
    }
    public static t b(t p0,int p1){
       a.d(p1, "capacityHint");
       return a.h(new ObservableCache(p0, new ObservableCache$a(p0, p1)));
    }
    public void subscribeActual(y p0){
       ObservableCache$ReplayDisposable replayDispos = new ObservableCache$ReplayDisposable(p0, this.c);
       p0.onSubscribe(replayDispos);
       ObservableCache tc = this.c;
       ObservableCache$ReplayDisposable[] replayDispos1 = tc.i.get();
       while (replayDispos1 != ObservableCache$a.m) {
          int len = replayDispos1.length;
          int i = len + 1;
          ObservableCache$ReplayDisposable[] replayDispos2 = new ObservableCache$ReplayDisposable[i];
          System.arraycopy(replayDispos1, false, replayDispos2, false, len);
          replayDispos2[len] = replayDispos;
          if (tc.i.compareAndSet(replayDispos1, replayDispos2)) {
             break ;
          }
       }
       if (!this.d.get() && this.d.compareAndSet(false, true)) {
          tc = this.c;
          tc.g.subscribe(tc);
          tc.j = true;
       }
       replayDispos.replay();
       return;
    }
}

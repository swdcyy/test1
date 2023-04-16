package io.reactivex.internal.operators.observable.ObservableCombineLatest;
import brd.t;
import brd.w;
import java.lang.Iterable;
import erd.o;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.lang.System;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator;

public final class ObservableCombineLatest extends t	// class@0012f2
{
    public final w[] b;
    public final Iterable c;
    public final o d;
    public final int e;
    public final boolean f;

    public void ObservableCombineLatest(w[] p0,Iterable p1,o p2,int p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       int i1;
       int i2;
       ObservableCombineLatest tb = this.b;
       if (tb == null) {
          tb = new t[8];
          Iterator iterator = this.c.iterator();
          int i = 0;
          i1 = 0;
          while (iterator.hasNext()) {
             w ow = iterator.next();
             if (i1 == tb.length) {
                i2 = i1 >> 2;
                i2 = i2 + i1;
                w[] owArray = new w[i2];
                System.arraycopy(tb, i, owArray, i, i1);
                tb = owArray;
             }
             i2 = i1 + 1;
             tb[i1] = ow;
             i1 = i2;
          }
       }else {
          i1 = tb.length;
       }
       int i3 = i1;
       if (!i3) {
          EmptyDisposable.complete(p0);
          return;
       }else {
          ObservableCombineLatest$LatestCoordinator latestCoordi = new ObservableCombineLatest$LatestCoordinator(p0, this.d, i3, this.e, this.f);
          v7.subscribe(tb);
          return;
       }
    }
}

package io.reactivex.internal.operators.observable.ObservableZip;
import brd.t;
import brd.w;
import java.lang.Iterable;
import erd.o;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.lang.System;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator;

public final class ObservableZip extends t	// class@00139b
{
    public final w[] b;
    public final Iterable c;
    public final o d;
    public final int e;
    public final boolean f;

    public void ObservableZip(w[] p0,Iterable p1,o p2,int p3,boolean p4){
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
       ObservableZip tb = this.b;
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
       if (!i1) {
          EmptyDisposable.complete(p0);
          return;
       }else {
          new ObservableZip$ZipCoordinator(p0, this.d, i1, this.f).subscribe(tb, this.e);
          return;
       }
    }
}

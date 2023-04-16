package io.reactivex.internal.operators.observable.ObservableAmb;
import brd.t;
import brd.w;
import java.lang.Iterable;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.System;
import drd.a;
import io.reactivex.internal.operators.observable.ObservableAmb$a;
import io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver;
import java.util.concurrent.atomic.AtomicInteger;
import crd.b;

public final class ObservableAmb extends t	// class@0012e5
{
    public final w[] b;
    public final Iterable c;

    public void ObservableAmb(w[] p0,Iterable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       int i;
       int i1;
       ObservableAmb tb = this.b;
       String str = null;
       if (tb == null) {
          tb = new t[8];
          Iterator iterator = this.c.iterator();
          i = 0;
          while (true) {
             if (iterator.hasNext()) {
                w ow = iterator.next();
                if (ow == null) {
                   break ;
                }else if(i == tb.length){
                   i1 = i >> 2;
                   i1 = i1 + i;
                   w[] owArray = new w[i1];
                   System.arraycopy(tb, str, owArray, str, i);
                   tb = owArray;
                }
                i1 = i + 1;
                tb[i] = ow;
                i = i1;
             }
          }
          EmptyDisposable.error(new NullPointerException("One of the sources is null"), p0);
          return;
       }else {
          i = tb.length;
       }
       if (!i) {
          EmptyDisposable.complete(p0);
          return;
       }else if(i == 1){
          tb[str].subscribe(p0);
          return;
       }else {
          ObservableAmb$a uoa = new ObservableAmb$a(p0, i);
          ObservableAmb$a b = uoa.b;
          i = b.length;
          for (int i2 = 0; i2 < i; i2 = i3) {
             int i3 = i2 + 1;
             b[i2] = new ObservableAmb$AmbInnerObserver(uoa, i3, uoa.actual);
          }
          uoa.c.lazySet(str);
          uoa.actual.onSubscribe(uoa);
          for (; str < i && !uoa.c.get(); str = str + 1) {
             tb[str].subscribe(b[str]);
          }
          return;
       }
    }
}

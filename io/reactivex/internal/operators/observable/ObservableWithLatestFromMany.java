package io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.lang.Iterable;
import erd.o;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$a;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver;
import crd.b;

public final class ObservableWithLatestFromMany extends a	// class@001398
{
    public final w[] c;
    public final Iterable d;
    public final o e;

    public void ObservableWithLatestFromMany(w p0,Iterable p1,o p2){
       super(p0);
       this.c = null;
       this.d = p1;
       this.e = p2;
    }
    public void ObservableWithLatestFromMany(w p0,w[] p1,o p2){
       super(p0);
       this.c = p1;
       this.d = null;
       this.e = p2;
    }
    public void subscribeActual(y p0){
       int i;
       int i1;
       ObservableWithLatestFromMany tc = this.c;
       if (tc == null) {
          tc = new w[8];
          Iterator iterator = this.d.iterator();
          i = 0;
          while (iterator.hasNext()) {
             w ow = iterator.next();
             if (i == tc.length) {
                i1 = i >> 1;
                i1 = i1 + i;
                tc = Arrays.copyOf(tc, i1);
             }
             i1 = i + 1;
             tc[i] = ow;
             i = i1;
          }
       }else {
          i = tc.length;
       }
       if (!i) {
          new y0(this.b, new ObservableWithLatestFromMany$a(this)).subscribeActual(p0);
          return;
       }else {
          ObservableWithLatestFromMany$WithLatestFromObserver withLatestFr = new ObservableWithLatestFromMany$WithLatestFromObserver(p0, this.e, i);
          p0.onSubscribe(withLatestFr);
          withLatestFr.subscribe(tc, i);
          this.b.subscribe(withLatestFr);
          return;
       }
    }
}

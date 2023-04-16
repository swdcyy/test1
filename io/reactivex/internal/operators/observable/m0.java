package io.reactivex.internal.operators.observable.m0;
import brd.t;
import java.lang.Iterable;
import brd.y;
import java.util.Iterator;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.m0$a;
import crd.b;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;

public final class m0 extends t	// class@0013dc
{
    public final Iterable b;

    public void m0(Iterable p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       Iterator iterator = this.b.iterator();
       if (!iterator.hasNext()) {
          EmptyDisposable.complete(p0);
          return;
       }else {
          m0$a uoa = new m0$a(p0, iterator);
          p0.onSubscribe(uoa);
          if (uoa.d == null) {
             while (!uoa.isDisposed()) {
                p0 = uoa.b.next();
                a.c(p0, "The iterator returned a null value");
                uoa.actual.onNext(p0);
                if (!uoa.isDisposed()) {
                   if (!uoa.b.hasNext()) {
                      if (!uoa.isDisposed()) {
                         uoa.actual.onComplete();
                         break ;
                      }
                   }
                }
             }
          }
          return;
       }
    }
}

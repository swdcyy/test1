package io.reactivex.internal.operators.observable.ObservableScalarXMap$a;
import brd.t;
import java.lang.Object;
import erd.o;
import brd.y;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import java.util.concurrent.Callable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import crd.b;
import java.lang.Throwable;
import drd.a;

public final class ObservableScalarXMap$a extends t	// class@001361
{
    public final Object b;
    public final o c;

    public void ObservableScalarXMap$a(Object p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       Object obj = this.c.apply(this.b);
       a.c(obj, "The mapper returned a null ObservableSource");
       if (obj instanceof Callable) {
          obj = obj.call();
          if (obj == null) {
             EmptyDisposable.complete(p0);
             return;
          }else {
             ObservableScalarXMap$ScalarDisposable scalarDispos = new ObservableScalarXMap$ScalarDisposable(p0, obj);
             p0.onSubscribe(scalarDispos);
             scalarDispos.run();
          }
       }else {
          obj.subscribe(p0);
       }
       return;
    }
}

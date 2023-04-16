package io.reactivex.internal.operators.observable.ObservableScalarXMap;
import java.lang.Object;
import erd.o;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$a;
import ird.a;
import brd.w;
import brd.y;
import java.util.concurrent.Callable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import crd.b;
import java.lang.Throwable;
import drd.a;

public final class ObservableScalarXMap	// class@0018b4
{

    public static t a(Object p0,o p1){
       return a.h(new ObservableScalarXMap$a(p0, p1));
    }
    public static boolean b(w p0,y p1,o p2){
       if (!p0 instanceof Callable) {
          return false;
       }
       p0 = p0.call();
       if (p0 == null) {
          EmptyDisposable.complete(p1);
          return true;
       }else {
          p0 = p2.apply(p0);
          a.c(p0, "The mapper returned a null ObservableSource");
          if (p0 instanceof Callable) {
             p0 = p0.call();
             if (p0 == null) {
                EmptyDisposable.complete(p1);
                return true;
             }else {
                ObservableScalarXMap$ScalarDisposable scalarDispos = new ObservableScalarXMap$ScalarDisposable(p1, p0);
                p1.onSubscribe(scalarDispos);
                scalarDispos.run();
             }
          }else {
             p0.subscribe(p1);
          }
          return true;
       }
    }
}

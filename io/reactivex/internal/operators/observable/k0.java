package io.reactivex.internal.operators.observable.k0;
import java.util.concurrent.Callable;
import brd.t;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.y;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import crd.b;
import java.lang.Throwable;
import drd.a;
import ird.a;

public final class k0 extends t implements Callable	// class@0013cd
{
    public final Callable b;

    public void k0(Callable p0){
       super();
       this.b = p0;
    }
    public Object call(){
       Object obj = this.b.call();
       a.c(obj, "The callable returned a null value");
       return obj;
    }
    public void subscribeActual(y p0){
       DeferredScalarDisposable uDeferredSca = new DeferredScalarDisposable(p0);
       p0.onSubscribe(uDeferredSca);
       if (uDeferredSca.isDisposed()) {
          return;
       }
       Object obj = this.b.call();
       a.c(obj, "Callable returned null");
       uDeferredSca.complete(obj);
       return;
    }
}

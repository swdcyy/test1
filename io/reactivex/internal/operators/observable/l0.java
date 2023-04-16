package io.reactivex.internal.operators.observable.l0;
import brd.t;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import brd.y;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import crd.b;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;

public final class l0 extends t	// class@0018ee
{
    public final Future b;
    public final long c;
    public final TimeUnit d;

    public void l0(Future p0,long p1,TimeUnit p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       DeferredScalarDisposable uDeferredSca = new DeferredScalarDisposable(p0);
       p0.onSubscribe(uDeferredSca);
       if (!uDeferredSca.isDisposed()) {
          l0 td = this.d;
          Object obj = (td != null)? this.b.get(this.c, td): this.b.get();
          a.c(obj, "Future returned null");
          uDeferredSca.complete(obj);
       }
    label_0037 :
       return;
    }
}

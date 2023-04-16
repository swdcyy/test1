package io.reactivex.internal.operators.completable.f;
import brd.a;
import java.lang.Runnable;
import brd.d;
import crd.b;
import crd.c;
import java.lang.Throwable;
import drd.a;

public final class f extends a	// class@001206
{
    public final Runnable b;

    public void f(Runnable p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       b uob = c.b();
       p0.onSubscribe(uob);
       this.b.run();
       if (!uob.isDisposed()) {
          p0.onComplete();
       }
       return;
    }
}

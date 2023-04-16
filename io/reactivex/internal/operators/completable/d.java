package io.reactivex.internal.operators.completable.d;
import brd.a;
import erd.a;
import brd.d;
import crd.b;
import crd.c;
import java.lang.Throwable;
import drd.a;

public final class d extends a	// class@001203
{
    public final a b;

    public void d(a p0){
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

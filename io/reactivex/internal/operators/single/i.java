package io.reactivex.internal.operators.single.i;
import brd.a0;
import java.util.concurrent.Callable;
import brd.d0;
import crd.b;
import crd.c;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;
import ird.a;

public final class i extends a0	// class@001493
{
    public final Callable b;

    public void i(Callable p0){
       super();
       this.b = p0;
    }
    public void S(d0 p0){
       b uob = c.b();
       p0.onSubscribe(uob);
       if (uob.isDisposed()) {
          return;
       }
       Object obj = this.b.call();
       a.c(obj, "The callable returned a null value");
       if (!uob.isDisposed()) {
          p0.onSuccess(obj);
       }
       return;
    }
}

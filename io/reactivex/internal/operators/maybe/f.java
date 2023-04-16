package io.reactivex.internal.operators.maybe.f;
import java.util.concurrent.Callable;
import brd.m;
import brd.p;
import crd.b;
import crd.c;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;

public final class f extends m implements Callable	// class@0012b7
{
    public final Callable b;

    public void f(Callable p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       b uob = c.b();
       p0.onSubscribe(uob);
       if (!uob.isDisposed()) {
          Object obj = this.b.call();
          if (!uob.isDisposed()) {
             if (obj == null) {
                p0.onComplete();
             }else {
                p0.onSuccess(obj);
             }
          }
       }
       return;
    }
    public Object call(){
       return this.b.call();
    }
}

package io.reactivex.internal.operators.maybe.g;
import java.util.concurrent.Callable;
import brd.m;
import java.lang.Runnable;
import brd.p;
import crd.b;
import crd.c;
import java.lang.Throwable;
import drd.a;
import ird.a;
import java.lang.Object;

public final class g extends m implements Callable	// class@0012b8
{
    public final Runnable b;

    public void g(Runnable p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       b uob = c.b();
       p0.onSubscribe(uob);
       if (!uob.isDisposed()) {
          this.b.run();
          if (!uob.isDisposed()) {
             p0.onComplete();
          }
       }
       return;
    }
    public Object call(){
       this.b.run();
       return null;
    }
}

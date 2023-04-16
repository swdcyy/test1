package io.reactivex.internal.operators.observable.d$b;
import grd.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import brd.s;
import java.util.concurrent.BlockingQueue;

public final class d$b extends c	// class@0013ab
{
    public final BlockingQueue b;
    public final AtomicInteger c;

    public void d$b(){
       super();
       this.b = new ArrayBlockingQueue(1);
       this.c = new AtomicInteger();
    }
    public void a(){
       this.c.set(1);
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       a.l(p0);
    }
    public void onNext(Object p0){
       if (this.c.getAndSet(0) == 1 || !p0.h()) {
          while (!this.b.offer(p0)) {
             s os = this.b.poll();
             if (os != null && !os.h()) {
                p0 = os;
             }
          }
       }
       return;
    }
}

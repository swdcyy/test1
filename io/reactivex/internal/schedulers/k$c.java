package io.reactivex.internal.schedulers.k$c;
import brd.z$c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.schedulers.k$a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.k$b;
import java.lang.Long;
import java.lang.Object;
import io.reactivex.internal.schedulers.k$c$a;
import crd.c;

public final class k$c extends z$c	// class@0014b7
{
    public final PriorityBlockingQueue b;
    public final AtomicInteger c;
    public final AtomicInteger d;
    public boolean e;

    public void k$c(){
       super();
       this.b = new PriorityBlockingQueue();
       this.c = new AtomicInteger();
       this.d = new AtomicInteger();
    }
    public b b(Runnable p0){
       return this.e(p0, this.a(TimeUnit.MILLISECONDS));
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       long l = this.a(TimeUnit.MILLISECONDS) + p2.toMillis(p1);
       return this.e(new k$a(p0, this, l), l);
    }
    public void dispose(){
       this.e = true;
    }
    public b e(Runnable p0,long p1){
       if (this.e != null) {
          return EmptyDisposable.INSTANCE;
       }
       k$b uob = new k$b(p0, Long.valueOf(p1), this.d.incrementAndGet());
       this.b.add(uob);
       if (this.c.getAndIncrement()) {
          return c.d(new k$c$a(this, uob));
       }
       k$c uoc = 1;
       while (true) {
          if (this.e != null) {
             this.b.clear();
             return EmptyDisposable.INSTANCE;
          }else {
             k$b uob1 = this.b.poll();
             if (uob1 == null) {
                int i = - uoc;
                if (!this.c.addAndGet(i)) {
                   break ;
                }
             }else if(uob1.e == null){
                uob1.b.run();
             }
          }
       }
       return EmptyDisposable.INSTANCE;
    }
    public boolean isDisposed(){
       return this.e;
    }
}

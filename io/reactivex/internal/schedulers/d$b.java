package io.reactivex.internal.schedulers.d$b;
import brd.z$c;
import io.reactivex.internal.schedulers.d$a;
import java.util.concurrent.atomic.AtomicBoolean;
import crd.a;
import io.reactivex.internal.schedulers.d;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import io.reactivex.internal.schedulers.d$c;
import java.util.concurrent.ThreadFactory;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.a;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.schedulers.f;

public final class d$b extends z$c	// class@0014ab
{
    public final a b;
    public final d$a c;
    public final d$c d;
    public final AtomicBoolean e;

    public void d$b(d$a p0){
       d$c g;
       d$c uoc;
       super();
       this.e = new AtomicBoolean();
       this.c = p0;
       this.b = new a();
       if (p0.d.isDisposed()) {
          g = d.g;
       }else if(!p0.c.isEmpty()){
          uoc = p0.c.poll();
          if (uoc == null) {
             continue ;
          }
       }else {
          uoc = new d$c(p0.g);
          p0.d.c(uoc);
       }
       g = uoc;
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       if (this.b.isDisposed()) {
          return EmptyDisposable.INSTANCE;
       }
       return this.d.e(p0, p1, p2, this.b);
    }
    public void dispose(){
       if (this.e.compareAndSet(false, true)) {
          this.b.dispose();
          d$b tc = this.c;
          d$b td = this.d;
          td.d = tc.a() + tc.b;
          tc.c.offer(td);
       }
       return;
    }
    public boolean isDisposed(){
       return this.e.get();
    }
}

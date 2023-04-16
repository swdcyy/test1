package io.reactivex.internal.schedulers.j$a;
import brd.z$c;
import java.util.concurrent.ScheduledExecutorService;
import crd.a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import ird.a;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.disposables.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.lang.Throwable;

public final class j$a extends z$c	// class@0014b2
{
    public final ScheduledExecutorService b;
    public final a c;
    public boolean d;

    public void j$a(ScheduledExecutorService p0){
       super();
       this.b = p0;
       this.c = new a();
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       if (this.d != null) {
          return EmptyDisposable.INSTANCE;
       }
       try{
          ScheduledRunnable scheduledRun = new ScheduledRunnable(a.m(p0), this.c);
          this.c.c(scheduledRun);
          Future uFuture = (p1 <= 0)? this.b.submit(scheduledRun): this.b.schedule(scheduledRun, p1, p2);
          scheduledRun.setFuture(uFuture);
          return scheduledRun;
       }catch(java.util.concurrent.RejectedExecutionException e4){
          this.dispose();
          a.l(e4);
          return EmptyDisposable.INSTANCE;
       }
    }
    public void dispose(){
       if (this.d == null) {
          this.d = true;
          this.c.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.d;
    }
}

package io.reactivex.internal.schedulers.f;
import brd.z$c;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import io.reactivex.internal.schedulers.i;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.a;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.List;
import ird.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.lang.Throwable;

public class f extends z$c	// class@00193f
{
    public final ScheduledExecutorService b;
    public boolean c;

    public void f(ThreadFactory p0){
       super();
       this.b = i.a(p0);
    }
    public b b(Runnable p0){
       return this.c(p0, 0, null);
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       if (this.c != null) {
          return EmptyDisposable.INSTANCE;
       }
       return this.e(p0, p1, p2, null);
    }
    public void dispose(){
       if (this.c == null) {
          this.c = true;
          this.b.shutdownNow();
       }
       return;
    }
    public ScheduledRunnable e(Runnable p0,long p1,TimeUnit p2,a p3){
       ScheduledRunnable scheduledRun = new ScheduledRunnable(a.m(p0), p3);
       if (p3 != null && !p3.c(scheduledRun)) {
          return scheduledRun;
       }
       try{
          Future uFuture = (p1 <= 0)? this.b.submit(scheduledRun): this.b.schedule(scheduledRun, p1, p2);
          scheduledRun.setFuture(uFuture);
       }catch(java.util.concurrent.RejectedExecutionException e4){
          if (p3) {
             p3.a(scheduledRun);
          }
          a.l(e4);
       }
       return scheduledRun;
    }
    public boolean isDisposed(){
       return this.c;
    }
}

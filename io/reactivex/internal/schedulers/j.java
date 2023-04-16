package io.reactivex.internal.schedulers.j;
import brd.z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.schedulers.i;
import java.lang.Object;
import brd.z$c;
import io.reactivex.internal.schedulers.j$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import ird.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import io.reactivex.internal.schedulers.AbstractDirectTask;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.c;
import java.util.concurrent.ExecutorService;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import java.util.List;

public final class j extends z	// class@001947
{
    public final ThreadFactory b;
    public final AtomicReference c;
    public static final RxThreadFactory d;
    public static final ScheduledExecutorService e;

    static {
       ScheduledExecutorService scheduledExe = Executors.newScheduledThreadPool(0);
       j.e = scheduledExe;
       scheduledExe.shutdown();
       j.d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), 1);
    }
    public void j(){
       super(j.d);
    }
    public void j(ThreadFactory p0){
       super();
       AtomicReference uAtomicRefer = new AtomicReference();
       this.c = uAtomicRefer;
       this.b = p0;
       uAtomicRefer.lazySet(i.a(p0));
    }
    public z$c b(){
       return new j$a(this.c.get());
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       try{
          ScheduledDirectTask scheduledDir = new ScheduledDirectTask(a.m(p0));
          Future uFuture = (p1 <= 0)? this.c.get().submit(scheduledDir): this.c.get().schedule(scheduledDir, p1, p2);
          scheduledDir.setFuture(uFuture);
          return scheduledDir;
       }catch(java.util.concurrent.RejectedExecutionException e4){
          a.l(e4);
          return EmptyDisposable.INSTANCE;
       }
    }
    public b f(Runnable p0,long p1,long p2,TimeUnit p3){
       p0 = a.m(p0);
       int i = 0;
       if (p2 - i <= 0) {
          try{
             ScheduledExecutorService scheduledExe = this.c.get();
             c uoc = new c(p0, scheduledExe);
             Future uFuture = (p1 - i <= 0)? scheduledExe.submit(uoc): scheduledExe.schedule(uoc, p1, p3);
             uoc.a(uFuture);
             return uoc;
          }catch(java.util.concurrent.RejectedExecutionException e9){
             a.l(e9);
             return EmptyDisposable.INSTANCE;
          }
       }else {
          try{
             ScheduledDirectPeriodicTask scheduledDir = new ScheduledDirectPeriodicTask(p0);
             scheduledDir.setFuture(this.c.get().scheduleAtFixedRate(scheduledDir, p1, p2, p3));
             return scheduledDir;
          }catch(java.util.concurrent.RejectedExecutionException e9){
             a.l(e9);
             return EmptyDisposable.INSTANCE;
          }
       }
    }
    public void g(){
       ScheduledExecutorService e = j.e;
       if (this.c.get() != e) {
          ScheduledExecutorService andSet = this.c.getAndSet(e);
          if (andSet != e) {
             andSet.shutdownNow();
          }
       }
       return;
    }
}

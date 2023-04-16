package io.reactivex.internal.schedulers.ExecutorScheduler;
import brd.z;
import lrd.b;
import java.util.concurrent.Executor;
import brd.z$c;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker;
import java.lang.Runnable;
import crd.b;
import ird.a;
import java.util.concurrent.ExecutorService;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import io.reactivex.internal.schedulers.AbstractDirectTask;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$a;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;

public final class ExecutorScheduler extends z	// class@00192e
{
    public final Executor b;
    public static final z c;

    static {
       ExecutorScheduler.c = b.e();
    }
    public void ExecutorScheduler(Executor p0){
       super();
       this.b = p0;
    }
    public z$c b(){
       return new ExecutorScheduler$ExecutorWorker(this.b);
    }
    public b d(Runnable p0){
       p0 = a.m(p0);
       try{
          if (this.b instanceof ExecutorService) {
             ScheduledDirectTask scheduledDir = new ScheduledDirectTask(p0);
             scheduledDir.setFuture(this.b.submit(scheduledDir));
             return scheduledDir;
          }else {
             ExecutorScheduler$ExecutorWorker$BooleanRunnable uExecutorWor = new ExecutorScheduler$ExecutorWorker$BooleanRunnable(p0);
             this.b.execute(uExecutorWor);
             return uExecutorWor;
          }
       }catch(java.util.concurrent.RejectedExecutionException e2){
          a.l(e2);
          return EmptyDisposable.INSTANCE;
       }
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       p0 = a.m(p0);
       if (this.b instanceof ScheduledExecutorService) {
          try{
             ScheduledDirectTask scheduledDir = new ScheduledDirectTask(p0);
             scheduledDir.setFuture(this.b.schedule(scheduledDir, p1, p2));
             return scheduledDir;
          }catch(java.util.concurrent.RejectedExecutionException e3){
             a.l(e3);
             return EmptyDisposable.INSTANCE;
          }
       }else {
          ExecutorScheduler$DelayedRunnable uDelayedRunn = new ExecutorScheduler$DelayedRunnable(p0);
          uDelayedRunn.timed.replace(ExecutorScheduler.c.e(new ExecutorScheduler$a(this, uDelayedRunn), p1, p2));
          return uDelayedRunn;
       }
    }
    public b f(Runnable p0,long p1,long p2,TimeUnit p3){
       if (!this.b instanceof ScheduledExecutorService) {
          return super.f(p0, p1, p2, p3);
       }
       p0 = a.m(p0);
       try{
          ScheduledDirectPeriodicTask scheduledDir = new ScheduledDirectPeriodicTask(p0);
          scheduledDir.setFuture(this.b.scheduleAtFixedRate(scheduledDir, p1, p2, p3));
          return scheduledDir;
       }catch(java.util.concurrent.RejectedExecutionException e9){
          a.l(e9);
          return EmptyDisposable.INSTANCE;
       }
    }
}

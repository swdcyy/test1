package io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker;
import java.lang.Runnable;
import brd.z$c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import crd.a;
import io.reactivex.internal.queue.MpscLinkedQueue;
import crd.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import ird.a;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable;
import java.lang.Object;
import java.lang.Throwable;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$a;
import io.reactivex.internal.disposables.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Future;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import brd.z;
import io.reactivex.internal.schedulers.b;

public final class ExecutorScheduler$ExecutorWorker extends z$c implements Runnable	// class@00192c
{
    public final Executor b;
    public final MpscLinkedQueue c;
    public boolean d;
    public final AtomicInteger e;
    public final a f;

    public void ExecutorScheduler$ExecutorWorker(Executor p0){
       super();
       this.e = new AtomicInteger();
       this.f = new a();
       this.b = p0;
       this.c = new MpscLinkedQueue();
    }
    public b b(Runnable p0){
       if (this.d != null) {
          return EmptyDisposable.INSTANCE;
       }
       ExecutorScheduler$ExecutorWorker$BooleanRunnable uExecutorWor = new ExecutorScheduler$ExecutorWorker$BooleanRunnable(a.m(p0));
       this.c.offer(uExecutorWor);
       if (!this.e.getAndIncrement()) {
          try{
             this.b.execute(this);
          }catch(java.util.concurrent.RejectedExecutionException e2){
             this.d = true;
             this.c.clear();
             a.l(e2);
             return EmptyDisposable.INSTANCE;
          }
       }
       return uExecutorWor;
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       if (p1 - null <= 0) {
          return this.b(p0);
       }
       if (this.d != null) {
          return EmptyDisposable.INSTANCE;
       }
       SequentialDisposable sequentialDi = new SequentialDisposable();
       SequentialDisposable sequentialDi1 = new SequentialDisposable(sequentialDi);
       ScheduledRunnable scheduledRun = new ScheduledRunnable(new ExecutorScheduler$ExecutorWorker$a(this, sequentialDi1, a.m(p0)), this.f);
       this.f.c(scheduledRun);
       ExecutorScheduler$ExecutorWorker tb = this.b;
       if (tb instanceof ScheduledExecutorService) {
          try{
             scheduledRun.setFuture(tb.schedule(scheduledRun, p1, p2));
          }catch(java.util.concurrent.RejectedExecutionException e5){
             this.d = true;
             a.l(e5);
             return EmptyDisposable.INSTANCE;
          }
       }else {
          scheduledRun.setFuture(new b(ExecutorScheduler.c.e(scheduledRun, p1, p2)));
       }
       sequentialDi.replace(scheduledRun);
       return sequentialDi1;
    }
    public void dispose(){
       if (this.d == null) {
          this.d = true;
          this.f.dispose();
          if (!this.e.getAndIncrement()) {
             this.c.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.d;
    }
    public void run(){
       ExecutorScheduler$ExecutorWorker tc = this.c;
       int i = 1;
       while (true) {
          if (this.d != null) {
          }else {
             while (true) {
                Runnable runnable = tc.poll();
                if (runnable == null) {
                   if (this.d != null) {
                      tc.clear();
                      return;
                   }else {
                      i = - i;
                      if (!this.e.addAndGet(i)) {
                         return;
                      }
                      continue ;
                   }
                }else {
                   runnable.run();
                   if (this.d != null) {
                   }
                }
             }
             tc.clear();
             return;
          }
       }
       tc.clear();
       return;
    }
}

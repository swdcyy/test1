package io.reactivex.internal.schedulers.a;
import io.reactivex.internal.schedulers.h;
import brd.z;
import java.lang.Runtime;
import java.lang.String;
import java.lang.Integer;
import io.reactivex.internal.schedulers.a$c;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import io.reactivex.internal.schedulers.f;
import java.lang.Math;
import io.reactivex.internal.schedulers.a$b;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.schedulers.h$a;
import io.reactivex.internal.functions.a;
import brd.z$c;
import io.reactivex.internal.schedulers.a$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import java.util.Objects;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import ird.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import io.reactivex.internal.schedulers.AbstractDirectTask;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.c;
import java.util.concurrent.ExecutorService;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;

public final class a extends z implements h	// class@001937
{
    public final ThreadFactory b;
    public final AtomicReference c;
    public static final a$b d;
    public static final RxThreadFactory e;
    public static final int f;
    public static final a$c g;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       int i1 = Integer.getInteger("rx2.computation-threads", 0).intValue();
       if (i1 > 0 && i1 <= i) {
          i = i1;
       }
       a.f = i;
       a$c uoc = new a$c(new RxThreadFactory("RxComputationShutdown"));
       a.g = uoc;
       uoc.dispose();
       RxThreadFactory rxThreadFact = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), 1);
       a.e = rxThreadFact;
       a$b uob = new a$b(0, rxThreadFact);
       a.d = uob;
       uob.c();
    }
    public void a(){
       super(a.e);
    }
    public void a(ThreadFactory p0){
       super();
       this.b = p0;
       a$b d = a.d;
       AtomicReference uAtomicRefer = new AtomicReference(d);
       this.c = uAtomicRefer;
       a$b uob = new a$b(a.f, p0);
       if (!uAtomicRefer.compareAndSet(d, uob)) {
          uob.c();
       }
       return;
    }
    public void a(int p0,h$a p1){
       a.d(p0, "number > 0 required");
       this.c.get().a(p0, p1);
    }
    public z$c b(){
       return new a$a(this.c.get().b());
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       ScheduledDirectTask scheduledDir;
       try{
          a$c uoc = this.c.get().b();
          Objects.requireNonNull(uoc);
          scheduledDir = new ScheduledDirectTask(a.m(p0));
          Future uFuture = (p1 <= 0)? uoc.b.submit(scheduledDir): uoc.b.schedule(scheduledDir, p1, p2);
          scheduledDir.setFuture(uFuture);
       }catch(java.util.concurrent.RejectedExecutionException e5){
          a.l(e5);
          scheduledDir = EmptyDisposable.INSTANCE;
       }
       return scheduledDir;
    }
    public b f(Runnable p0,long p1,long p2,TimeUnit p3){
       c uoc1;
       a$c uoc = this.c.get().b();
       Objects.requireNonNull(uoc);
       p0 = a.m(p0);
       int i = 0;
       if (p2 - i <= 0) {
          try{
             uoc1 = new c(p0, uoc.b);
             Future uFuture = (p1 - i <= 0)? uoc.b.submit(uoc1): uoc.b.schedule(uoc1, p1, p3);
             uoc1.a(uFuture);
          }catch(java.util.concurrent.RejectedExecutionException e9){
             a.l(e9);
             uoc1 = EmptyDisposable.INSTANCE;
          }
       }else {
          try{
             ScheduledDirectPeriodicTask scheduledDir = new ScheduledDirectPeriodicTask(p0);
             scheduledDir.setFuture(uoc.b.scheduleAtFixedRate(scheduledDir, p1, p2, p3));
             uoc1 = scheduledDir;
          }catch(java.util.concurrent.RejectedExecutionException e9){
             a.l(e9);
             uoc1 = EmptyDisposable.INSTANCE;
          }
       }
    }
    public void g(){
       a$b uob;
       while (true) {
          uob = this.c.get();
          a$b d = a.d;
          if (uob == d) {
             return;
          }
          if (this.c.compareAndSet(uob, d)) {
             break ;
          }
       }
       uob.c();
       return;
    }
}

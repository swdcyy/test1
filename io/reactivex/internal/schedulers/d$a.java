package io.reactivex.internal.schedulers.d$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.ConcurrentLinkedQueue;
import crd.a;
import io.reactivex.internal.schedulers.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.lang.System;
import java.util.concurrent.Future;
import java.util.List;
import java.util.Iterator;
import io.reactivex.internal.schedulers.d$c;
import crd.b;

public final class d$a implements Runnable	// class@00193a
{
    public final long b;
    public final ConcurrentLinkedQueue c;
    public final a d;
    public final ScheduledExecutorService e;
    public final Future f;
    public final ThreadFactory g;

    public void d$a(long p0,TimeUnit p1,ThreadFactory p2){
       ScheduledFuture scheduledFut;
       ConcurrentLinkedQueue uConcurrentL;
       super();
       p0 = (p1 != null)? p1.toNanos(p0): null;
       long l = p0;
       this.b = l;
       this.c = new ConcurrentLinkedQueue();
       this.d = new a();
       this.g = p2;
       ScheduledExecutorService scheduledExe = null;
       if (p1 != null) {
          scheduledExe = Executors.newScheduledThreadPool(1, d.e);
          scheduledFut = scheduledExe.scheduleWithFixedDelay(this, l, l, TimeUnit.NANOSECONDS);
       }else {
          scheduledFut = scheduledExe;
       }
       this.e = scheduledExe;
       this.f = scheduledFut;
       return;
    }
    public long a(){
       return System.nanoTime();
    }
    public void b(){
       this.d.dispose();
       d$a tf = this.f;
       if (tf != null) {
          tf.cancel(true);
       }
       tf = this.e;
       if (tf != null) {
          tf.shutdownNow();
       }
       return;
    }
    public void run(){
       if (!this.c.isEmpty()) {
          long l = this.a();
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             d$c uoc = iterator.next();
             if (uoc.d - l <= 0) {
                if (this.c.remove(uoc)) {
                   this.d.a(uoc);
                }
             }
          }
       }
       return;
    }
}

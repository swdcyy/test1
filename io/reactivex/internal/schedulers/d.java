package io.reactivex.internal.schedulers.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.schedulers.d$c;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import io.reactivex.internal.schedulers.f;
import java.lang.Integer;
import java.lang.Math;
import io.reactivex.internal.schedulers.d$a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import brd.z$c;
import io.reactivex.internal.schedulers.d$b;

public final class d extends z	// class@00193d
{
    public final ThreadFactory b;
    public final AtomicReference c;
    public static final RxThreadFactory d;
    public static final RxThreadFactory e;
    public static final TimeUnit f;
    public static final d$c g;
    public static final d$a h;

    static {
       d.f = TimeUnit.SECONDS;
       d$c uoc = new d$c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
       d.g = uoc;
       uoc.dispose();
       int i = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
       RxThreadFactory rxThreadFact = new RxThreadFactory("RxCachedThreadScheduler", i);
       d.d = rxThreadFact;
       d.e = new RxThreadFactory("RxCachedWorkerPoolEvictor", i);
       d$a uoa = new d$a(0, null, rxThreadFact);
       d.h = uoa;
       uoa.b();
    }
    public void d(){
       super(d.d);
    }
    public void d(ThreadFactory p0){
       super();
       this.b = p0;
       d$a h = d.h;
       AtomicReference uAtomicRefer = new AtomicReference(h);
       this.c = uAtomicRefer;
       d$a uoa = new d$a(60, d.f, p0);
       if (!uAtomicRefer.compareAndSet(h, uoa)) {
          uoa.b();
       }
       return;
    }
    public z$c b(){
       return new d$b(this.c.get());
    }
    public void g(){
       d$a uoa;
       while (true) {
          uoa = this.c.get();
          d$a h = d.h;
          if (uoa == h) {
             return;
          }
          if (this.c.compareAndSet(uoa, h)) {
             break ;
          }
       }
       uoa.b();
       return;
    }
}

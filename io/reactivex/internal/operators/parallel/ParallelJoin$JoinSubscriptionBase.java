package io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;

public abstract class ParallelJoin$JoinSubscriptionBase extends AtomicInteger implements d	// class@00144a
{
    public final c actual;
    public boolean cancelled;
    public final AtomicInteger done;
    public final AtomicThrowable errors;
    public final AtomicLong requested;
    public final ParallelJoin$JoinInnerSubscriber[] subscribers;
    public static final long serialVersionUID = 0x2b063c9630832783;

    public void ParallelJoin$JoinSubscriptionBase(c p0,int p1,int p2){
       super();
       this.errors = new AtomicThrowable();
       this.requested = new AtomicLong();
       this.done = new AtomicInteger();
       this.actual = p0;
       ParallelJoin$JoinInnerSubscriber[] joinInnerSub = new ParallelJoin$JoinInnerSubscriber[p1];
       for (int i = 0; i < p1; i = i + 1) {
          joinInnerSub[i] = new ParallelJoin$JoinInnerSubscriber(this, p2);
       }
       this.subscribers = joinInnerSub;
       this.done.lazySet(p1);
       return;
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.cancelAll();
          if (!this.getAndIncrement()) {
             this.cleanup();
          }
       }
       return;
    }
    public void cancelAll(){
       int i = 0;
       ParallelJoin$JoinSubscriptionBase tsubscribers = this.subscribers;
       while (i < tsubscribers.length) {
          tsubscribers[i].cancel();
          i = i + 1;
       }
       return;
    }
    public void cleanup(){
       int i = 0;
       ParallelJoin$JoinSubscriptionBase tsubscribers = this.subscribers;
       while (i < tsubscribers.length) {
          tsubscribers[i].queue = null;
          i = i + 1;
       }
       return;
    }
    public abstract void drain();
    public abstract void onComplete();
    public abstract void onError(Throwable p0);
    public abstract void onNext(ParallelJoin$JoinInnerSubscriber p0,Object p1);
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.drain();
       }
       return;
    }
}

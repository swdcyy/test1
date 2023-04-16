package io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.lang.Throwable;
import java.lang.Object;
import cxd.d;

public final class ParallelJoin$JoinInnerSubscriber extends AtomicReference implements k	// class@001448
{
    public final int limit;
    public final ParallelJoin$JoinSubscriptionBase parent;
    public final int prefetch;
    public long produced;
    public n queue;
    public static final long serialVersionUID = 0x74b67204a49678c3;

    public void ParallelJoin$JoinInnerSubscriber(ParallelJoin$JoinSubscriptionBase p0,int p1){
       super();
       this.parent = p0;
       this.prefetch = p1;
       this.limit = p1 - (p1 >> 2);
    }
    public boolean cancel(){
       return SubscriptionHelper.cancel(this);
    }
    public n getQueue(){
       ParallelJoin$JoinInnerSubscriber tqueue = this.queue;
       if (tqueue == null) {
          tqueue = new SpscArrayQueue(this.prefetch);
          this.queue = tqueue;
       }
       return tqueue;
    }
    public void onComplete(){
       this.parent.onComplete();
    }
    public void onError(Throwable p0){
       this.parent.onError(p0);
    }
    public void onNext(Object p0){
       this.parent.onNext(this, p0);
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.setOnce(this, p0, (long)this.prefetch);
    }
    public void request(long p0){
       long l = this.produced + p0;
       if (l - (long)this.limit >= 0) {
          this.produced = 0;
          this.get().request(l);
       }else {
          this.produced = l;
       }
       return;
    }
    public void requestOne(){
       long l = this.produced + 1;
       if (!l - (long)this.limit) {
          this.produced = 0;
          this.get().request(l);
       }else {
          this.produced = l;
       }
       return;
    }
}

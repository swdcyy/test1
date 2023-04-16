package io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.b;
import java.lang.Throwable;
import java.lang.Object;
import cxd.d;

public final class FlowableRepeat$RepeatSubscriber extends AtomicInteger implements k	// class@00124f
{
    public final c actual;
    public long produced;
    public long remaining;
    public final SubscriptionArbiter sa;
    public final b source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void FlowableRepeat$RepeatSubscriber(c p0,long p1,SubscriptionArbiter p2,b p3){
       super();
       this.actual = p0;
       this.sa = p2;
       this.source = p3;
       this.remaining = p1;
    }
    public void onComplete(){
       FlowableRepeat$RepeatSubscriber tremaining = this.remaining;
       if (tremaining - Long.MAX_VALUE) {
          this.remaining = tremaining - 1;
       }
       if (tremaining) {
          this.subscribeNext();
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.produced = this.produced + 1;
       this.actual.onNext(p0);
    }
    public void onSubscribe(d p0){
       this.sa.setSubscription(p0);
    }
    public void subscribeNext(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.sa.isCancelled()) {
                return;
             }
             FlowableRepeat$RepeatSubscriber tproduced = this.produced;
             long l = 0;
             if (tproduced - l) {
                this.produced = l;
                this.sa.produced(tproduced);
             }
             this.source.subscribe(this);
             i = - i;
             if (this.addAndGet(i)) {
             }
          }
       }
       return;
    }
}

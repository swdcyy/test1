package io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import erd.e;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.b;
import java.lang.Throwable;
import drd.a;
import java.lang.Object;
import cxd.d;

public final class FlowableRepeatUntil$RepeatSubscriber extends AtomicInteger implements k	// class@001251
{
    public final c actual;
    public long produced;
    public final SubscriptionArbiter sa;
    public final b source;
    public final e stop;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void FlowableRepeatUntil$RepeatSubscriber(c p0,e p1,SubscriptionArbiter p2,b p3){
       super();
       this.actual = p0;
       this.sa = p2;
       this.source = p3;
       this.stop = p1;
    }
    public void onComplete(){
       if (this.stop.a()) {
          this.actual.onComplete();
       }else {
          this.subscribeNext();
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
             FlowableRepeatUntil$RepeatSubscriber tproduced = this.produced;
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

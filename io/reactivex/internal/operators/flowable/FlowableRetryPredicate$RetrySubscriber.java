package io.reactivex.internal.operators.flowable.FlowableRetryPredicate$RetrySubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import erd.r;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.b;
import java.lang.Throwable;
import java.lang.Object;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import cxd.d;

public final class FlowableRetryPredicate$RetrySubscriber extends AtomicInteger implements k	// class@001257
{
    public final c actual;
    public final r predicate;
    public long produced;
    public long remaining;
    public final SubscriptionArbiter sa;
    public final b source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void FlowableRetryPredicate$RetrySubscriber(c p0,long p1,r p2,SubscriptionArbiter p3,b p4){
       super();
       this.actual = p0;
       this.sa = p3;
       this.source = p4;
       this.predicate = p2;
       this.remaining = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       FlowableRetryPredicate$RetrySubscriber tremaining = this.remaining;
       if (tremaining - Long.MAX_VALUE) {
          this.remaining = tremaining - 1;
       }
       if (!tremaining) {
          this.actual.onError(p0);
       }else if(!this.predicate.test(p0)){
          this.actual.onError(p0);
          return;
       }else {
          this.subscribeNext();
       }
       return;
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
             FlowableRetryPredicate$RetrySubscriber tproduced = this.produced;
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

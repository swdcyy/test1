package io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import erd.d;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.b;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Object;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import cxd.d;

public final class FlowableRetryBiPredicate$RetryBiSubscriber extends AtomicInteger implements k	// class@001255
{
    public final c actual;
    public final d predicate;
    public long produced;
    public int retries;
    public final SubscriptionArbiter sa;
    public final b source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void FlowableRetryBiPredicate$RetryBiSubscriber(c p0,d p1,SubscriptionArbiter p2,b p3){
       super();
       this.actual = p0;
       this.sa = p2;
       this.source = p3;
       this.predicate = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       int i = this.retries + 1;
       this.retries = i;
       if (!this.predicate.a(Integer.valueOf(i), p0)) {
          this.actual.onError(p0);
          return;
       }else {
          this.subscribeNext();
          return;
       }
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
             FlowableRetryBiPredicate$RetryBiSubscriber tproduced = this.produced;
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

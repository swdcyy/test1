package io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.r;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate$RetrySubscriber;
import cxd.b;

public final class FlowableRetryPredicate extends a	// class@001258
{
    public final r d;
    public final long e;

    public void FlowableRetryPredicate(h p0,long p1,r p2){
       super(p0);
       this.d = p2;
       this.e = p1;
    }
    public void D(c p0){
       SubscriptionArbiter subscription = new SubscriptionArbiter();
       p0.onSubscribe(subscription);
       FlowableRetryPredicate$RetrySubscriber retrySubscri = new FlowableRetryPredicate$RetrySubscriber(p0, this.e, this.d, subscription, this.c);
       v7.subscribeNext();
    }
}

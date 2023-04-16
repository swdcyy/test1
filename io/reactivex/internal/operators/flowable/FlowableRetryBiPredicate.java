package io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.d;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber;
import cxd.b;

public final class FlowableRetryBiPredicate extends a	// class@001256
{
    public final d d;

    public void FlowableRetryBiPredicate(h p0,d p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       SubscriptionArbiter subscription = new SubscriptionArbiter();
       p0.onSubscribe(subscription);
       new FlowableRetryBiPredicate$RetryBiSubscriber(p0, this.d, subscription, this.c).subscribeNext();
    }
}

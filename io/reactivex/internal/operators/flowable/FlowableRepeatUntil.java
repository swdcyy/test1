package io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.e;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber;
import cxd.b;

public final class FlowableRepeatUntil extends a	// class@001252
{
    public final e d;

    public void FlowableRepeatUntil(h p0,e p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       SubscriptionArbiter subscription = new SubscriptionArbiter();
       p0.onSubscribe(subscription);
       new FlowableRepeatUntil$RepeatSubscriber(p0, this.d, subscription, this.c).subscribeNext();
    }
}

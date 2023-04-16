package io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber;
import cxd.b;

public final class FlowableRepeat extends a	// class@001250
{
    public final long d;

    public void FlowableRepeat(h p0,long p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       SubscriptionArbiter subscription = new SubscriptionArbiter();
       p0.onSubscribe(subscription);
       FlowableRepeat td = this.d;
       long l = Long.MAX_VALUE;
       if (td - l) {
          l = td - 1;
       }
       FlowableRepeat$RepeatSubscriber repeatSubscr = new FlowableRepeat$RepeatSubscriber(p0, l, subscription, this.c);
       v6.subscribeNext();
       return;
    }
}

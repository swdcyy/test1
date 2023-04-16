package io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import cxd.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.g;
import java.lang.Throwable;
import java.lang.Object;
import cxd.d;

public final class FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber extends AtomicReference implements k	// class@001260
{
    public final FlowableTakeUntil$TakeUntilMainSubscriber this$0;
    public static final long serialVersionUID = 0xce23bba5d9f0d0ce;

    public void FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber(FlowableTakeUntil$TakeUntilMainSubscriber p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(){
       SubscriptionHelper.cancel(this.this$0.s);
       FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber tthis$0 = this.this$0;
       g.b(tthis$0.actual, tthis$0, tthis$0.error);
    }
    public void onError(Throwable p0){
       SubscriptionHelper.cancel(this.this$0.s);
       FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber tthis$0 = this.this$0;
       g.d(tthis$0.actual, p0, tthis$0, tthis$0.error);
    }
    public void onNext(Object p0){
       SubscriptionHelper.cancel(this);
       this.onComplete();
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.setOnce(this, p0, Long.MAX_VALUE);
    }
}

package io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.g;
import java.lang.Throwable;
import java.lang.Object;

public final class FlowableTakeUntil$TakeUntilMainSubscriber extends AtomicInteger implements k, d	// class@001261
{
    public final c actual;
    public final AtomicThrowable error;
    public final FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber other;
    public final AtomicLong requested;
    public final AtomicReference s;
    public static final long serialVersionUID = 0xbb5e1fcf35eca6b9;

    public void FlowableTakeUntil$TakeUntilMainSubscriber(c p0){
       super();
       this.actual = p0;
       this.requested = new AtomicLong();
       this.s = new AtomicReference();
       this.other = new FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber(this);
       this.error = new AtomicThrowable();
    }
    public void cancel(){
       SubscriptionHelper.cancel(this.s);
       SubscriptionHelper.cancel(this.other);
    }
    public void onComplete(){
       SubscriptionHelper.cancel(this.other);
       g.b(this.actual, this, this.error);
    }
    public void onError(Throwable p0){
       SubscriptionHelper.cancel(this.other);
       g.d(this.actual, p0, this, this.error);
    }
    public void onNext(Object p0){
       g.f(this.actual, p0, this, this.error);
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.deferredSetOnce(this.s, this.requested, p0);
    }
    public void request(long p0){
       SubscriptionHelper.deferredRequest(this.s, this.requested, p0);
    }
}

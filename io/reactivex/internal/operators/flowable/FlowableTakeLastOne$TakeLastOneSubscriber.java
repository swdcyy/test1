package io.reactivex.internal.operators.flowable.FlowableTakeLastOne$TakeLastOneSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import cxd.d;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableTakeLastOne$TakeLastOneSubscriber extends DeferredScalarSubscription implements k	// class@00125e
{
    public d s;
    public static final long serialVersionUID = 0xb41e4d724d48f046;

    public void FlowableTakeLastOne$TakeLastOneSubscriber(c p0){
       super(p0);
    }
    public void cancel(){
       super.cancel();
       this.s.cancel();
    }
    public void onComplete(){
       DeferredScalarSubscription tvalue = this.value;
       if (tvalue != null) {
          this.complete(tvalue);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.value = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.value = p0;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
}

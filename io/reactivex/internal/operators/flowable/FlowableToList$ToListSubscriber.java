package io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber;
import brd.k;
import cxd.d;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import java.util.Collection;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableToList$ToListSubscriber extends DeferredScalarSubscription implements k, d	// class@001263
{
    public d s;
    public static final long serialVersionUID = 0x8f1daa7383126210;

    public void FlowableToList$ToListSubscriber(c p0,Collection p1){
       super(p0);
       this.value = p1;
    }
    public void cancel(){
       super.cancel();
       this.s.cancel();
    }
    public void onComplete(){
       this.complete(this.value);
    }
    public void onError(Throwable p0){
       this.value = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       DeferredScalarSubscription tvalue = this.value;
       if (tvalue != null) {
          tvalue.add(p0);
       }
       return;
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

package io.reactivex.internal.operators.flowable.FlowableCollect$CollectSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import java.lang.Object;
import erd.b;
import cxd.d;
import java.lang.Throwable;
import ird.a;
import drd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableCollect$CollectSubscriber extends DeferredScalarSubscription implements k	// class@001215
{
    public final b collector;
    public boolean done;
    public d s;
    public final Object u;
    public static final long serialVersionUID = 0xce2f5b1824f0cf92;

    public void FlowableCollect$CollectSubscriber(c p0,Object p1,b p2){
       super(p0);
       this.collector = p2;
       this.u = p1;
    }
    public void cancel(){
       super.cancel();
       this.s.cancel();
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.complete(this.u);
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.done = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       this.collector.accept(this.u, p0);
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

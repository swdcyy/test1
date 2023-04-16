package io.reactivex.internal.operators.flowable.FlowableReduce$ReduceSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import erd.c;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class FlowableReduce$ReduceSubscriber extends DeferredScalarSubscription implements k	// class@00124d
{
    public final c reducer;
    public d s;
    public static final long serialVersionUID = 0xbf468f1e6c6e702a;

    public void FlowableReduce$ReduceSubscriber(c p0,c p1){
       super(p0);
       this.reducer = p1;
    }
    public void cancel(){
       super.cancel();
       this.s.cancel();
       this.s = SubscriptionHelper.CANCELLED;
    }
    public void onComplete(){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (this.s == cANCELLED) {
          return;
       }
       this.s = cANCELLED;
       DeferredScalarSubscription tvalue = this.value;
       if (tvalue != null) {
          this.complete(tvalue);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (this.s == cANCELLED) {
          a.l(p0);
          return;
       }else {
          this.s = cANCELLED;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.s == SubscriptionHelper.CANCELLED) {
          return;
       }
       DeferredScalarSubscription tvalue = this.value;
       if (tvalue == null) {
          this.value = p0;
       }else {
          p0 = this.reducer.a(tvalue, p0);
          a.c(p0, "The reducer returned a null value");
          this.value = p0;
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

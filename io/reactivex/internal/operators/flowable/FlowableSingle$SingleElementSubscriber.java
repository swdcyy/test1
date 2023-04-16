package io.reactivex.internal.operators.flowable.FlowableSingle$SingleElementSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import java.lang.Object;
import cxd.d;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableSingle$SingleElementSubscriber extends DeferredScalarSubscription implements k	// class@001259
{
    public final Object defaultValue;
    public boolean done;
    public final boolean failOnEmpty;
    public d s;
    public static final long serialVersionUID = 0xb34f876ba0fe37df;

    public void FlowableSingle$SingleElementSubscriber(c p0,Object p1,boolean p2){
       super(p0);
       this.defaultValue = p1;
       this.failOnEmpty = p2;
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
       DeferredScalarSubscription tvalue = this.value;
       this.value = null;
       if (tvalue == null) {
          tvalue = this.defaultValue;
       }
       if (tvalue == null) {
          if (this.failOnEmpty != null) {
             this.actual.onError(new NoSuchElementException());
          }else {
             this.actual.onComplete();
          }
       }else {
          this.complete(tvalue);
       }
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
       if (this.value != null) {
          this.done = true;
          this.s.cancel();
          this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.value = p0;
          return;
       }
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

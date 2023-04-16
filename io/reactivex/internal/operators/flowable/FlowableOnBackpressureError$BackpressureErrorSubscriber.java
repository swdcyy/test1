package io.reactivex.internal.operators.flowable.FlowableOnBackpressureError$BackpressureErrorSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicLong;
import cxd.c;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.internal.util.b;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableOnBackpressureError$BackpressureErrorSubscriber extends AtomicLong implements k, d	// class@001249
{
    public final c actual;
    public boolean done;
    public d s;
    public static final long serialVersionUID = 0xd3eadf94ef5ca886;

    public void FlowableOnBackpressureError$BackpressureErrorSubscriber(c p0){
       super();
       this.actual = p0;
    }
    public void cancel(){
       this.s.cancel();
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.actual.onComplete();
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
       if (this.get()) {
          this.actual.onNext(p0);
          b.c(this, 1);
       }else {
          this.onError(new MissingBackpressureException("could not emit value due to lack of requests"));
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
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this, p0);
       }
       return;
    }
}

package io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicLong;
import cxd.c;
import erd.g;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.internal.util.b;
import drd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableOnBackpressureDrop$BackpressureDropSubscriber extends AtomicLong implements k, d	// class@001247
{
    public final c actual;
    public boolean done;
    public final g onDrop;
    public d s;
    public static final long serialVersionUID = 0xa9516ac7a7bcf322;

    public void FlowableOnBackpressureDrop$BackpressureDropSubscriber(c p0,g p1){
       super();
       this.actual = p0;
       this.onDrop = p1;
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
          this.onDrop.accept(p0);
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

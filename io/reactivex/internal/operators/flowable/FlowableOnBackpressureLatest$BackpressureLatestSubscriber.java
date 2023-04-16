package io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest$BackpressureLatestSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableOnBackpressureLatest$BackpressureLatestSubscriber extends AtomicInteger implements k, d	// class@00124b
{
    public final c actual;
    public boolean cancelled;
    public final AtomicReference current;
    public boolean done;
    public Throwable error;
    public final AtomicLong requested;
    public d s;
    public static final long serialVersionUID = 0x24360dbf312449b;

    public void FlowableOnBackpressureLatest$BackpressureLatestSubscriber(c p0){
       super();
       this.requested = new AtomicLong();
       this.current = new AtomicReference();
       this.actual = p0;
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.cancel();
          if (!this.getAndIncrement()) {
             this.current.lazySet(null);
          }
       }
       return;
    }
    public boolean checkTerminated(boolean p0,boolean p1,c p2,AtomicReference p3){
       if (this.cancelled != null) {
          p3.lazySet(null);
          return true;
       }else if(p0){
          FlowableOnBackpressureLatest$BackpressureLatestSubscriber terror = this.error;
          if (terror != null) {
             p3.lazySet(null);
             p2.onError(terror);
             return true;
          }else if(p1){
             p2.onComplete();
             return true;
          }
       }
       return false;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       FlowableOnBackpressureLatest$BackpressureLatestSubscriber tactual = this.actual;
       FlowableOnBackpressureLatest$BackpressureLatestSubscriber trequested = this.requested;
       FlowableOnBackpressureLatest$BackpressureLatestSubscriber tcurrent = this.current;
       int i = 1;
    label_000f :
       long l = 0;
       while (true) {
          boolean b = false;
          if (l - trequested.get()) {
             FlowableOnBackpressureLatest$BackpressureLatestSubscriber tdone = this.done;
             Object andSet = tcurrent.getAndSet(null);
             boolean b1 = (andSet == null)? true: false;
             if (this.checkTerminated(tdone, b1, tactual, tcurrent)) {
                return;
             }else if(b1){
             label_0038 :
                if (!l - trequested.get()) {
                   tdone = this.done;
                   if (tcurrent.get() == null) {
                      b = true;
                   }
                   if (this.checkTerminated(tdone, b, tactual, tcurrent)) {
                      return;
                   }
                }
                if (l) {
                   b.c(trequested, l);
                }
                i = - i;
                if (!this.addAndGet(i)) {
                   break ;
                }else {
                   goto label_000f ;
                }
             }else {
                tactual.onNext(andSet);
                l = l + 1;
             }
          }else {
             goto label_0038 ;
          }
       }
       return;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.done = true;
       this.drain();
    }
    public void onNext(Object p0){
       this.current.lazySet(p0);
       this.drain();
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
          b.a(this.requested, p0);
          this.drain();
       }
       return;
    }
}

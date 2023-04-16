package io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber;
import brd.k;
import cxd.d;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import cxd.c;
import brd.z$c;
import cxd.b;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import crd.b;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.util.b;
import java.lang.Thread;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a;

public final class FlowableSubscribeOn$SubscribeOnSubscriber extends AtomicReference implements k, d, Runnable	// class@00125c
{
    public final c actual;
    public final boolean nonScheduledRequests;
    public final AtomicLong requested;
    public final AtomicReference s;
    public b source;
    public final z$c worker;
    public static final long serialVersionUID = 0x70559c6a66be0138;

    public void FlowableSubscribeOn$SubscribeOnSubscriber(c p0,z$c p1,b p2,boolean p3){
       super();
       this.actual = p0;
       this.worker = p1;
       this.source = p2;
       this.s = new AtomicReference();
       this.requested = new AtomicLong();
       this.nonScheduledRequests = p3 ^ 0x01;
    }
    public void cancel(){
       SubscriptionHelper.cancel(this.s);
       this.worker.dispose();
    }
    public void onComplete(){
       this.actual.onComplete();
       this.worker.dispose();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
       this.worker.dispose();
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.setOnce(this.s, p0)) {
          long andSet = this.requested.getAndSet(0);
          if (andSet) {
             this.requestUpstream(andSet, p0);
          }
       }
       return;
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          d uod = this.s.get();
          if (uod != null) {
             this.requestUpstream(p0, uod);
          }else {
             b.a(this.requested, p0);
             d uod1 = this.s.get();
             if (uod1 != null) {
                long andSet = this.requested.getAndSet(0);
                if (andSet) {
                   this.requestUpstream(andSet, uod1);
                }
             }
          }
       }
       return;
    }
    public void requestUpstream(long p0,d p1){
       if (this.nonScheduledRequests != null || Thread.currentThread() == this.get()) {
          p1.request(p0);
       }else {
          this.worker.b(new FlowableSubscribeOn$SubscribeOnSubscriber$a(p1, p0));
       }
       return;
    }
    public void run(){
       this.lazySet(Thread.currentThread());
       FlowableSubscribeOn$SubscribeOnSubscriber tsource = this.source;
       this.source = null;
       tsource.subscribe(this);
    }
}

package io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import java.lang.Object;
import cxd.d;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableElementAt$ElementAtSubscriber extends DeferredScalarSubscription implements k	// class@00122b
{
    public long count;
    public final Object defaultValue;
    public boolean done;
    public final boolean errorOnFewer;
    public final long index;
    public d s;
    public static final long serialVersionUID = 0x386f7dd17fceb6dd;

    public void FlowableElementAt$ElementAtSubscriber(c p0,long p1,Object p2,boolean p3){
       super(p0);
       this.index = p1;
       this.defaultValue = p2;
       this.errorOnFewer = p3;
    }
    public void cancel(){
       super.cancel();
       this.s.cancel();
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          FlowableElementAt$ElementAtSubscriber tdefaultValu = this.defaultValue;
          if (tdefaultValu == null) {
             if (this.errorOnFewer != null) {
                this.actual.onError(new NoSuchElementException());
             }else {
                this.actual.onComplete();
             }
          }else {
             this.complete(tdefaultValu);
          }
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
       FlowableElementAt$ElementAtSubscriber tcount = this.count;
       if (!tcount - this.index) {
          this.done = true;
          this.s.cancel();
          this.complete(p0);
          return;
       }else {
          this.count = tcount + 1;
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

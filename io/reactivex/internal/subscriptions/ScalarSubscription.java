package io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.internal.fuseable.l;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class ScalarSubscription extends AtomicInteger implements l	// class@0014c3
{
    public final c subscriber;
    public final Object value;
    public static final long serialVersionUID = 0xcad5d9aadd655d67;

    public void ScalarSubscription(c p0,Object p1){
       super();
       this.subscriber = p0;
       this.value = p1;
    }
    public void cancel(){
       this.lazySet(2);
    }
    public void clear(){
       this.lazySet(1);
    }
    public boolean isCancelled(){
       boolean b = (this.get() == 2)? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.get())? true: false;
       return b;
    }
    public boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public Object poll(){
       if (this.get()) {
          return null;
       }
       this.lazySet(1);
       return this.value;
    }
    public void request(long p0){
       if (!SubscriptionHelper.validate(p0)) {
          return;
       }
       if (this.compareAndSet(0, 1)) {
          ScalarSubscription tsubscriber = this.subscriber;
          tsubscriber.onNext(this.value);
          if (this.get() != 2) {
             tsubscriber.onComplete();
          }
       }
       return;
    }
    public int requestFusion(int p0){
       return (p0 & 0x01);
    }
}

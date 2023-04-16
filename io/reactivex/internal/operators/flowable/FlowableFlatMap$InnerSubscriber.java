package io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber;
import brd.k;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Object;
import java.lang.Throwable;
import cxd.d;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;

public final class FlowableFlatMap$InnerSubscriber extends AtomicReference implements k, b	// class@00122d
{
    public final int bufferSize;
    public boolean done;
    public int fusionMode;
    public final long id;
    public final int limit;
    public final FlowableFlatMap$MergeSubscriber parent;
    public long produced;
    public o queue;
    public static final long serialVersionUID = 0xc01393a8d0182fd9;

    public void FlowableFlatMap$InnerSubscriber(FlowableFlatMap$MergeSubscriber p0,long p1){
       super();
       this.id = p1;
       this.parent = p0;
       p0 = p0.bufferSize;
       this.bufferSize = p0;
       this.limit = p0 >> 2;
    }
    public void dispose(){
       SubscriptionHelper.cancel(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public void onComplete(){
       this.done = true;
       this.parent.drain();
    }
    public void onError(Throwable p0){
       this.lazySet(SubscriptionHelper.CANCELLED);
       this.parent.innerError(this, p0);
    }
    public void onNext(Object p0){
       if (this.fusionMode != 2) {
          this.parent.tryEmit(p0, this);
       }else {
          this.parent.drain();
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.setOnce(this, p0)) {
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(7);
             boolean b = true;
             if (i == b) {
                this.fusionMode = i;
                this.queue = ok;
                this.done = b;
                this.parent.drain();
                return;
             }else if(i == 2){
                this.fusionMode = i;
                this.queue = ok;
             }
          }
          p0.request((long)this.bufferSize);
       }
       return;
    }
    public void requestMore(long p0){
       if (this.fusionMode != 1) {
          long l = this.produced + p0;
          if (l - (long)this.limit >= 0) {
             this.produced = 0;
             this.get().request(l);
          }else {
             this.produced = l;
          }
       }
       return;
    }
}

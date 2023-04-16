package io.reactivex.internal.operators.flowable.FlowableInterval$IntervalSubscriber;
import cxd.d;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicLong;
import cxd.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.lang.Object;
import java.lang.Long;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import crd.b;

public final class FlowableInterval$IntervalSubscriber extends AtomicLong implements d, Runnable	// class@00123d
{
    public final c actual;
    public long count;
    public final AtomicReference resource;
    public static final long serialVersionUID = 0xd902bd31a5e97959;

    public void FlowableInterval$IntervalSubscriber(c p0){
       super();
       this.resource = new AtomicReference();
       this.actual = p0;
    }
    public void cancel(){
       DisposableHelper.dispose(this.resource);
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this, p0);
       }
       return;
    }
    public void run(){
       if (this.resource.get() != DisposableHelper.DISPOSED) {
          if (this.get() - null) {
             FlowableInterval$IntervalSubscriber tcount = this.count;
             this.count = tcount + 1;
             this.actual.onNext(Long.valueOf(tcount));
             b.c(this, 1);
          }else {
             this.actual.onError(new MissingBackpressureException("Can\'t deliver value "+this.count+" due to lack of requests"));
             DisposableHelper.dispose(this.resource);
          }
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.setOnce(this.resource, p0);
    }
}

package io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber;
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

public final class FlowableIntervalRange$IntervalRangeSubscriber extends AtomicLong implements d, Runnable	// class@00123f
{
    public final c actual;
    public long count;
    public final long end;
    public final AtomicReference resource;
    public static final long serialVersionUID = 0xd902bd31a5e97959;

    public void FlowableIntervalRange$IntervalRangeSubscriber(c p0,long p1,long p2){
       super();
       this.resource = new AtomicReference();
       this.actual = p0;
       this.count = p1;
       this.end = p2;
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
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.resource.get() != dISPOSED) {
          long l = this.get();
          if (l - null) {
             FlowableIntervalRange$IntervalRangeSubscriber tcount = this.count;
             this.actual.onNext(Long.valueOf(tcount));
             if (!tcount - this.end) {
                if (this.resource.get() != dISPOSED) {
                   this.actual.onComplete();
                }
                DisposableHelper.dispose(this.resource);
                return;
             }else {
                this.count = tcount + 1;
                if (l - Long.MAX_VALUE) {
                   this.decrementAndGet();
                }
             }
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

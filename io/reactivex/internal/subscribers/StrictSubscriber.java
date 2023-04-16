package io.reactivex.internal.subscribers.StrictSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.g;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class StrictSubscriber extends AtomicInteger implements k, d	// class@0014bb
{
    public final c actual;
    public boolean done;
    public final AtomicThrowable error;
    public final AtomicBoolean once;
    public final AtomicLong requested;
    public final AtomicReference s;
    public static final long serialVersionUID = 0xbb5fbab27df42e38;

    public void StrictSubscriber(c p0){
       super();
       this.actual = p0;
       this.error = new AtomicThrowable();
       this.requested = new AtomicLong();
       this.s = new AtomicReference();
       this.once = new AtomicBoolean();
    }
    public void cancel(){
       if (this.done == null) {
          SubscriptionHelper.cancel(this.s);
       }
       return;
    }
    public void onComplete(){
       this.done = true;
       g.b(this.actual, this, this.error);
    }
    public void onError(Throwable p0){
       this.done = true;
       g.d(this.actual, p0, this, this.error);
    }
    public void onNext(Object p0){
       g.f(this.actual, p0, this, this.error);
    }
    public void onSubscribe(d p0){
       if (this.once.compareAndSet(false, true)) {
          this.actual.onSubscribe(this);
          SubscriptionHelper.deferredSetOnce(this.s, this.requested, p0);
       }else {
          p0.cancel();
          this.cancel();
          this.onError(new IllegalStateException("¡ì2.12 violated: onSubscribe must be called at most once"));
       }
       return;
    }
    public void request(long p0){
       if (p0 - null <= 0) {
          this.cancel();
          this.onError(new IllegalArgumentException("¡ì3.9 violated: positive request amount required but it was "+p0));
       }else {
          SubscriptionHelper.deferredRequest(this.s, this.requested, p0);
       }
       return;
    }
}

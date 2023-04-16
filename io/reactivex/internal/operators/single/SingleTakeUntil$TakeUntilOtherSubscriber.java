package io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber;
import brd.k;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Object;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import cxd.d;

public final class SingleTakeUntil$TakeUntilOtherSubscriber extends AtomicReference implements k	// class@001473
{
    public final SingleTakeUntil$TakeUntilMainObserver parent;
    public static final long serialVersionUID = 0x47bf9f723cbf4ec5;

    public void SingleTakeUntil$TakeUntilOtherSubscriber(SingleTakeUntil$TakeUntilMainObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       SubscriptionHelper.cancel(this);
    }
    public void onComplete(){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (this.get() != cANCELLED) {
          this.lazySet(cANCELLED);
          this.parent.otherError(new CancellationException());
       }
       return;
    }
    public void onError(Throwable p0){
       this.parent.otherError(p0);
    }
    public void onNext(Object p0){
       if (SubscriptionHelper.cancel(this)) {
          this.parent.otherError(new CancellationException());
       }
       return;
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.setOnce(this, p0, Long.MAX_VALUE);
    }
}

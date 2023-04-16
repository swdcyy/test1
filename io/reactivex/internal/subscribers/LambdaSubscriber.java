package io.reactivex.internal.subscribers.LambdaSubscriber;
import brd.k;
import cxd.d;
import crd.b;
import grd.e;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import erd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.functions.Functions;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;

public final class LambdaSubscriber extends AtomicReference implements k, d, b, e	// class@0014ba
{
    public final a onComplete;
    public final g onError;
    public final g onNext;
    public final g onSubscribe;
    public static final long serialVersionUID = 0x9b5ed57b794ea334;

    public void LambdaSubscriber(g p0,g p1,a p2,g p3){
       super();
       this.onNext = p0;
       this.onError = p1;
       this.onComplete = p2;
       this.onSubscribe = p3;
    }
    public void cancel(){
       SubscriptionHelper.cancel(this);
    }
    public void dispose(){
       this.cancel();
    }
    public boolean hasCustomOnError(){
       boolean b = (this.onError != Functions.f)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public void onComplete(){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (this.get() != cANCELLED) {
          this.lazySet(cANCELLED);
          this.onComplete.run();
       }
       return;
    }
    public void onError(Throwable p0){
       SubscriptionHelper cANCELLED = SubscriptionHelper.CANCELLED;
       if (this.get() != cANCELLED) {
          this.lazySet(cANCELLED);
          this.onError.accept(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (!this.isDisposed()) {
          this.onNext.accept(p0);
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.setOnce(this, p0)) {
          this.onSubscribe.accept(this);
       }
       return;
    }
    public void request(long p0){
       this.get().request(p0);
    }
}

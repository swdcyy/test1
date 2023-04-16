package io.reactivex.internal.operators.observable.n0$a;
import brd.k;
import crd.b;
import brd.y;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Throwable;

public final class n0$a implements k, b	// class@0013e1
{
    public final y actual;
    public d b;

    public void n0$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.cancel();
       this.b = SubscriptionHelper.CANCELLED;
    }
    public boolean isDisposed(){
       boolean b = (this.b == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
}

package io.reactivex.internal.operators.flowable.x$a;
import brd.k;
import crd.b;
import brd.d0;
import java.util.Collection;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Throwable;

public final class x$a implements k, b	// class@00128e
{
    public final d0 actual;
    public d b;
    public Collection c;

    public void x$a(d0 p0,Collection p1){
       super();
       this.actual = p0;
       this.c = p1;
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
       this.b = SubscriptionHelper.CANCELLED;
       this.actual.onSuccess(this.c);
    }
    public void onError(Throwable p0){
       this.c = null;
       this.b = SubscriptionHelper.CANCELLED;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.c.add(p0);
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

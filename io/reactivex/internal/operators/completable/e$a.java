package io.reactivex.internal.operators.completable.e$a;
import brd.k;
import crd.b;
import brd.d;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Throwable;

public final class e$a implements k, b	// class@001204
{
    public final d b;
    public d c;

    public void e$a(d p0){
       super();
       this.b = p0;
    }
    public void dispose(){
       this.c.cancel();
       this.c = SubscriptionHelper.CANCELLED;
    }
    public boolean isDisposed(){
       boolean b = (this.c == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public void onComplete(){
       this.b.onComplete();
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onNext(Object p0){
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.c, p0)) {
          this.c = p0;
          this.b.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
}

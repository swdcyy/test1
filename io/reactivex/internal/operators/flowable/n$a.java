package io.reactivex.internal.operators.flowable.n$a;
import brd.k;
import crd.b;
import brd.d0;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.lang.Throwable;

public final class n$a implements k, b	// class@00127e
{
    public final d0 actual;
    public final Object b;
    public d c;
    public Object d;

    public void n$a(d0 p0,Object p1){
       super();
       this.actual = p0;
       this.b = p1;
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
       this.c = SubscriptionHelper.CANCELLED;
       n$a td = this.d;
       if (td != null) {
          this.d = null;
          this.actual.onSuccess(td);
       }else {
          td = this.b;
          if (td != null) {
             this.actual.onSuccess(td);
          }else {
             this.actual.onError(new NoSuchElementException());
          }
       }
       return;
    }
    public void onError(Throwable p0){
       this.c = SubscriptionHelper.CANCELLED;
       this.d = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.d = p0;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
}

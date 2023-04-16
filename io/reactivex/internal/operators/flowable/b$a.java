package io.reactivex.internal.operators.flowable.b$a;
import brd.k;
import crd.b;
import brd.d0;
import java.lang.Object;
import erd.b;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Throwable;
import ird.a;
import drd.a;

public final class b$a implements k, b	// class@001266
{
    public final d0 actual;
    public final b b;
    public final Object c;
    public d d;
    public boolean e;

    public void b$a(d0 p0,Object p1,b p2){
       super();
       this.actual = p0;
       this.b = p2;
       this.c = p1;
    }
    public void dispose(){
       this.d.cancel();
       this.d = SubscriptionHelper.CANCELLED;
    }
    public boolean isDisposed(){
       boolean b = (this.d == SubscriptionHelper.CANCELLED)? true: false;
       return b;
    }
    public void onComplete(){
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.d = SubscriptionHelper.CANCELLED;
       this.actual.onSuccess(this.c);
       return;
    }
    public void onError(Throwable p0){
       if (this.e != null) {
          a.l(p0);
          return;
       }else {
          this.e = true;
          this.d = SubscriptionHelper.CANCELLED;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.e != null) {
          return;
       }
       this.b.accept(this.c, p0);
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
}

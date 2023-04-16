package io.reactivex.internal.operators.flowable.g$a;
import brd.k;
import crd.b;
import brd.d0;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;

public final class g$a implements k, b	// class@001273
{
    public final d0 actual;
    public final long b;
    public final Object c;
    public d d;
    public long e;
    public boolean f;

    public void g$a(d0 p0,long p1,Object p2){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
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
       this.d = SubscriptionHelper.CANCELLED;
       if (this.f == null) {
          this.f = true;
          g$a tc = this.c;
          if (tc != null) {
             this.actual.onSuccess(tc);
          }else {
             this.actual.onError(new NoSuchElementException());
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.f != null) {
          a.l(p0);
          return;
       }else {
          this.f = true;
          this.d = SubscriptionHelper.CANCELLED;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.f != null) {
          return;
       }
       g$a te = this.e;
       if (!te - this.b) {
          this.f = true;
          this.d.cancel();
          this.d = SubscriptionHelper.CANCELLED;
          this.actual.onSuccess(p0);
          return;
       }else {
          this.e = te + 1;
          return;
       }
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

package io.reactivex.internal.operators.flowable.t$a;
import brd.k;
import crd.b;
import brd.d0;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class t$a implements k, b	// class@001288
{
    public final d0 actual;
    public final Object b;
    public d c;
    public boolean d;
    public Object e;

    public void t$a(d0 p0,Object p1){
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
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.c = SubscriptionHelper.CANCELLED;
       t$a te = this.e;
       this.e = null;
       if (te == null) {
          te = this.b;
       }
       if (te != null) {
          this.actual.onSuccess(te);
       }else {
          this.actual.onError(new NoSuchElementException());
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.c = SubscriptionHelper.CANCELLED;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (this.e != null) {
          this.d = true;
          this.c.cancel();
          this.c = SubscriptionHelper.CANCELLED;
          this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.e = p0;
          return;
       }
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

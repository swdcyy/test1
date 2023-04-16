package io.reactivex.internal.operators.flowable.p$a;
import brd.k;
import crd.b;
import brd.p;
import erd.c;
import java.lang.Object;
import cxd.d;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class p$a implements k, b	// class@001283
{
    public final p actual;
    public final c b;
    public Object c;
    public d d;
    public boolean e;

    public void p$a(p p0,c p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.d.cancel();
       this.e = true;
    }
    public boolean isDisposed(){
       return this.e;
    }
    public void onComplete(){
       if (this.e != null) {
          return;
       }
       this.e = true;
       p$a tc = this.c;
       if (tc != null) {
          this.actual.onSuccess(tc);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.e != null) {
          a.l(p0);
          return;
       }else {
          this.e = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.e != null) {
          return;
       }
       p$a tc = this.c;
       if (tc == null) {
          this.c = p0;
       }else {
          p0 = this.b.a(tc, p0);
          a.c(p0, "The reducer returned a null value");
          this.c = p0;
       }
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

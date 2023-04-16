package io.reactivex.internal.operators.flowable.f$a;
import brd.k;
import cxd.d;
import cxd.c;
import erd.g;
import erd.q;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class f$a implements k, d	// class@001271
{
    public final c actual;
    public final q b;
    public final a c;
    public d d;
    public final g onSubscribe;

    public void f$a(c p0,g p1,q p2,a p3){
       super();
       this.actual = p0;
       this.onSubscribe = p1;
       this.c = p3;
       this.b = p2;
    }
    public void cancel(){
       this.c.run();
       this.d.cancel();
       return;
    }
    public void onComplete(){
       if (this.d != SubscriptionHelper.CANCELLED) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d != SubscriptionHelper.CANCELLED) {
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(d p0){
       this.onSubscribe.accept(p0);
       if (SubscriptionHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
       this.b.a(p0);
       this.d.request(p0);
       return;
    }
}

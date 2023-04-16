package io.reactivex.internal.operators.flowable.u$a;
import brd.k;
import cxd.d;
import cxd.c;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import drd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class u$a implements k, d	// class@00128a
{
    public final c actual;
    public final r b;
    public d c;
    public boolean d;

    public void u$a(c p0,r p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void cancel(){
       this.c.cancel();
    }
    public void onComplete(){
       if (this.d == null) {
          this.d = true;
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d == null) {
          this.d = true;
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.d == null) {
          this.actual.onNext(p0);
          if (this.b.test(p0)) {
             this.d = true;
             this.c.cancel();
             this.actual.onComplete();
          }
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
       this.c.request(p0);
    }
}

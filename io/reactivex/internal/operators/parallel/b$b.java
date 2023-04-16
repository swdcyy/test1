package io.reactivex.internal.operators.parallel.b$b;
import brd.k;
import cxd.d;
import cxd.c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class b$b implements k, d	// class@001457
{
    public final c actual;
    public final o b;
    public d c;
    public boolean d;

    public void b$b(c p0,o p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void cancel(){
       this.c.cancel();
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       p0 = this.b.apply(p0);
       a.c(p0, "The mapper returned a null value");
       this.actual.onNext(p0);
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

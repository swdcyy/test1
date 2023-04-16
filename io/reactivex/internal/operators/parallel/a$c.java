package io.reactivex.internal.operators.parallel.a$c;
import io.reactivex.internal.operators.parallel.a$a;
import cxd.c;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class a$c extends a$a	// class@001454
{
    public final c actual;

    public void a$c(c p0,r p1){
       super(p1);
       this.actual = p0;
    }
    public boolean d(Object p0){
       if (this.d != null || !this.b.test(p0)) {
          return false;
       }
       this.actual.onNext(p0);
       return true;
    }
    public void onComplete(){
       if (this.d == null) {
          this.d = true;
          this.actual.onComplete();
       }
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
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

package io.reactivex.internal.operators.parallel.a$b;
import io.reactivex.internal.operators.parallel.a$a;
import io.reactivex.internal.fuseable.a;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import cxd.c;
import ird.a;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import brd.k;

public final class a$b extends a$a	// class@001453
{
    public final a actual;

    public void a$b(a p0,r p1){
       super(p1);
       this.actual = p0;
    }
    public boolean d(Object p0){
       if (this.d == null && this.b.test(p0)) {
          return this.actual.d(p0);
       }
       return false;
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

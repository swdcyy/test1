package io.reactivex.internal.operators.flowable.d$a;
import brd.k;
import cxd.d;
import cxd.c;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.operators.flowable.d$a$a;
import java.lang.Runnable;
import java.lang.Throwable;
import io.reactivex.internal.operators.flowable.d$a$b;
import io.reactivex.internal.operators.flowable.d$a$c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class d$a implements k, d	// class@00126c
{
    public final c actual;
    public final long b;
    public final TimeUnit c;
    public final z$c d;
    public final boolean e;
    public d f;

    public void d$a(c p0,long p1,TimeUnit p2,z$c p3,boolean p4){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void cancel(){
       this.f.cancel();
       this.d.dispose();
    }
    public void onComplete(){
       this.d.c(new d$a$a(this), this.b, this.c);
    }
    public void onError(Throwable p0){
       d$a td = this.d;
       d$a$b uoa$b = new d$a$b(this, p0);
       d$a tb = (this.e != null)? this.b: 0;
       td.c(uoa$b, tb, this.c);
       return;
    }
    public void onNext(Object p0){
       this.d.c(new d$a$c(this, p0), this.b, this.c);
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.f, p0)) {
          this.f = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
       this.f.request(p0);
    }
}

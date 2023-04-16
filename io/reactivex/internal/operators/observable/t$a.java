package io.reactivex.internal.operators.observable.t$a;
import brd.y;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.lang.Object;
import io.reactivex.internal.operators.observable.t$a$a;
import java.lang.Runnable;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.t$a$b;
import io.reactivex.internal.operators.observable.t$a$c;
import io.reactivex.internal.disposables.DisposableHelper;

public final class t$a implements y, b	// class@001407
{
    public final y actual;
    public final long b;
    public final TimeUnit c;
    public final z$c d;
    public final boolean e;
    public b f;

    public void t$a(y p0,long p1,TimeUnit p2,z$c p3,boolean p4){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void dispose(){
       this.f.dispose();
       this.d.dispose();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       this.d.c(new t$a$a(this), this.b, this.c);
    }
    public void onError(Throwable p0){
       t$a td = this.d;
       t$a$b uoa$b = new t$a$b(this, p0);
       t$a tb = (this.e != null)? this.b: 0;
       td.c(uoa$b, tb, this.c);
       return;
    }
    public void onNext(Object p0){
       this.d.c(new t$a$c(this, p0), this.b, this.c);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.f, p0)) {
          this.f = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

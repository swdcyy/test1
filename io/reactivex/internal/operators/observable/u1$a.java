package io.reactivex.internal.operators.observable.u1$a;
import brd.y;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import java.lang.Throwable;
import lrd.c;
import io.reactivex.internal.disposables.DisposableHelper;

public final class u1$a implements y, b	// class@00141e
{
    public final y actual;
    public final TimeUnit b;
    public final z c;
    public long d;
    public b e;

    public void u1$a(y p0,TimeUnit p1,z p2){
       super();
       this.actual = p0;
       this.c = p2;
       this.b = p1;
    }
    public void dispose(){
       this.e.dispose();
    }
    public boolean isDisposed(){
       return this.e.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       long l = this.c.c(this.b);
       u1$a td = this.d;
       this.d = l;
       l = l - td;
       this.actual.onNext(new c(p0, l, this.b));
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.d = this.c.c(this.b);
          this.actual.onSubscribe(this);
       }
       return;
    }
}

package io.reactivex.internal.operators.observable.q$a;
import brd.y;
import crd.b;
import brd.d0;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Long;
import java.lang.Throwable;

public final class q$a implements y, b	// class@0013f2
{
    public final d0 actual;
    public b b;
    public long c;

    public void q$a(d0 p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.dispose();
       this.b = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       this.b = DisposableHelper.DISPOSED;
       this.actual.onSuccess(Long.valueOf(this.c));
    }
    public void onError(Throwable p0){
       this.b = DisposableHelper.DISPOSED;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.c = this.c + 1;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

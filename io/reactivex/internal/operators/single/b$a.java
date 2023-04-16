package io.reactivex.internal.operators.single.b$a;
import brd.d0;
import crd.b;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;

public final class b$a implements d0, b	// class@001486
{
    public d0 actual;
    public b b;

    public void b$a(d0 p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.actual = null;
       this.b.dispose();
       this.b = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onError(Throwable p0){
       this.b = DisposableHelper.DISPOSED;
       b$a tactual = this.actual;
       if (tactual != null) {
          this.actual = null;
          tactual.onError(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.b = DisposableHelper.DISPOSED;
       b$a tactual = this.actual;
       if (tactual != null) {
          this.actual = null;
          tactual.onSuccess(p0);
       }
       return;
    }
}

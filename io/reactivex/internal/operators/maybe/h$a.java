package io.reactivex.internal.operators.maybe.h$a;
import brd.d0;
import crd.b;
import brd.p;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;

public final class h$a implements d0, b	// class@0012b9
{
    public final p actual;
    public b b;

    public void h$a(p p0){
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
    public void onError(Throwable p0){
       this.b = DisposableHelper.DISPOSED;
       this.actual.onError(p0);
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
       this.actual.onSuccess(p0);
    }
}

package io.reactivex.internal.operators.maybe.o$a;
import brd.p;
import crd.b;
import brd.d0;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.Throwable;

public final class o$a implements p, b	// class@0012c5
{
    public final d0 actual;
    public final Object b;
    public b c;

    public void o$a(d0 p0,Object p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       this.c = DisposableHelper.DISPOSED;
       o$a tb = this.b;
       if (tb != null) {
          this.actual.onSuccess(tb);
       }else {
          this.actual.onError(new NoSuchElementException("The MaybeSource is empty"));
       }
       return;
    }
    public void onError(Throwable p0){
       this.c = DisposableHelper.DISPOSED;
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.c = DisposableHelper.DISPOSED;
       this.actual.onSuccess(p0);
    }
}

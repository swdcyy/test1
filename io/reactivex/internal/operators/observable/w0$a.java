package io.reactivex.internal.operators.observable.w0$a;
import brd.y;
import crd.b;
import brd.d0;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.lang.Throwable;

public final class w0$a implements y, b	// class@001428
{
    public final d0 actual;
    public final Object b;
    public b c;
    public Object d;

    public void w0$a(d0 p0,Object p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       boolean b = (this.c == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.c = DisposableHelper.DISPOSED;
       w0$a td = this.d;
       if (td != null) {
          this.d = null;
          this.actual.onSuccess(td);
       }else {
          td = this.b;
          if (td != null) {
             this.actual.onSuccess(td);
          }else {
             this.actual.onError(new NoSuchElementException());
          }
       }
       return;
    }
    public void onError(Throwable p0){
       this.c = DisposableHelper.DISPOSED;
       this.d = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.d = p0;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

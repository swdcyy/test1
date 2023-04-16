package io.reactivex.internal.operators.observable.v0$a;
import brd.y;
import crd.b;
import brd.p;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;

public final class v0$a implements y, b	// class@001422
{
    public final p actual;
    public b b;
    public Object c;

    public void v0$a(p p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.dispose();
       this.b = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       boolean b = (this.b == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.b = DisposableHelper.DISPOSED;
       v0$a tc = this.c;
       if (tc != null) {
          this.c = null;
          this.actual.onSuccess(tc);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.b = DisposableHelper.DISPOSED;
       this.c = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.c = p0;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

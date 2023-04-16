package io.reactivex.internal.operators.observable.r1$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class r1$a implements y, b	// class@0013fc
{
    public final y actual;
    public b b;
    public Object c;

    public void r1$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.c = null;
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       r1$a tc = this.c;
       if (tc != null) {
          this.c = null;
          this.actual.onNext(tc);
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
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

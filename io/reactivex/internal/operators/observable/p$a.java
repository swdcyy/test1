package io.reactivex.internal.operators.observable.p$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Long;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class p$a implements y, b	// class@0013ec
{
    public final y actual;
    public b b;
    public long c;

    public void p$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       this.actual.onNext(Long.valueOf(this.c));
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
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

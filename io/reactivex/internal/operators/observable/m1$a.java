package io.reactivex.internal.operators.observable.m1$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class m1$a implements y, b	// class@0013dd
{
    public final y actual;
    public long b;
    public b c;

    public void m1$a(y p0,long p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       m1$a tb = this.b;
       if (tb) {
          this.b = tb - 1;
       }else {
          this.actual.onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

package io.reactivex.internal.operators.observable.r0$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;

public final class r0$a implements y, b	// class@0013fa
{
    public final y actual;
    public b b;

    public void r0$a(y p0){
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
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
    }
    public void onSubscribe(b p0){
       this.b = p0;
       this.actual.onSubscribe(this);
    }
}

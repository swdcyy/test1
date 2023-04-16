package io.reactivex.internal.operators.observable.s0$a;
import brd.y;
import crd.b;
import brd.d;
import java.lang.Object;
import java.lang.Throwable;

public final class s0$a implements y, b	// class@0013ff
{
    public final d actual;
    public b b;

    public void s0$a(d p0){
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

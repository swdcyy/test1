package io.reactivex.internal.operators.observable.o1$a;
import brd.y;
import crd.b;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class o1$a implements y, b	// class@0013e9
{
    public final y actual;
    public final r b;
    public b c;
    public boolean d;

    public void o1$a(y p0,r p1){
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
       if (this.d != null) {
          this.actual.onNext(p0);
       }else if(!this.b.test(p0)){
          this.d = true;
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

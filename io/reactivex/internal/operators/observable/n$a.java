package io.reactivex.internal.operators.observable.n$a;
import brd.y;
import crd.b;
import java.lang.Object;
import erd.b;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class n$a implements y, b	// class@0013e0
{
    public final y actual;
    public final b b;
    public final Object c;
    public b d;
    public boolean e;

    public void n$a(y p0,Object p1,b p2){
       super();
       this.actual = p0;
       this.b = p2;
       this.c = p1;
    }
    public void dispose(){
       this.d.dispose();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.actual.onNext(this.c);
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.e != null) {
          a.l(p0);
          return;
       }else {
          this.e = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.e != null) {
          return;
       }
       this.b.accept(this.c, p0);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

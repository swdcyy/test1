package io.reactivex.internal.operators.observable.i1$a;
import brd.y;
import crd.b;
import erd.c;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class i1$a implements y, b	// class@0013c6
{
    public final y actual;
    public final c b;
    public Object c;
    public b d;
    public boolean e;

    public void i1$a(y p0,c p1,Object p2){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
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
       p0 = this.b.a(this.c, p0);
       a.c(p0, "The accumulator returned a null value");
       this.c = p0;
       this.actual.onNext(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
          this.actual.onNext(this.c);
       }
       return;
    }
}

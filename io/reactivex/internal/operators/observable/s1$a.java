package io.reactivex.internal.operators.observable.s1$a;
import brd.y;
import crd.b;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class s1$a implements y, b	// class@001401
{
    public final y actual;
    public final r b;
    public b c;
    public boolean d;

    public void s1$a(y p0,r p1){
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
       if (this.d == null) {
          this.d = true;
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d == null) {
          this.d = true;
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.d == null) {
          this.actual.onNext(p0);
          if (this.b.test(p0)) {
             this.d = true;
             this.c.dispose();
             this.actual.onComplete();
          }
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

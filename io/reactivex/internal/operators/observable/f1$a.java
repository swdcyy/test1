package io.reactivex.internal.operators.observable.f1$a;
import brd.y;
import crd.b;
import brd.d0;
import erd.c;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class f1$a implements y, b	// class@0013b9
{
    public final d0 actual;
    public final c b;
    public Object c;
    public b d;

    public void f1$a(d0 p0,c p1,Object p2){
       super();
       this.actual = p0;
       this.c = p2;
       this.b = p1;
    }
    public void dispose(){
       this.d.dispose();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       f1$a tc = this.c;
       if (tc != null) {
          this.c = null;
          this.actual.onSuccess(tc);
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.c != null) {
          this.c = null;
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       f1$a tc = this.c;
       if (tc != null) {
          p0 = this.b.a(tc, p0);
          a.c(p0, "The reducer returned a null value");
          this.c = p0;
       }
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

package io.reactivex.internal.operators.observable.f$a;
import brd.y;
import crd.b;
import brd.d0;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Throwable;
import ird.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class f$a implements y, b	// class@0013b7
{
    public final d0 actual;
    public final r b;
    public b c;
    public boolean d;

    public void f$a(d0 p0,r p1){
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
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.actual.onSuccess(Boolean.TRUE);
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (!this.b.test(p0)) {
          this.d = true;
          this.c.dispose();
          this.actual.onSuccess(Boolean.FALSE);
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
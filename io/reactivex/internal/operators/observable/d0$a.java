package io.reactivex.internal.operators.observable.d0$a;
import brd.y;
import crd.b;
import brd.p;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class d0$a implements y, b	// class@0013ac
{
    public final p actual;
    public final long b;
    public b c;
    public long d;
    public boolean e;

    public void d0$a(p p0,long p1){
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
       if (this.e == null) {
          this.e = true;
          this.actual.onComplete();
       }
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
       d0$a td = this.d;
       if (!td - this.b) {
          this.e = true;
          this.c.dispose();
          this.actual.onSuccess(p0);
          return;
       }else {
          this.d = td + 1;
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

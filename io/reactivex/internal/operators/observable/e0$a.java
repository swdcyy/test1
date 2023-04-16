package io.reactivex.internal.operators.observable.e0$a;
import brd.y;
import crd.b;
import brd.d0;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class e0$a implements y, b	// class@0013b2
{
    public final d0 actual;
    public final long b;
    public final Object c;
    public b d;
    public long e;
    public boolean f;

    public void e0$a(d0 p0,long p1,Object p2){
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
       if (this.f == null) {
          this.f = true;
          e0$a tc = this.c;
          if (tc != null) {
             this.actual.onSuccess(tc);
          }else {
             this.actual.onError(new NoSuchElementException());
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.f != null) {
          a.l(p0);
          return;
       }else {
          this.f = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.f != null) {
          return;
       }
       e0$a te = this.e;
       if (!te - this.b) {
          this.f = true;
          this.d.dispose();
          this.actual.onSuccess(p0);
          return;
       }else {
          this.e = te + 1;
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

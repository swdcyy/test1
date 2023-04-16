package io.reactivex.internal.operators.observable.k1$a;
import brd.y;
import crd.b;
import brd.p;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import io.reactivex.internal.disposables.DisposableHelper;

public final class k1$a implements y, b	// class@0013ce
{
    public final p actual;
    public b b;
    public Object c;
    public boolean d;

    public void k1$a(p p0){
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
       if (this.d != null) {
          return;
       }
       this.d = true;
       k1$a tc = this.c;
       this.c = null;
       if (tc == null) {
          this.actual.onComplete();
       }else {
          this.actual.onSuccess(tc);
       }
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
       if (this.c != null) {
          this.d = true;
          this.b.dispose();
          this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.c = p0;
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

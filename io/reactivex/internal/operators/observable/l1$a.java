package io.reactivex.internal.operators.observable.l1$a;
import brd.y;
import crd.b;
import brd.d0;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import io.reactivex.internal.disposables.DisposableHelper;

public final class l1$a implements y, b	// class@0013d3
{
    public final d0 actual;
    public final Object b;
    public b c;
    public Object d;
    public boolean e;

    public void l1$a(d0 p0,Object p1){
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
       if (this.e != null) {
          return;
       }
       this.e = true;
       l1$a td = this.d;
       this.d = null;
       if (td == null) {
          td = this.b;
       }
       if (td != null) {
          this.actual.onSuccess(td);
       }else {
          this.actual.onError(new NoSuchElementException());
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
       if (this.d != null) {
          this.e = true;
          this.c.dispose();
          this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.d = p0;
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

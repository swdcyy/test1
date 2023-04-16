package io.reactivex.internal.operators.observable.c0$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class c0$a implements y, b	// class@0013a5
{
    public final y actual;
    public final long b;
    public final Object c;
    public final boolean d;
    public b e;
    public long f;
    public boolean g;

    public void c0$a(y p0,long p1,Object p2,boolean p3){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void dispose(){
       this.e.dispose();
    }
    public boolean isDisposed(){
       return this.e.isDisposed();
    }
    public void onComplete(){
       if (this.g == null) {
          this.g = true;
          c0$a tc = this.c;
          if (tc == null && this.d != null) {
             this.actual.onError(new NoSuchElementException());
          }else if(tc != null){
             this.actual.onNext(tc);
          }
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.g != null) {
          a.l(p0);
          return;
       }else {
          this.g = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.g != null) {
          return;
       }
       c0$a tf = this.f;
       if (!tf - this.b) {
          this.g = true;
          this.e.dispose();
          this.actual.onNext(p0);
          this.actual.onComplete();
          return;
       }else {
          this.f = tf + 1;
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

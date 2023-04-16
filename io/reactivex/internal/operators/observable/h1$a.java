package io.reactivex.internal.operators.observable.h1$a;
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

public final class h1$a implements y, b	// class@0013c1
{
    public final y actual;
    public final c b;
    public b c;
    public Object d;
    public boolean e;

    public void h1$a(y p0,c p1){
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
       h1$a tactual = this.actual;
       h1$a td = this.d;
       if (td == null) {
          this.d = p0;
          tactual.onNext(p0);
       }else {
          p0 = this.b.a(td, p0);
          a.c(p0, "The value returned by the accumulator is null");
          this.d = p0;
          tactual.onNext(p0);
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

package io.reactivex.internal.operators.observable.v$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import brd.s;
import io.reactivex.internal.disposables.DisposableHelper;

public final class v$a implements y, b	// class@001421
{
    public final y actual;
    public boolean b;
    public b c;

    public void v$a(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.b != null) {
          a.l(p0);
          return;
       }else {
          this.b = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.b != null) {
          if (p0.g()) {
             a.l(p0.d());
          }
       }else if(p0.g()){
          this.c.dispose();
          this.onError(p0.d());
       }else if(p0.f()){
          this.c.dispose();
          this.onComplete();
       }else {
          this.actual.onNext(p0.e());
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

package io.reactivex.internal.operators.observable.e1$a;
import brd.y;
import crd.b;
import brd.p;
import erd.c;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class e1$a implements y, b	// class@0013b4
{
    public final p actual;
    public final c b;
    public boolean c;
    public Object d;
    public b e;

    public void e1$a(p p0,c p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.e.dispose();
    }
    public boolean isDisposed(){
       return this.e.isDisposed();
    }
    public void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       e1$a td = this.d;
       this.d = null;
       if (td != null) {
          this.actual.onSuccess(td);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.c != null) {
          a.l(p0);
          return;
       }else {
          this.c = true;
          this.d = null;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.c == null) {
          e1$a td = this.d;
          if (td == null) {
             this.d = p0;
          }else {
             p0 = this.b.a(td, p0);
             a.c(p0, "The reducer returned a null value");
             this.d = p0;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

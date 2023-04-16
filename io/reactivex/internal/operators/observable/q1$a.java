package io.reactivex.internal.operators.observable.q1$a;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class q1$a implements y, b	// class@0013f5
{
    public final y actual;
    public boolean b;
    public b c;
    public long d;

    public void q1$a(y p0,long p1){
       super();
       this.actual = p0;
       this.d = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       if (this.b == null) {
          this.b = true;
          this.c.dispose();
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.b != null) {
          a.l(p0);
          return;
       }else {
          this.b = true;
          this.c.dispose();
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.b == null) {
          q1$a td = this.d;
          long l = td - 1;
          this.d = l;
          if (td > 0) {
             td = (!l)? 1: 0;
             this.actual.onNext(p0);
             if (td) {
                this.onComplete();
             }
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          if (!this.d) {
             this.b = true;
             p0.dispose();
             EmptyDisposable.complete(this.actual);
          }else {
             this.actual.onSubscribe(this);
          }
       }
       return;
    }
}

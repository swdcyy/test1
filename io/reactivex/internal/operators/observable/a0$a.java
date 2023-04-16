package io.reactivex.internal.operators.observable.a0$a;
import brd.y;
import crd.b;
import erd.g;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class a0$a implements y, b	// class@0018ce
{
    public final y actual;
    public final a b;
    public b c;
    public boolean d;
    public final a onComplete;
    public final g onError;
    public final g onNext;

    public void a0$a(y p0,g p1,g p2,a p3,a p4){
       super();
       this.actual = p0;
       this.onNext = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.b = p4;
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
       this.onComplete.run();
       this.d = true;
       this.actual.onComplete();
       this.b.run();
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.onError.accept(p0);
          this.actual.onError(p0);
          this.b.run();
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       this.onNext.accept(p0);
       this.actual.onNext(p0);
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

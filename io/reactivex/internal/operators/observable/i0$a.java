package io.reactivex.internal.operators.observable.i0$a;
import brd.y;
import crd.b;
import erd.o;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import ird.a;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class i0$a implements y, b	// class@0013c4
{
    public final y actual;
    public final o b;
    public b c;

    public void i0$a(y p0,o p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.c == dISPOSED) {
          return;
       }
       this.c = dISPOSED;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.c == dISPOSED) {
          a.l(p0);
          return;
       }else {
          this.c = dISPOSED;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.c == DisposableHelper.DISPOSED) {
          return;
       }
       p0 = this.b.apply(p0).iterator();
       i0$a tactual = this.actual;
       while (p0.hasNext()) {
          Object obj = p0.next();
          a.c(obj, "The iterator returned a null value");
          tactual.onNext(obj);
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

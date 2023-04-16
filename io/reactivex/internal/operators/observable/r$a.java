package io.reactivex.internal.operators.observable.r$a;
import brd.y;
import crd.b;
import erd.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.r$a$a;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import drd.a;

public final class r$a implements y, b	// class@0013f9
{
    public final y actual;
    public final o b;
    public b c;
    public final AtomicReference d;
    public long e;
    public boolean f;

    public void r$a(y p0,o p1){
       super();
       this.d = new AtomicReference();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       DisposableHelper.dispose(this.d);
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       if (this.f != null) {
          return;
       }
       this.f = true;
       b uob = this.d.get();
       if (uob != DisposableHelper.DISPOSED) {
          uob.a();
          DisposableHelper.dispose(this.d);
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.d);
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       if (this.f != null) {
          return;
       }
       long l = this.e + 1;
       this.e = l;
       b uob = this.d.get();
       if (uob != null) {
          uob.dispose();
       }
       Object obj = this.b.apply(p0);
       a.c(obj, "The ObservableSource supplied is null");
       r$a$a uoa$a = new r$a$a(this, l, p0);
       if (this.d.compareAndSet(uob, uoa$a)) {
          obj.subscribe(uoa$a);
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

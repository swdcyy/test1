package io.reactivex.internal.operators.completable.i$a;
import brd.d;
import crd.b;
import io.reactivex.internal.operators.completable.i;
import java.lang.Object;
import erd.a;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import erd.g;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class i$a implements d, b	// class@00120a
{
    public final d actual;
    public b b;
    public final i c;

    public void i$a(i p0,d p1){
       this.c = p0;
       super();
       this.actual = p1;
    }
    public void a(){
       this.c.d.run();
       return;
    }
    public void dispose(){
       this.c.e.run();
       this.b.dispose();
       return;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       if (this.b == DisposableHelper.DISPOSED) {
          return;
       }
       this.c.onComplete.run();
       this.c.c.run();
       this.actual.onComplete();
       this.a();
       return;
    }
    public void onError(Throwable p0){
       if (this.b == DisposableHelper.DISPOSED) {
          a.l(p0);
          return;
       }else {
          this.c.onError.accept(p0);
          this.c.c.run();
          this.actual.onError(p0);
          this.a();
          return;
       }
    }
    public void onSubscribe(b p0){
       this.c.onSubscribe.accept(p0);
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}

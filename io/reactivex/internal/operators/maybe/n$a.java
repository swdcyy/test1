package io.reactivex.internal.operators.maybe.n$a;
import brd.p;
import crd.b;
import io.reactivex.internal.operators.maybe.n;
import java.lang.Object;
import erd.a;
import java.lang.Throwable;
import drd.a;
import ird.a;
import erd.g;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class n$a implements p, b	// class@0012c3
{
    public final p actual;
    public b b;
    public final n parent;

    public void n$a(p p0,n p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void a(){
       this.parent.g.run();
       return;
    }
    public void b(Throwable p0){
       this.parent.e.accept(p0);
       this.b = DisposableHelper.DISPOSED;
       this.actual.onError(p0);
       this.a();
       return;
    }
    public void dispose(){
       this.parent.h.run();
       this.b.dispose();
       this.b = DisposableHelper.DISPOSED;
       return;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.b == dISPOSED) {
          return;
       }
       this.parent.f.run();
       this.b = dISPOSED;
       this.actual.onComplete();
       this.a();
       return;
    }
    public void onError(Throwable p0){
       if (this.b == DisposableHelper.DISPOSED) {
          a.l(p0);
          return;
       }else {
          this.b(p0);
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.parent.c.accept(p0);
          this.b = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.b == dISPOSED) {
          return;
       }
       this.parent.d.accept(p0);
       this.b = dISPOSED;
       this.actual.onSuccess(p0);
       this.a();
       return;
    }
}

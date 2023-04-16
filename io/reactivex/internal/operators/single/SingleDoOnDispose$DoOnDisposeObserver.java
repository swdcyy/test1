package io.reactivex.internal.operators.single.SingleDoOnDispose$DoOnDisposeObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class SingleDoOnDispose$DoOnDisposeObserver extends AtomicReference implements d0, b	// class@001461
{
    public final d0 actual;
    public b d;
    public static final long serialVersionUID = 0x88e0578d829b6e18;

    public void SingleDoOnDispose$DoOnDisposeObserver(d0 p0,a p1){
       super();
       this.actual = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       a andSet = this.getAndSet(null);
       if (andSet != null) {
          andSet.run();
          this.d.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}

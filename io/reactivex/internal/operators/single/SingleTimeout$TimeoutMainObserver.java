package io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver;
import brd.d0;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.e0;
import io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.util.concurrent.TimeoutException;

public final class SingleTimeout$TimeoutMainObserver extends AtomicReference implements d0, Runnable, b	// class@001476
{
    public final d0 actual;
    public final SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver fallback;
    public e0 other;
    public final AtomicReference task;
    public static final long serialVersionUID = 0x85380018ff2a7e;

    public void SingleTimeout$TimeoutMainObserver(d0 p0,e0 p1){
       super();
       this.actual = p0;
       this.other = p1;
       this.task = new AtomicReference();
       this.fallback = (p1 != null)? new SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver(p0): null;
       return;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
       DisposableHelper.dispose(this.task);
       SingleTimeout$TimeoutMainObserver tTimeoutMain = this.fallback;
       if (tTimeoutMain != null) {
          DisposableHelper.dispose(tTimeoutMain);
       }
       return;
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onError(Throwable p0){
       b uob = this.get();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (uob != dISPOSED && this.compareAndSet(uob, dISPOSED)) {
          DisposableHelper.dispose(this.task);
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       b uob = this.get();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (uob != dISPOSED && this.compareAndSet(uob, dISPOSED)) {
          DisposableHelper.dispose(this.task);
          this.actual.onSuccess(p0);
       }
       return;
    }
    public void run(){
       b uob = this.get();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (uob != dISPOSED && this.compareAndSet(uob, dISPOSED)) {
          if (uob != null) {
             uob.dispose();
          }
          SingleTimeout$TimeoutMainObserver tother = this.other;
          if (tother == null) {
             this.actual.onError(new TimeoutException());
          }else {
             this.other = null;
             tother.b(this.fallback);
          }
       }
       return;
    }
}
